package com.v2microrole.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.v2microrole.model.UserResponseModel;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name = "users-ws")
public interface UserServiceClient {

	@GetMapping("/users/role/{id}")
	@CircuitBreaker(name = "users-ws", fallbackMethod = "getAlbumsFallback")
	public List<UserResponseModel> getRole(@PathVariable String id);

	default List<UserResponseModel> getAlbumsFallback(String id, Throwable exception) {
		System.out.println("params+" + id);
		System.out.println("Exception took place" + exception.getMessage());
		return new ArrayList<>();
	}
}

package com.v2microrole.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v2microrole.model.UserResponseModel;
import com.v2microrole.service.RoleService;

@RestController
@RequestMapping("/apis")
public class FrontController {
	
	@Autowired
	RoleService roleservice;
	
	
	public FrontController(RoleService roleservice) {
		super();
		this.roleservice = roleservice;
	}

	@GetMapping("/roles")
	public String getParams() {
		return "listing";
	}
	
	@GetMapping("/rolebyuserid/{userId}")
	public List<UserResponseModel> getUserRoles(@PathVariable("userId") String userId) {
		return roleservice.getUserByUserId(userId, "Auth");
	}
}

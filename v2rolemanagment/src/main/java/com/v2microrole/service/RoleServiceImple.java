package com.v2microrole.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.v2microrole.data.UserServiceClient;
import com.v2microrole.model.UserResponseModel;

@Service
public class RoleServiceImple implements RoleService {

	UserServiceClient userserviceclient;
	
	
	public RoleServiceImple(UserServiceClient userserviceclient) {
		super();
		this.userserviceclient = userserviceclient;
	}


	@Override
	public List<UserResponseModel> getUserByUserId(String userId, String authorization) {
		// TODO Auto-generated method stub
		List<UserResponseModel> albumsList= userserviceclient.getRole(userId);
		return albumsList;
	}

}

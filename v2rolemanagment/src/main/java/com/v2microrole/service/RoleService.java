package com.v2microrole.service;

import java.util.List;

import com.v2microrole.model.UserResponseModel;

public interface RoleService {
	List<UserResponseModel> getUserByUserId(String userId, String authorization);
}

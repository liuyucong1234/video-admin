package com.lyc.service;

import com.lyc.pojo.Users;
import com.lyc.utils.PagedResult;

public interface UsersService {

	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);
	
}

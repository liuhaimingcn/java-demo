package com.haiyue.demo.mapper;


import com.haiyue.demo.models.User;

/**
 * @ Created by liuhaiming on 2017/5/25.
 */
public interface UserMapper {

	void addUser(User user);

	void updateUser(User user);

	void deleteUserById(String id);

	User getUserById(String id);
}
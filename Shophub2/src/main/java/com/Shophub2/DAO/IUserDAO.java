package com.Shophub2.DAO;

import java.util.List;

import com.Shophub2.Bean.User;

public interface IUserDAO {
	public String get(long userId);

	public List<User> getAll();

	public int add(User user);

	public long remove(User user);

	public int update(User user);

	public boolean contains(long userId, String userName);
	

}

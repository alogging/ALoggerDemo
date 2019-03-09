package net.ijiangtao.tech.alogging.alogger.manager.user;

import java.util.List;

import net.ijiangtao.tech.alogging.alogger.model.user.User;

/**
 * 
 * @author ijiangtao
 *
 */
public interface UserService {
	
	User saveUser(User user);

	boolean deleteUserById(Long id);

	boolean editUserInfo(User user);

	User getUserById(Long id);

	List<User> findAllUsers();

	List<User> findUsersByKeywords(String keyWords);
}
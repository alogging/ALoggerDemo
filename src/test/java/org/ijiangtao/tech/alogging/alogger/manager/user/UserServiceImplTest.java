package org.ijiangtao.tech.alogging.alogger.manager.user;

import org.ijiangtao.tech.alogging.alogger.model.user.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath*:*spring.xml"})
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		User user=new User();
		user.setUserName("test2223333");
		userService.saveUser(user);
		userService.findAllUsers();
	}

}

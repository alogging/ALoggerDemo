package org.ijiangtao.tech.alogging.alogger.manager.user;

import java.util.List;

import org.ijiangtao.tech.alogging.alogger.dao.user.UserMapper;
import org.ijiangtao.tech.alogging.alogger.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * User Service Implementation
 * 
 * @author LiJiangTao
 *
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id){
        User u=userMapper.selectByPrimaryKey(id);
        return u;
    }

    @Override
    public boolean deleteUserById(Long id){
        userMapper.removeByKey(id);
        return false;
    }

    @Override
    public User saveUser(User user){
        int saveResult = userMapper.save(user);
        if (1 != saveResult){
            throw new RuntimeException("[save user error]");
        }
        return user;
    }

    @Override
    public boolean editUserInfo(User user){
        return false;
    }

    @Override
    public List<User> findAllUsers(){
        return null;
    }

    @Override
    public List<User> findUsersByKeywords(String keyWords){
        return null;
    }

}

package org.ijiangtao.tech.alogging.alogger.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ijiangtao.tech.alogging.alogger.dao.base.BaseMapper;
import org.ijiangtao.tech.alogging.alogger.model.user.User;


/**
 * User DAO
 * 
 * @author ijiangtao
 *
 */
public interface UserMapper extends BaseMapper<User, Long> {

	/**
	 * 根据关键词模糊查询用户
	 * 
	 * @param keyWords
	 * @return
	 */
	public List<User> findUsersByKeyWords(String keyWords);

	/**
	 * 根据主键集合查询用户
	 * 
	 * @param idList
	 * @return
	 */
	public List<User> findUsersByKeys(@Param("ids") List<Long> idList);

}
package org.ijiangtao.tech.alogging.alogger.dao.base;

import java.util.List;

/**
 * 
 * @author LiJiangTao
 *
 * @param <T>
 *            Dao Model Type
 * @param <P>
 *            Primary Key Type
 */
public interface BaseMapper<T, P> {

	/**
	 * 新增一条记录
	 * 
	 * @param object
	 * @return
	 */
	int save(T object);

	/**
	 * 根据主键删除一条记录
	 * 
	 * @param key
	 * @return
	 */
	int removeByKey(P id);

	/**
	 * 更新一条记录
	 * 
	 * @param object
	 * @return
	 */
	int modify(T object);

	/**
	 * 根据主键查询一条记录
	 * 
	 * @param id
	 * @return
	 */
	T selectByPrimaryKey(P id);

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	List<T> findAll();

}

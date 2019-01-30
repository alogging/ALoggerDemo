package org.ijiangtao.tech.alogging.alogger.model.user;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -5244288298702801619L;

	private Long id;

	private String userName;

	private String sex;

	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

package com.pc.domain;

import java.util.Date;

/**
 * 用户Bean
 * 
 * @author Switch
 * @data 2016年10月11日
 * @version V1.0
 */
public class User {
	private Integer id;
	private String userName;
	private String password;
	private String sex;
	private String hobby;
	private Date birthday;

	// 无参构造方法
	public User() {
	}

	// 设置器和获取器
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", sex=" + sex + ", hobby="
				+ hobby + ", birthday=" + birthday + "]";
	}

}

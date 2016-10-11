package com.pc.service;

import com.pc.dao.UserDao;
import com.pc.domain.User;

/**
 * 用户服务类
 * 
 * @author Switch
 * @data 2016年10月11日
 * @version V1.0
 */
public class UserService {
	/**
	 * 注册服务
	 * @param user 用户
	 * @return 成功返回1，失败返回0
	 * @throws Exception 
	 */
	public int register(User user) {
		int isInsert = 1;
		try {
			// 如果存在该用户，则插入失败
			if(UserDao.userExist(user) != null) {
				isInsert = 0;
			} else {
				// 注册该用户
				isInsert = UserDao.register(user);
			}
		} catch (Exception e) {
			// 插入失败
			isInsert = 0;
			e.printStackTrace();
		}
		return isInsert;
	}
}

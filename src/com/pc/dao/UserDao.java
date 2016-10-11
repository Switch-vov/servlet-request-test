package com.pc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.pc.domain.User;
import com.pc.utils.C3P0Utils;

/**
 * 用户Dao
 * 
 * @author Switch
 * @data 2016年10月11日
 * @version V1.0
 */
public class UserDao {
	private static final ThreadLocal<QueryRunner> tLocalQueryRunner = new ThreadLocal<QueryRunner>() {
		@Override
		protected QueryRunner initialValue() {
			return new QueryRunner(C3P0Utils.getDataSource());
		}
	};

	public static User userExist(User user) throws Exception {
		String sql = "select * from user where userName=?";
		BeanHandler<User> beanHandler = new BeanHandler<>(User.class);
		Object[] params = { user.getUserName() };
		return tLocalQueryRunner.get().query(sql, beanHandler, params);
	}

	public static int register(User user) throws Exception {
		String sql = "insert into user values(null,?,?,?,?,?)";
		Object[] params = {user.getUserName(), user.getPassword(), user.getSex(), user.getHobby(), user.getBirthday()};
		return tLocalQueryRunner.get().update(sql, params);
	}

}

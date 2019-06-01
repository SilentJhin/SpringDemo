package com.itheima.utils;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0数据源工具类
 *
 */
public class C3P0Util {

	//定义一个数据源对象
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	//获取数据源
	public static DataSource getDataSource(){
		return ds;
	}
	
	//获取一个连接
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
}

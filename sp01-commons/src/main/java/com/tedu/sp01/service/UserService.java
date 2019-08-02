package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);//根据用户id获取订单信息
	void addScore(Integer id, Integer score);//加积分
}

package com.ssm.train.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.object.InputObject;
import com.ssm.object.OutputObject;
import com.ssm.train.dao.UserMapper;
import com.ssm.train.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper usermapper;
	@Override
	public void queryUserById(InputObject inputObject, OutputObject outputObject) throws Exception {
		Map<String,Object> user = usermapper.selectUser();
		
		outputObject.setBean(user);
		System.out.println(user);
	}

}

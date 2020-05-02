package com.cg.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Test;
import com.cg.dao.TestRepository;

public interface TestService {

	void setUdao(TestRepository udao);

	List<Test> viewTest();

	void addTest(Test test);

	void removeTest(int testid);

}
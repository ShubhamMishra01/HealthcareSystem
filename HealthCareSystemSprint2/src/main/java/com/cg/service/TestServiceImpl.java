 package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Test;
import com.cg.dao.TestRepository;

@Service
public class TestServiceImpl implements TestService
{
     @Autowired
     TestRepository udao;
 
	public void setUdao(TestRepository udao) { this.udao=udao; }
    
	@Transactional(readOnly=true)
     public List<Test> viewTest()
     {
    	 return udao.findAll();
     }
     
   
	@Transactional
     public void addTest(Test test)
     {
    	 udao.save(test);
     }
     
     @Transactional
     public void removeTest(int testid)
     {
    	  udao.deleteById(testid);
     }
}
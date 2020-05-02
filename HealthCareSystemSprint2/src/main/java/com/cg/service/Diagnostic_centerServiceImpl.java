package com.cg.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Diagnostic_center;
import com.cg.dao.Diagnostic_centerRepository;

@Service
public class Diagnostic_centerServiceImpl implements Diagnostic_centerService
{
     @Autowired
     Diagnostic_centerRepository udao;
 
	public void setUdao(Diagnostic_centerRepository udao) { this.udao=udao; }
    
	
	@Transactional(readOnly=true)
     public List<Diagnostic_center> viewDiagnostic_center()
     {
    	 return udao.findAll();
     }
     
     
	@Transactional
     public void addCenter(Diagnostic_center center )
     {
    	  udao.save(center);
     }
     
    
	@Transactional
     public void removeCenter(int centreid)
     {
    	  udao.deleteById(centreid);
     }
}
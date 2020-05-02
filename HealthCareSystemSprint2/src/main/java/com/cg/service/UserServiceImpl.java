package com.cg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Users;
import com.cg.dao.UserRepository;


@Service
public class UserServiceImpl implements UserService
{
     @Autowired
     UserRepository udao;
 
 
     
	@Override
	public void setUdao(UserRepository udao) { this.udao=udao; }
    
	

	@Transactional(readOnly=true)
    
     public Users viewUser(int userid)
     {
    	 return udao.findById(userid).get();
     }
     
    

	@Transactional(readOnly=true)
     public List<Users> viewUser()
     {
    	 return udao.findAll();
     }
    
    
    
	@Transactional
     public Users addUser(Users user)
     {
    	 return udao.save(user);
     }
     
    
    
	@Transactional
     public Users updateUser(Users u)
     {
    		Users ud=udao.findById(u.getUserid()).get();
    		if(ud!=null)
    		{
    			ud.setName(u.getName());
    			ud.setPassword(u.getPassword());
    			ud.setPhonenumber(u.getPhonenumber());
    			ud.setEmail(u.getEmail());
    			ud.setGender(u.getGender());
    			ud.setAge(u.getAge());
    		}
    		return udao.save(ud);
    	 
     }
     
   
    
	@Transactional
     public void deleteUser(int userid)
     {
    	  udao.deleteById(userid);
     }
	  
    
}

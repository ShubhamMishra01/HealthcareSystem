package com.cg.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Appointment;
import com.cg.bean.Test;
import com.cg.dao.AppointmentRepository;
import com.cg.dao.TestRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService
{
     @Autowired
     AppointmentRepository udao;
 
	public void setUdao(AppointmentRepository udao) { this.udao=udao; }
    
	
	@Transactional(readOnly=true)
     public Appointment viewAppointment(int appointment_id)
     {
    	 return udao.findById(appointment_id).get();
     }
     
     
	@Transactional(readOnly=true)
     public List<Appointment> viewAppointment()
     {
    	 return udao.findAll();
     }
   
	
	@Transactional
     public Appointment addAppointment(Appointment appointment)
     {
    	 return udao.save(appointment);
     }
     
    
	@Transactional
     public Appointment updateAppointment(Appointment a)
     {
    	 Appointment ud=udao.findById(a.getAppointmentid()).get();
    		if(ud!=null)
    		{
    			ud.setAppointmentstatus(a.getAppointmentstatus());
    			ud.setDatetime(a.getDatetime());
    		}
    		return udao.save(ud);
     }
}

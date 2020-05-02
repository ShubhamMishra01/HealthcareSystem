package com.cg.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Appointment;
import com.cg.bean.Diagnostic_center;
import com.cg.bean.Test;
import com.cg.bean.Users;
import com.cg.service.AppointmentService;
import com.cg.service.Diagnostic_centerService;
import com.cg.service.TestService;
import com.cg.service.UserServiceImpl;


@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200")

public class AdminController {
	
	 @Autowired
	 AppointmentService appointmentservice;
	 
	 @Autowired
	 Diagnostic_centerService Diagnostic_centerservice;
	 
	 @Autowired
     TestService testservice;
	 
	 
	 @PutMapping("/approveAppointment")
     public Appointment updateAppoinment(@RequestBody Appointment appointment)
     {
    	 return appointmentservice.updateAppointment(appointment);
     }
	 
	
	 @GetMapping(value="/getAppointment/{appointmentid}",produces="application/json")
	     public Appointment viewAppointment(@PathVariable int appointmentid)
	     {
	    	 return appointmentservice.viewAppointment(appointmentid);
	     }
	     

	     @GetMapping(value="/getAllAppointments",produces="application/json")
	     public List<Appointment> viewAppointment()
	     {
	    	 return appointmentservice.viewAppointment();
	     }
	    
		 /*
		 @GetMapping(value="/getUser/{userid}",produces="application/json")
		     public Userdata viewUser(@PathVariable int userid)
		     {
		    	 return userservice.viewUser(userid);
		     }*/
		     
	     
		     @PostMapping(value="/addCenter")
		     public String addCenter(@RequestBody()Diagnostic_center center)
		     {
		    	 Diagnostic_centerservice.addCenter(center);
		    	 return "Center added";	 
		     }
		     
		     @GetMapping(value="/getAllCenters",produces="application/json")
		     public List<Diagnostic_center> viewDiagnostic_center()
		     {
		    	 return Diagnostic_centerservice.viewDiagnostic_center();
		     }
		     
		     @DeleteMapping("/removeCenter/{centreid}")
		     public String removeDiagnostic_center(@PathVariable int centreid)
		     {
		    	 Diagnostic_centerservice.removeCenter(centreid);
		    	 return "Diagnostic_center Details Removed";
		     }
		     
			     @PostMapping(value="/addTest")
			     public String addTest(@RequestBody()Test test)
			     {
			    	 testservice.addTest(test);
			    	 return "Test added";	 
			     }
			     
			     @GetMapping(value="/getAllTests",produces="application/json")
			     public List<Test> viewTest()
			     {
			    	 return testservice.viewTest();
			     }
			     
			     @DeleteMapping("/removeTest/{testid}")
			     public String removeTest(@PathVariable int testid)
			     {
			    	 testservice.removeTest(testid);
			    	 return "Test Details Removed";
			     }
} 




/*
@PutMapping("/updateUser")
public Userdata updateUser(@RequestBody Userdata user)
{
	 Userdata u=userservice.updateUser(user);
	 return u;
}*/ 


/*
@GetMapping(value="/getUser/{userid}",produces="application/json")
    public Userdata viewUser(@PathVariable int userid)
    {
   	 return userservice.viewUser(userid);
    }*/
    


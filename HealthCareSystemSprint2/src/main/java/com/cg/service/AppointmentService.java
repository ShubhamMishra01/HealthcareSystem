package com.cg.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Appointment;
import com.cg.dao.AppointmentRepository;

public interface AppointmentService {

	void setUdao(AppointmentRepository udao);

	Appointment viewAppointment(int appointmentid);

	List<Appointment> viewAppointment();

	Appointment addAppointment(Appointment appointment);

	Appointment updateAppointment(Appointment a);
	
}
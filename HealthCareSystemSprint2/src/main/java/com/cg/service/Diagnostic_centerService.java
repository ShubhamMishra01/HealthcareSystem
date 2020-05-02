package com.cg.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Diagnostic_center;
import com.cg.dao.Diagnostic_centerRepository;

public interface Diagnostic_centerService {

	void setUdao(Diagnostic_centerRepository udao);

	List<Diagnostic_center> viewDiagnostic_center();

	void addCenter(Diagnostic_center center);

	void removeCenter(int centreid);

}
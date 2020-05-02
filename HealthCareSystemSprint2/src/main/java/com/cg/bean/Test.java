package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Test")
public class Test {
	@Id
	@Column(name="testid")
	private int testid;
	@Column(name="testname")
	private String testname;
	
	/*
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="centreid",referencedColumnName="centreid")
	private Diagnostic_center diagnostic_center;
	*/
	

public int getTestid() {
	return testid;
}
public void setTestid(int testid) {
	this.testid = testid;
}
public String getTestname() {
	return testname;
}
public void setTestname(String testname) {
	this.testname = testname;
}
/*
public Diagnostic_center getDiagnostic_center() {
	return diagnostic_center;
}
public void setDiagnostic_center(Diagnostic_center diagnostic_center) {
	this.diagnostic_center = diagnostic_center;
}*/
}

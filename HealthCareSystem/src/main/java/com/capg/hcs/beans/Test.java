package com.capg.hcs.beans;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Test")
public class Test {
	@Id
	@Column(name="testId")
	private int testId;
	@Column(name="testName")
	private String testName;
	@Column(name="testPrice")
	private int testPrice;
	
	
	public Test() {
		super();
	}
	public Test(int testId, String testName, int testPrice) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testPrice = testPrice;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(int testPrice) {
		this.testPrice = testPrice;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", testPrice=" + testPrice + "]";
	}
	
	
}

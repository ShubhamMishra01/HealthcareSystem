package com.capg.hcs.beans;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")

public class Appointment {
	@Id
	@Column(name = "appointmentid")
	private int appointmentId;
	@Column(name = "appointmentStatus")
	private String appointmentStatus;
	@Column(name = "dateTime")
	private Date dateTime;
	@Column(name = "diagnosticCenter")
	private DiagnosticCenter diagnosticCenter;
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	public Appointment(int appointmentId, String appointmentStatus, Date dateTime, DiagnosticCenter diagnosticCenter) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentStatus = appointmentStatus;
		this.dateTime = dateTime;
		this.diagnosticCenter = diagnosticCenter;
	}
	public Appointment() {
		super();
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentStatus=" + appointmentStatus
				+ ", dateTime=" + dateTime + ", diagnosticCenter=" + diagnosticCenter + "]";
	}
	
	


}

package com.zk.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "employee_details")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class EmployeeInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (name = "emp_name")
	@NotNull
	private String empName;

	@Column (name = "emp_designation")
	@NotNull
	private String empDesignation;

	@Column (name = "salary")
	@NotNull
	private Double salary;

	@Column (name = "eamil_id")
	@NotNull
	private String emailId;

	@Column (name = "mobile_no")
	@NotNull
	private String mobileNo;

	@Column (name = "status")
	@NotNull
	private String status;

	@Column (name = "created_date")
	@NotNull
	private Date created_Date;

	@Column (name = "version")
	@NotNull
	private Integer versionNo;

	@Column (name = "gender")
	@NotNull
	private String gender;

	@Column (name = "emptype")
	@NotNull
	private String empType;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}
	
	public Integer getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(Integer versionNo) {
		this.versionNo = versionNo;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	
}

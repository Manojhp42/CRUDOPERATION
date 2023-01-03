package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employess")
public class EmployeeEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer employee_id;
	    
	    @Column(name = "name", nullable = false)
	    private String name;
	    
	    @Column(name = "location", nullable = false)
	    private String location;
	    
	    @Column(name = "email_access", nullable = false)
	    private String emailId;
	 
	    public EmployeeEntity() {
	  
	    }
	 
	    public EmployeeEntity(String name, String location, String emailId) {
	         this.name = name;
	         this.location = location;
	         this.emailId = emailId;
	    }
	 
	   
	        public Integer getEmployeeId() {
	        return employee_id;
	    }
	    public void setId(Integer employeeId) {
	        this.employee_id = employeeId;
	    }
	 
	   	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	   
	    public String getLocation() {
	        return location;
	    }
	    public void setLocation(String location) {
	        this.location = location;
	    }
	 
	   
	    public String getEmailId() {
	        return emailId;
	    }
	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }

	    @Override
	    public String toString() {
	        return "Employee [employeeId=" + employee_id + ", name=" + name + ", emailId=" + emailId
	       + "]";
	    }
	 
	}
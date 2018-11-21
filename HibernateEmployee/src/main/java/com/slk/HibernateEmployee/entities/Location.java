package com.slk.HibernateEmployee.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table(name="loc")
public class Location {
	
	@Id
	private int lcode;
	private String lname;
	
	@ManyToMany
	private List<Department> department;
	
	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public int getLcode() {
		return lcode;
	}
	
	public void setLcode(int lcode) {
		this.lcode = lcode;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Location [lcode=" + lcode + ", lname=" + lname + "]";
	}
	
	

}

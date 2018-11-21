package com.slk.HibernateEmployee.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	@ManyToMany
	private List<Department> department;
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public List<Department> getDepartment() {
		return department;
	}
	
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename +  "]";
	}
	
	
	
}

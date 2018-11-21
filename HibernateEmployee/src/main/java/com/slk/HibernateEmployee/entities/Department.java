package com.slk.HibernateEmployee.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Dept")
public class Department {
	
	@Id
	private int dno;
	private String dname;
	@ManyToMany
	private List<Location> location;
	
	public int getDno() {
		return dno;
	}
	
	public void setDno(int dno) {
		this.dno = dno;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public List<Location> getLocation() {
		return location;
	}
	
	public void setLocation(List<Location> location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname +  "]";
	}
	
	
	
	
	
	

}

package com.cg.placementmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
@Table(name="certificate")
public class Certificate {
@Id
@Column(name="certificate_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private int year;
private  College college;

@OneToOne(mappedBy="certificate")
private Student student;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}

	
}





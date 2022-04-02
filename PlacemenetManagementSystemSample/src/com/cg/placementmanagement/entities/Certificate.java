package com.cg.placementmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="certificate")
public class Certificate {
@Id
private int id;
private int year;
private College college;
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

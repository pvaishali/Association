package com.cg.placementmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="u_id")
private int id;
private String name;
private String type;
private String password;

@OneToOne(mappedBy="user")
private College college;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}

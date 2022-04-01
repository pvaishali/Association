package com.cg.placement.client;

import com.cg.placement.entities.Student;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) {
	// CRUD operation calling activity
	Student student = new Student();
	
	IStudentService service = new StudentServiceImpl();
	
	// Create
	student.setId(4);
	student.setName("vaishu");
	student.setRoll(49);
	student.setQualification("MS");
	student.setCourse("EC");
	student.setYear(2023);
	student.setCertificate("ST");
	student.setHallTicketNo(111);
	student.setCollege("Ranchi University");
	service.addStudent(student);
	
	// Retrieve
	
	student	= service.searchStudentById(1);
	System.out.println("ID is:"+student.getId());
	System.out.println("Roll is:"+student.getRoll());
	System.out.println("College is:"+student.getCollege());
	
	
	// Update
	student	= service.searchStudentById(1);
	student.setCollege("rv University");
	service.updateStudent(student);
	
	System.out.println("Update is successful");
	
	
	
/*	student	= service.searchStudentById(101);
	service.deleteStudent(student);
	System.out.println("Delete is successful");
	
	
	student	= service.searchStudentByHallTicket(111);
	service.deleteStudent(student);
	System.out.println("Delete is successful");
	
	*/
	
}
}

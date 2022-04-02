package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.Certificate;
import com.cg.placementmanagement.entities.Student;

public interface IStudentService {
	public Student addStudent(Student student);  
	public Student updateStudent(Student student);  
	public Student searchStudentById(int id);  

	public Student searchStudentByHallTicket(int id); 

	public Certificate addCertificate(Certificate certificate); 

	public Certificate updateCertificate(Certificate Certificate);


	public Student deleteStudent(Student student); 
}

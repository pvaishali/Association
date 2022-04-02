package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.Certificate;
import com.cg.placementmanagement.entities.Student;

public interface IStudentRepository {

	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public Student deleteStudent(Student student);
	
	public Certificate addCertificate(Certificate certificate);
	public Certificate  updateCertificate(Certificate certificate);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void deleteStudent(int id);
	
}

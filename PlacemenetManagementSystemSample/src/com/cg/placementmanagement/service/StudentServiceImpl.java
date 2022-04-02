package com.cg.placementmanagement.service;
import com.cg.placementmanagement.repository.IStudentRepository;
import com.cg.placementmanagement.repository.StudentRepositoryImpl;
import com.cg.placementmanagement.entities.Certificate;
import com.cg.placementmanagement.entities.Student;

public class StudentServiceImpl implements IStudentService{

	
		// Step 1: Establishing connection between Service and Repo
			private IStudentRepository dao;
			
			public StudentServiceImpl() 
			{
				dao = new StudentRepositoryImpl();
			}
			
			// Step 2: Service calls to perform CRUD Operation
	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTrasaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTrasaction();
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = dao.searchStudentById(hallTicketNo);
		return student;
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {

		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}
	

	@Override
	public Certificate updateCertificate(Certificate certificate) {

		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTrasaction();
		return certificate ;
	}

	@Override
	public Student deleteStudent(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.commitTrasaction();
		return student;
	}

}

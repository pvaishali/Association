package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entities.Certificate;
import com.cg.placementmanagement.entities.College;
import com.cg.placementmanagement.entities.Student;
import com.cg.placementmanagement.entities.User;
import com.cg.placementmanagement.service.CertificateServiceImpl;
import com.cg.placementmanagement.service.CollegeServiceImpl;
import com.cg.placementmanagement.service.ICertificateService;
import com.cg.placementmanagement.service.ICollegeService;
import com.cg.placementmanagement.service.IStudentService;
import com.cg.placementmanagement.service.IUserService;
import com.cg.placementmanagement.service.StudentServiceImpl;
import com.cg.placementmanagement.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		Student student=new Student();
		Certificate certificate=new Certificate();
		College college=new College();
		User user=new User();
		
		IStudentService service=new StudentServiceImpl();
		ICertificateService cservice=new CertificateServiceImpl();
		ICollegeService ccservice= new CollegeServiceImpl();
		IUserService uservice=new UserServiceImpl();
		
		student.setName("vaishu");
		student.setRoll(683);
		student.setQualification("BE");
		student.setCourse("CSE");
		student.setYear(21);
		student.setHallTicketNo(63);
		
		service.addStudent(student);
		
		certificate.setCollege(college);
		certificate.setYear(21);
		cservice.addCertificate(certificate);
		
	college.setCollegeName("RGIT");
		college.setLocation("Bangalore");
		ccservice.addCollege(college);
		
		user.setName("princi");
		user.setType("ug");
		user.setPassword("nmm");
		uservice.addnewUser(user);
		
		college.setCollegeAdmin(user);
		System.out.println("added");
		
	}
	}


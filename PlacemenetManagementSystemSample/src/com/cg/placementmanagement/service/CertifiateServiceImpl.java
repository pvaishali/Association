package com.cg.placementmanagement.service;
import com.cg.placementmanagement.entities.Certificate;
import com.cg.placementmanagement.repository.CertificateRepositoryImpl;
import com.cg.placementmanagement.repository.ICertificateRepository;

public class CertifiateServiceImpl implements ICertificateService {

	// Step 1: Establishing connection between Service and Repo
	private ICertificateRepository dao;
	public CertifiateServiceImpl()
	{
		dao= new CertificateRepositoryImpl();
	}
		
		// Step 2: Service calls to perform CRUD Operation
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
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate =dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		Certificate certificate =dao.searchCertificate(id);
		return certificate;
	}

	

}

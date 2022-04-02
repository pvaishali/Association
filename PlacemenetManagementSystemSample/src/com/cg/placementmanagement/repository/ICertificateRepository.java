package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.Certificate;

public interface ICertificateRepository {
	public Certificate  addCertificate(Certificate certificate);
	public Certificate  updateCertificate(Certificate certificate);
	public Certificate  searchCertificate(int id);
	
	public  abstract void beginTransaction();
	public  abstract void commitTrasaction();
	void deleteCertificate(int id);
	
}

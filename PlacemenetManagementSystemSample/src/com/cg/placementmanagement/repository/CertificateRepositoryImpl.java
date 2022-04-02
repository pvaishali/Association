package com.cg.placementmanagement.repository;

import javax.persistence.EntityManager;
import com.cg.placementmanagement.entities.Certificate;

public class CertificateRepositoryImpl  implements ICertificateRepository{
	//Step 1: Start JPA LifeCycle
			private EntityManager entityManager;
			public CertificateRepositoryImpl() 
			{
				entityManager = JPAUtil.getEntityManager();
			}
			// Create operation - Repo/DAO
	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate= entityManager.find(Certificate.class,id);
		return certificate;
	}

	@Override
	public void deleteCertificate(int id) {
		// TODO Auto-generated method stub
		Certificate certificate= entityManager.find(Certificate.class,id);
		entityManager.remove(certificate);	
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTrasaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();

}}

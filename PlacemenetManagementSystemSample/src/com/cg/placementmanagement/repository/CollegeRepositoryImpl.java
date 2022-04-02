package com.cg.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.placementmanagement.entities.College;


public class CollegeRepositoryImpl implements ICollegeRepository {

	//Step 1 : Start JPA Lifecycle
    private EntityManager entityManager;
    
	public CollegeRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
    
	//create operation - Repo/dao
	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class, id);
		return college;
	}

	@Override
	public boolean deleteCollege(int id) {
		College college = entityManager.find(College.class, id);
		entityManager.remove(college);
		return false;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

//	@Override
//	public boolean schedulePlacement(Placement placement) {
		//entityManager.persist(placement);
	//	return true;
	//}//

	

}

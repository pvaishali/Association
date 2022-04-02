package com.cg.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.placementmanagement.entities.Placement;

public class PlacementRepositoryImpl implements IPlacementRepository{
	 //Step 1: Start JPA LifeCycle
		private EntityManager entityManager;
		public PlacementRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		
		// Create operation - Repo/DAO
	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchCollegeByPlacementId(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		entityManager.remove(placement);
		return placement;
	}

	@Override
	public Placement addQualification(Placement placement) {
		// TODO Auto-generated method stub
				entityManager.persist(placement);
				return placement;	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTrasaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	@Override
	public void deleteplacement(int id) {
		// TODO Auto-generated method stub
		Placement placement = entityManager.find(Placement.class, id);
		entityManager.remove(placement);
	}

}

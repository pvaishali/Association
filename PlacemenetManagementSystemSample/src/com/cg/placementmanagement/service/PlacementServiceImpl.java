package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.Placement;
import com.cg.placementmanagement.repository.IPlacementRepository;
import com.cg.placementmanagement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl  implements IPlacementService{
	// Step 1: Establishing connection between Service and Repository
			private IPlacementRepository dao;
			
			public PlacementServiceImpl() 
			{
				dao = new PlacementRepositoryImpl();
			}
			
			// Step 2: Service calls to perform CRUD Operation
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTrasaction();
		return placement;	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTrasaction();
	     return placement;
	}

	@Override
	public Placement searchCollegeByPlacementId(int id) {
		Placement placement = dao.searchCollegeByPlacementId(id);
		return placement;
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		dao.beginTransaction();
		dao.deletePlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

	@Override
	public Placement addQualification(Placement placement) {
		dao.beginTransaction();
		dao.addQualification(placement);
		dao.commitTrasaction();
		return placement;
	}

}

package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.College;



public interface ICollegeRepository {
	public College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollege(int id);
    public boolean deleteCollege(int id);
    
    public abstract void beginTransaction();
    public abstract void commitTransaction();
	//public boolean schedulePlacement(Placement placement);
	
}

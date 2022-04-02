package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.College;


public interface ICollegeService {
	 public College addCollege(College college);
	    public College updateCollege(College college);
	    public College searchCollege(int id);
	    public Boolean deleteCollege(int id);
	//    public Boolean  schedulePlacement(Placement placement);
}

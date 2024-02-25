package com.driver;

public class Satellite {
	  private String id;
	    private double distanceFromEarth;

	    public Satellite(String id, double distanceFromEarth) {
	        // your code goes here
	    }

	    public String getId() {
	    	// your code goes here
	        return id;
	    }

	    public double getDistanceFromEarth() {
	    	// your code goes here
	        return distanceFromEarth;
	    }

	    @Override
	    public String toString() {
	    	// your code goes here
	        return "Satellite [ID=" + id + ", DistanceFromEarth=" + distanceFromEarth + " km]";
	    }
}

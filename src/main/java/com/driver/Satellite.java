package com.driver;

public class Satellite {
	private String id;
	private double distanceFromEarth;

	public Satellite(String id, double distanceFromEarth) {
		this.id = id;
		this.distanceFromEarth = distanceFromEarth;
	}

	public String getId() {
		return id;
	}

	public double getDistanceFromEarth() {
		return distanceFromEarth;
	}

	@Override
	public String toString() {
		return "Satellite [ID=" + id + ", DistanceFromEarth=" + distanceFromEarth + " km]";
	}
}
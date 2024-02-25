package com.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observatory {
	private List<Satellite> satellites = new ArrayList<Satellite>();

	public void addSatellite(Satellite satellite) {
		satellites.add(satellite);
	}

	public boolean removeSatelliteById(String id) {
		Iterator<Satellite> iterator = satellites.iterator();
		while (iterator.hasNext()) {
			Satellite sat = iterator.next();
			if (sat.getId().equals(id)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	public List<Satellite> displaySatellites() {
		satellites.sort((a, b) -> Double.compare(a.getDistanceFromEarth(), b.getDistanceFromEarth()));
		return satellites;
	}
}
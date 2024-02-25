package com.driver;

import java.util.Scanner;

public class ObservatoryApp {
	public static void main(String[] args) {
        Observatory observatory = new Observatory();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of satellites:");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.println("Enter satellite ID and its distance from Earth (in km):");
            String id = scanner.next();
            double distance = scanner.nextDouble();
            observatory.addSatellite(new Satellite(id, distance));
        }

        System.out.println("Enter satellite ID to remove (or 'exit' to skip):");
        String removeId = scanner.next();
        if (!"exit".equalsIgnoreCase(removeId)) {
            observatory.removeSatelliteById(removeId);
        }

        System.out.println("Satellites in the observatory:");
        observatory.displaySatellites();
    }
}

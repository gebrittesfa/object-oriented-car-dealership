package com.pluralsight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    double minPrice;

    double maxPrice;

    public Dealership() {

    }


    List<Vehicle> allVehicles = DealerShipFileManager.readFile();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    List<Vehicle> getVehiclesByPrice(double minPrice , double MixPrice) {
        //double minPrice = 2995, MixPrice = 7000;
        List<Vehicle> byPrice = new LinkedList<>();
        for (Vehicle vehicle : allVehicles) {
            if (minPrice <= vehicle.getPrice() && MixPrice >= vehicle.getPrice()) {
                byPrice.add(vehicle);
            }
            ;
        }
        return byPrice;
    }

    List<Vehicle> getVehiclesByYear(int minYear , int MixYear) {
//        int minYear = 1995, MixYear = 2012;
        List<Vehicle> byYear = new LinkedList<>();
        for (Vehicle vehicle : allVehicles) {
            if (minYear <= vehicle.getYear() && MixYear >= vehicle.getYear()) {
                byYear.add(vehicle);
                System.out.println("Year is  " + byYear.toString());
            }
            ;
        }
        return byYear;
    }

    List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> byColor = new LinkedList<>();
        for (Vehicle vehicle : allVehicles) {
            if (color == vehicle.getColor()) {
                byColor.add(vehicle);
            };
        }
        return byColor;
    }

    List<Vehicle> getVehiclesByMileage(int minMile, int maxMile ) {
        List<Vehicle> byMile = new LinkedList<>();
        for (Vehicle vehicle : allVehicles) {
            if (minMile <= vehicle.getOdometer() && maxMile >= vehicle.getOdometer()) {
                byMile.add(vehicle);
            }
            ;
        }
        return byMile;
    }

    List<Vehicle> getVehiclesByType(String byTpye) {

        List<Vehicle> byType = new LinkedList<>();
        for (Vehicle vehicle : allVehicles) {
            if (byTpye == vehicle.getVehicleType()) {
                byType.add(vehicle);
                System.out.println("SUV is  " + byType.toString());
            }
            ;
        }
        return byType;
    }

    // Get all vehicles
    List<Vehicle> getAllVehicles() {
        for (Vehicle Vehicle : allVehicles) {
            System.out.println(Vehicle.toString());
        }
        return allVehicles;
    }

    public void addVehicle(Vehicle vehicle4) {
        System.out.println(vehicle4.toString());
        allVehicles.add(vehicle4);
    }

    public synchronized  void removeVehicle(String vehicleType) {
//        Iterator<Vehicle> vehicles = allVehicles.iterator();
//
//        while (vehicles.hasNext()) {
//            Vehicle vehicle = vehicles.next();
//            System.out.println("before " +  vehicle.toString());
//            if (10112 == vehicle.getVin())
//                vehicles.remove();
//            System.out.println("After " +  vehicle.toString());

            for (Vehicle vehicle : allVehicles) {
                if (vehicleType.equalsIgnoreCase(vehicle.getVehicleType())) {
                    allVehicles.remove(vehicle);
                }

            }
        }
    }




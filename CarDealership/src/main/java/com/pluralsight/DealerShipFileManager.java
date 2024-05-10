package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**/
public class DealerShipFileManager {

    public static List<Vehicle> readFile () {
            ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
            ArrayList<Dealership> inventory1 = new ArrayList<Dealership>();
            try {
                FileReader fileReader = new FileReader("inventory.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                bufferedReader.readLine();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split("\\|");
                    Dealership dealership = new Dealership(data[0],data[1], data[2]);
                    inventory1.add(dealership);
                    System.out.println(inventory1.toString());
                    Vehicle vehicle = new Vehicle(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2],
                            data[3], data[4], data[5], Integer.parseInt(data[6]), Double.parseDouble(data[7]));
                    inventory.add(vehicle);
                    System.out.println(inventory.toString());
                }
            } catch (IOException e) {
                System.out.println("Error found " + e.getMessage());
                e.printStackTrace();
            }
            return inventory;
        }
    }


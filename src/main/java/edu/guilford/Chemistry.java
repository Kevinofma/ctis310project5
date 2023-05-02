package edu.guilford;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Chemistry 
{
    public static void main( String[] args )
    {   
        // // create an array of 10 molecules
        // Molecule[] molecules = new Molecule[10];
        // // fill the array with 10 random molecules using a for loop
        // for (int i = 0; i < molecules.length; i++) {
        //     molecules[i] = new Molecule();
        // }

        // // Print out the unsorted array of molecules
        // System.out.println("Unsorted Array: ");
        // for (int i = 0; i < molecules.length; i++) {
        //     System.out.println(molecules[i].getName());
        // }

        // // Sort the array of molecules
        // Arrays.sort(molecules);

        // // Print out the sorted array of molecules
        // System.out.println("\nSorted Array: ");
        // for (int i = 0; i < molecules.length; i++) {
        //     System.out.println(molecules[i].getName());
        // }

        // create an array of 10 water molecules with random amounts of moles, store the amount of moles in an array
        Water[] water = new Water[10];
        double[] wMoles = new double[10];
        for (int i = 0; i < water.length; i++) {
            wMoles[i] = (Math.random() * 10);
            water[i] = new Water(wMoles[i]);
        }
        
        // print out the mass of each water molecule
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < water.length; i++) {
            System.out.println(wMoles[i] + " moles of water: " + water[i].calculateTotalMass(water[i].getMoles()) + " grams");
        }

        // sort the array of water molecules
        Arrays.sort(water);
        Arrays.sort(wMoles);

        // print out the mass of each water molecule
        System.out.println("\nSorted Array: ");
        for (int i = 0; i < water.length; i++) {
            System.out.println(wMoles[i] + " moles of water: " + water[i].calculateTotalMass(water[i].getMoles()) + " grams");
        }

        // create an array of 10 ethanol molecules with random amounts of moles, store the amount of moles in an array
        Ethanol[] ethanol = new Ethanol[10];
        double[] eMoles = new double[10];
        for (int i = 0; i < ethanol.length; i++) {
            eMoles[i] = (Math.random() * 10);
            ethanol[i] = new Ethanol(eMoles[i]);
        }

        // print out the mass of each ethanol molecule
        System.out.println("\nUnsorted Array: ");
        for (int i = 0; i < ethanol.length; i++) {
            System.out.println(eMoles[i] + " moles of ethanol: " + ethanol[i].calculateTotalMass(ethanol[i].getMoles()) + " grams");
        }

        // sort the array of ethanol molecules
        Arrays.sort(ethanol);
        Arrays.sort(eMoles);

        // print out the mass of each ethanol molecule
        System.out.println("\nSorted Array: ");
        for (int i = 0; i < ethanol.length; i++) {
            System.out.println(eMoles[i] + " moles of ethanol: " + ethanol[i].calculateTotalMass(ethanol[i].getMoles()) + " grams");
        }

        // create an array of 10 ammonia molecules with random amounts of moles, store the amount of moles in an array
        Ammonia[] ammonia = new Ammonia[10];
        double[] aMoles = new double[10];
        for (int i = 0; i < ammonia.length; i++) {
            aMoles[i] = (Math.random() * 10);
            ammonia[i] = new Ammonia(aMoles[i]);
        }

        // print out the mass of each ammonia molecule
        System.out.println("\nUnsorted Array: ");
        for (int i = 0; i < ammonia.length; i++) {
            System.out.println(aMoles[i] + " moles of ammonia: " + ammonia[i].calculateTotalMass(ammonia[i].getMoles()) + " grams");
        }

        // sort the array of ammonia molecules
        Arrays.sort(ammonia);
        Arrays.sort(aMoles);

        // print out the mass of each ammonia molecule
        System.out.println("\nSorted Array: ");
        for (int i = 0; i < ammonia.length; i++) {
            System.out.println(aMoles[i] + " moles of ammonia: " + ammonia[i].calculateTotalMass(ammonia[i].getMoles()) + " grams");
        }
        



    }
}

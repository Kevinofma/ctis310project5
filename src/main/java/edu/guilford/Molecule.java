package edu.guilford;

import java.util.ArrayList;

// public class Molecule implements Comparable<Molecule>{
public class Molecule extends ArrayList<Molecule>{
    //attributes
    private String name;
    private String formula;
    private double mass;
    protected double moles;

    //constructor
    public Molecule() {
        // choose a random molecule from 7 possible molecules
        String[] name = {"Water", "Ethanol", "Ammonia"};
        String[] formula = {"H2O","C2H6O", "NH3"};
        int random = (int) (Math.random() * 3);
        this.name = name[random];
        this.formula = formula[random];
        this.mass = calculateMass(formula[random]);
    }

    public Molecule(String name, String formula) {
        this.name = name;
        this.formula = formula;
        this.mass = calculateMass(formula);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public double getMass() {
        return mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double setMass(double mass) {
        this.mass = mass;
        return mass;
    }

    // Method that calculates the mass of a molecule from its formula, problem is that due to how it is coded. EX: molecules such as CH3OH need to be inputed as CH4O
    // molecules with double digit amounts of a certain atom also break the code EX: C10H20O10
    public double calculateMass(String formula) {
        double Cmass = 0;
        double Hmass = 0;
        double Omass = 0;
        double Nmass = 0;
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == 'C') {
                Cmass = Cmass + 12.011;
            } else if (formula.charAt(i) == 'H') {
                Hmass = Hmass + 1.008;
            } else if (formula.charAt(i) == 'O') {
                Omass = Omass + 15.999;
            } else if (formula.charAt(i) == 'N') {
                Nmass = Nmass + 14.007;
            } else if (Character.isDigit(formula.charAt(i))) {
                if (formula.charAt(i - 1) == 'C') {
                    Cmass = Cmass * Character.getNumericValue(formula.charAt(i));
                }
                if (formula.charAt(i - 1) == 'H') {
                    Hmass = Hmass * Character.getNumericValue(formula.charAt(i));
                }
                if (formula.charAt(i - 1) == 'O') {
                    Omass = Omass * Character.getNumericValue(formula.charAt(i));
                }
                if (formula.charAt(i - 1) == 'N') {
                    Nmass = Nmass * Character.getNumericValue(formula.charAt(i));
                }
            } else {
                System.out.println("Invalid formula. Please try again.");
            }
        }
        mass = Cmass + Hmass + Omass + Nmass;
        return mass;
    }

    //Method does the same as above but demonstrates polymorphism
    public double polymorphMass(String formula) {
        formula = this.getFormula();
        switch (formula) {
            case "H2O":
                mass = 18.015;
                break;
            case "C2H6O":
                mass = 46.069;
                break;
            case "NH3":
                mass = 17.031;
                break;
            default:
                mass = 0;
                break;
        }
        return mass;
    }

    // @Override
    // public int compareTo(Molecule other) {
    //     // sort the molecules by mass
    //     if (this.mass > other.mass) {
    //         return 1;
    //     } else if (this.mass < other.mass) {
    //         return -1;
    //     } else {
    //         return 0;
    //     }
    // }

}

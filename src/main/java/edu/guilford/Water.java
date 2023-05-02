package edu.guilford;

public class Water extends Molecule implements Comparable<Water>{

    double moles;

    public Water(double moles) {
        super("Water", "H2O");
        this.moles = moles;
    }

    public double getMoles() {
        return moles;
    }

    public void setMoles(double moles) {
        this.moles = moles;
    }

    //use the calculateMass method from Molecules to calculate the mass of water and then multiply it by the number of molecules
    public double calculateTotalMass(double moles) {
        double mass = super.calculateMass("H2O");
        mass = mass * moles;
        return mass;
    }
    
    @Override
    public int compareTo(Water other) {
        // sort the water molecules by the number of moles
        if (this.moles > other.moles) {
            return 1;
        } else if (this.moles < other.moles) {
            return -1;
        } else {
            return 0;
        }        
    }
}

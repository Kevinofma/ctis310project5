package edu.guilford;

public class Ethanol extends Molecule implements Comparable<Ethanol>{

    public double moles;

    public Ethanol(double moles) {
        super("Ethanol", "C2H6O");
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
        double mass = super.calculateMass("C2H6O");
        mass = mass * moles;
        return mass;
    }
    
    @Override
    public int compareTo(Ethanol other) {
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

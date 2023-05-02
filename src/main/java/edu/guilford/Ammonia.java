package edu.guilford;

public class Ammonia extends Molecule implements Comparable<Ammonia>{

    double moles;

    public Ammonia (double moles) {
        super("Ammonia", "NH3");
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
        double mass = super.calculateMass("NH3");
        mass = mass * moles;
        return mass;
    }
    
    @Override
    public int compareTo(Ammonia other) {
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

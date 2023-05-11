class Planet extends Body {
    boolean atmosphereDetected;     //new-variable

    Planet() {      //default constructor of the class
        atmosphereDetected = false;
    }

    //methods=================
    void setOrbits(Star orbits) {       //Method-Overwritting, because Star is in the same hierarchy of Body
        this.orbits = orbits;
    }
}
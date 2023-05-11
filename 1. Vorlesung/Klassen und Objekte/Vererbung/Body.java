import java.util.*;

class Body {
    long id;
    String name;
    Body orbits;
    Date explored;       //siehe java.uil.date

    //methods=================================
    Body getorbits() {
        return this.orbits;
    }

    void setOrbits(Body orbits) {
        this.orbits = orbits;
    }

    Date getExplored() {
        return this.explored;
    }

    void setExplored(Date explored) {
        this.explored = explored;
    }

    void setExplored() {        //method-overloading
        this.explored = new Date();
    }
}
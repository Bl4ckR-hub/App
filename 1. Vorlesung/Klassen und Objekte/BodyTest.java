class Body {
    long id;        //Instanzvariablen
    String name;
    Body orbits;        //Referenz auf ein Objekt der gleichen Klasse
    static long nextID = 0;     //Eine Instanz der Variable für alle Objekte -> kein Teil des Objekts

    //constructors-----------------------------------------
    Body() {     //default-Konstruktor
        id = updateNextID;
    }

    Body(String name) {
        this();
        this.name = name;
        this.orbits = null;
    }

    //full-constructor
    Body(String name, Body orbits) {
        this(name);
        this.orbits = orbits;
    }

    static long updateNextID() {        //Klassenmethode zum Updaten der statischen Varibale nextID
        return nextID++;
    }
}

//Erzeugen von Objekten

public class BodyTest {
    public static void main(String[] args) {
        Body sun, earth;

        sun = new Body();       //call default constructor and set values by yourself
        sun.name = "Sol";
        sun.orbits = null;

        earth = new Body("Earth", sun);     //let the full-constructor do it
    }
}
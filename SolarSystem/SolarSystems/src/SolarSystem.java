/* By: Chester Descallar 978050
In my previous coursework (Last Biscuit), I repeated lines code of twice, one block for the first player
copied that and did the same for the second player, this made the code lengthy and more difficult to read
and the code was also very inefficient.

In this coursework, I have improved this by using classes and methods to ensure that lines of codes
are not repeated, instead I have used OOP which means I can make an object from a class
and call methods for that object. This makes the program more efficient and readable.

A Solar System class that contains a constructor that allows the user to set a name and luminosity
and a methods that does actions
 */
import java.util.ArrayList;
import java.lang.Math;

public class SolarSystem
{
    //Declaring the fields to be used in this class
    private String name;
    private double luminosity;
    /* Array that is created using the Planet class allowing for planets (containing its fields)
    to be stored in one place
    */
    private ArrayList<Planets> planetsList = new ArrayList<>();

    //Constants to be used checking whether a planet is 'potentially habitable'
    private final double LEAST_HABITABLE_MASS = 0.6;
    private final double MOST_HABITABLE_MASS = 7.0;
    private final double LEAST_HABITABLE_DISTANCE = 0.75;
    private final double MOST_HABITABLE_DISTANCE = 2.0;

    //Constructor to 'make' a solar system object
    public SolarSystem (String name, double luminosity)
    {
        setSystemName(name);
        setLuminosity(luminosity);
    }

    //Set the name of the solar system
    public void setSystemName(String name)
    {
        this.name = name;
    }

    //Get the name of the solar system
    public String getName()
    {
        return name;
    }

    //Sets the luminosity of the solar system
    public void setLuminosity (double luminosity)
    {
        this.luminosity = luminosity;
    }

    //Get the luminosity of the solar system
    public double getLuminosity()
    {
        return luminosity;
    }

    /* Method that adds a new planet that is created using the planet class into the array planetList
    which is in this class
    */
    public void addPlanet (String planetName, double planetMass, double planetDistance)
    {
        planetsList.add(new Planets(planetName, planetMass, planetDistance));

    }


    /* toString method that formats the way the class can be outputted when using the method so that it can
         easily be read.*/
    public String toString()
    {
        String habitable;
        String theSolarSystem = (getName() + "\n");

        /*A For loop that finds whether the current planet in the ArrayList 'planetsList' is habitable or not
        and then adds the planet(name, mass, distance, orbital period) as well as the habitability onto the string
        'theSolarSystem which gets returned when the method is called.
         */
        for (Planets eachPlanet : planetsList)
        {
            /* Checks whether a planet is habitable or not by comparing it to a set of constants that determines
            the planet's habitability.
            */
            if ((eachPlanet.getMass() >= LEAST_HABITABLE_MASS && eachPlanet.getMass() <= MOST_HABITABLE_MASS) &&
                    (eachPlanet.getDistance() >= LEAST_HABITABLE_DISTANCE * Math.sqrt(getLuminosity())
                        && (eachPlanet.getDistance() <= MOST_HABITABLE_DISTANCE * Math.sqrt(getLuminosity()))))
            {
                habitable = "yes";
            }
            else
            {
                habitable = "no";
            }

            /* Adds the planet and whether its habitability onto the string so that the string prints out
            the Solar System's name, all the planets in the ArrayList of that solar system and whether it is
            habitable or not.
            */
            theSolarSystem += eachPlanet + habitable + "\n" ;
        }
        return (theSolarSystem);
    }

}



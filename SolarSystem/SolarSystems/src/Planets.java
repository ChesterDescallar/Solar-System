/* By: Chester Descallar 978050
In my previous coursework (Last Biscuit), I repeated lines code of twice, one block for the first player
copied that and did the same for the second player, this made the code lengthy and more difficult to read
and the code was also very inefficient.

In this coursework, I have improved this by using classes and methods to ensure that lines of codes
are not repeated, instead I have used OOP which means I can make an object from a class
and call methods for that object. This makes the program more efficient and readable.

A Planets class that contains a constructor that allows the user to set the planet's name, mass and distance
and it also contains method doing specific actions

 */
import java.lang.Math;
import java.text.DecimalFormat;
public class Planets
{
    //Declaring the fields to be used in this class
    private String name;
    private double mass;
    private double distance;

    //format that is used to output 'doubles' such as the mass and distance
    private final DecimalFormat DF = new DecimalFormat("0.0##");


    //Constructor to 'make' a planet object
    public Planets (String name, double mass, double distance)
    {
        setPlanet(name, mass, distance);
    }

    //Sets the planets using other methods which collects data that can be inputted in the fields
    public void setPlanet (String name, double mass, double distance)
    {

        setName(name);
        setMass(mass);
        setDistance(distance);
        getOrbitalPeriod();

    }

    //Method to set the name of the planet
    public void setName(String name)
    {
        this.name = name;
    }
    //Method to get the name of the planet
    public String getName()
    {
        return name;
    }

    //Method to set the mass of the planet
    public  void setMass(double mass)
    {
        this.mass = mass;
    }

    // Method to get the mass of the planet
    public double getMass()
    {
        return mass;
    }

    //Method to set the distance of the planet
    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    //Method to get the distance of the planet
    public double getDistance()
    {
        return distance;
    }

    // Method to get the orbital period of the planet using the distance that is inputted.
    public double getOrbitalPeriod()
    {
        double period = Math.sqrt(distance * distance * distance);
        return period;
    }

    /* toString method that formats the way the class can be outputted when using the method so that it can
     easily be read.*/
    public String toString()
    {
        return ("Planet " + getName() + " has a mass of "+ DF.format(getMass()) + " Earths, is "
                + DF.format(getDistance()) + "AU from its star, " +
                "and orbits in " + DF.format(getOrbitalPeriod()) + " years: could be habitable? ");

    }

}

public class mainSolarSystem
{
    public static void main (String[] args)
    {
        SolarSystem ourSystem = new SolarSystem("Our System",1.0);

        //Add planets in our solar system
        ourSystem.addPlanet("Mercury", 0.055, 0.387);
        ourSystem.addPlanet("Venus", 0.815, 0.723);
        ourSystem.addPlanet("Earth", 1.0, 1.0);
        ourSystem.addPlanet("Mars", 0.107, 1.52);

        System.out.println(ourSystem.toString());
    }


}

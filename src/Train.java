public class Train extends Vehicle
{
    private int stops;

    public Train(String name, int wheels, int stops)
    {
        super(name, wheels);
        this.stops = stops;
    }

    public int getStops()
    {
        return stops;
    }

    // public methods (aka behaviors)
    public void makeAnAnnouncement(String nextStop)
    {
        // write some code here to honk, etc.
        System.out.println("The next stop is " + nextStop + ".");
    }

    public void closeDoors()
    {
        // write some code here to lock doors, etc.
        System.out.println("Stand clear of the closing doors, please.");
    }
}

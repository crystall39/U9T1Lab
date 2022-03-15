public class Bicycle extends Vehicle
{
    private int gearCount;

    public Bicycle(String name, int wheels, int gears)
    {
        super(name, wheels);
        gearCount = gears;
    }

    public int getGearCount()
    {
        return gearCount;
    }

    // public methods (aka behaviors)
    public void ring()
    {
        // write some code here to honk, etc.
        System.out.println("Ring ring! Comin' through!");
    }

    public void lockBike()
    {
        // write some code here to lock doors, etc.
        System.out.println("Locked! Don't tell anyone the combination!");
    }
}

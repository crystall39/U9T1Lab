public class VehicleRunner
{
    public static void main(String[] args)
    {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        System.out.println("-------------------------------");

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        System.out.println("-------------------------------");

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object

        Bicycle myBicycle = new Bicycle("Citi Bike", 2, 3);
        System.out.println(myBicycle.getName());
        System.out.println(myBicycle.getWheels());
        System.out.println(myBicycle.getGearCount());
        myBicycle.move(30);
        myBicycle.turn(-90);
        myBicycle.brake(0.50);
        myBicycle.ring();
        myBicycle.lockBike();

        /*
        myVehicle.ringBell();                          //line 1
        System.out.println(myVehicle.getGearCount());  //line 2
        myCar.ringBell();                              //line 3
        myBike.honk();                                 //line 4
        myBike.lockDoors();
        */

        System.out.println("-------------------------------");

        // ---- WRITE MORE TEST CODE BELOW! ----
        // testing all available methods on a Train object

        Train myTrain = new Train("MTA F Train", 64, 10);
        System.out.println(myTrain.getName());
        System.out.println(myTrain.getWheels());
        System.out.println(myTrain.getStops());
        myTrain.move(30);
        myTrain.turn(-90);
        myTrain.brake(0.50);
        myTrain.makeAnAnnouncement("Jay Street - Metrotech");
        myTrain.closeDoors();




    }
}
package singleton;

public class Driver {

    // Achieve singleton design patter fot the Driver Object

    private static Driver driver; // declaration
    Driver(){}

    public static Driver getDriver(){
        if(driver == null) driver = new Driver();
        return driver;
    }
}

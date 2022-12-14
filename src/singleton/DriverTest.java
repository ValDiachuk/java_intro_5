package singleton;

public class DriverTest {
    public static void main(String[] args) {

        Driver d1 =  Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}

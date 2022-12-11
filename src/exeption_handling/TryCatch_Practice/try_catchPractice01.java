package exeption_handling.TryCatch_Practice;

import utilities.ScannerHelper;

public class try_catchPractice01 {
    public static void main(String[] args) {


        String name = ScannerHelper.getAName();

        try{
            System.out.println(name.charAt(3));
        }
        catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Hello " + name);
    }
}

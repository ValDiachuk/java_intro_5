package conditional_statements.if_else_statements;

import java.util.Scanner;

public class PresentationExample {

    public static void main(String[] args) {

            int age;
            Scanner scanner= new Scanner(System.in);
            System.out.println(" Please Enter you Age: ");
            age = scanner.nextInt();

            if (age < 18) {
                System.out.println("You are Minor.");
                System.out.println("You are Not Eligible to Work");
            }
            else  {
                if (age >= 18 && age <= 60 )  {
                    System.out.println("You are Eligible to Work");
                    System.out.println("Please fill in your details and apply");
                }
                else  {
                    System.out.println("You are too old to work as per the Government rules");
                    System.out.println("Please Collect your pension!");
                }
            }
            System.out.println("\nThis Message is coming from Outside the IF ELSE STATEMENT");
        }
    }







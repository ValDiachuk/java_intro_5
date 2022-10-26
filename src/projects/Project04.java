package projects;

import java.util.Random;
import java.util.Scanner;
public class Project04 {
    public static void main(String[] args) {

        System.out.println("\n==========TASK-1==========\n");


        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Please enter a string:");
        str = scanner.nextLine();

        if (str.length() >= 8) {
            if (str.length() % 2 == 0) {
                System.out.println(str.substring(str.length() - 4) +
                        (str.substring(str.length() / 2 - 1, str.length() / 2 + 1)) + (str.substring(0, 4)));
            } else {
                System.out.println(str.substring(str.length() - 4) +
                        str.charAt(str.length() / 2) + (str.substring(0, 4)));
            }
        } else {
            System.out.println("This String does not have 8 characters");
        }

        System.out.println("\n==========TASK-2==========\n");

        System.out.println("Please enter a string:");
        String s = scanner.nextLine();
        String s1 = s.substring(26, 30);
        String s2 = s.substring(0, 8);

        System.out.println(s1 + " " + s2);

        System.out.println("\n==========TASK-3==========\n");
        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        str1 = str1.replace("stupid", "nice");
        str2 = str2.replace("idiot", "nice");
        str3 = str3.replace("stupid", "nice");
        str3 = str3.replace("idiot", "nice");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("\n==========TASK-4==========\n");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        if (name.length() > 2) {
            if (name.length() % 2 == 0) {
                System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
            } else {
                System.out.println((name.charAt(name.length() / 2)));
            }
        } else {
            System.out.println("Invalid input!!!");
        }

        System.out.println("\n==========TASK-5==========\n");

        System.out.println("Please enter a country:");
        String country = scanner.nextLine();
        if (country.length() < 5) {
            System.out.println("Invalid input");
        } else {
            System.out.println(country.substring(2, country.length() - 2));
        }
        System.out.println("\n==========TASK-6==========\n");

        System.out.println("Please enter your address");
        String address = scanner.nextLine();
        System.out.println(address.replace('a', '*').replace('e', '#')
                .replace('i', '+').replace('u', '$').
                replace('o', '@').replace('A', '*').replace('E', '#')
                .replace('I', '+').replace('U', '$').
                replace('O', '@'));

        System.out.println("\n==========TASK-7==========\n");

        Random random = new Random();

        int randomNumber1 = random.nextInt(25) + 1;
        int randomNumber2 = random.nextInt(25) + 1;
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        for (int i = Math.min(randomNumber1, randomNumber2); i <= Math.max(randomNumber1, randomNumber2); i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }

            System.out.println("\n==========TASK-8==========\n");

            System.out.println("Please enter a sentence");
            String sentence = scanner.nextLine();
            int count = 0;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') count++;
            }
            System.out.println("This sentence has " + count + 1 + " words");

            System.out.println("\n==========TASK-9==========\n");

            System.out.println("Please enter a positive number");
            int number = scanner.nextInt();

            for (int j = 1; j < number; i++) {
                if (j % 6 == 0) System.out.println("FooBar");
                else if (j % 3 == 0) System.out.println("Bar");
                else if (j % 2 == 0) System.out.println("Foo");
                else System.out.println(i);
            }

            System.out.println("\n==========TASK-10==========\n");

            System.out.println("Please enter a word");
            String word = "", reverseWord = "";
            word = scanner.nextLine();

            int strLength = word.length();

            for (int a = (strLength - 1); a >= 0; --i) {
                reverseWord = reverseWord + word.charAt(a);
            }

            if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
                System.out.println("This word is a Palindrome ");
            } else {
                System.out.println("This word is not a Palindrome ");
            }
            System.out.println("\n==========TASK-11==========\n");
            System.out.println("Please enter a sentence");
            String st = "";
            st = scanner.nextLine();

            int counter1 = 0;
            int counter2 = 0;

            for (int j = 0; j < st.length(); j++) {

                if (st.length() == 0) {
                    System.out.println("This sentence does not have any characters");
                } else if (st.charAt(i) == 'a') {
                    counter1++;
                } else if (st.charAt(i) == 'A') {
                    counter2++;
                }
                System.out.println("This sentence has " + (counter1 + counter2) + " a or A letters");
            }
        }
    }
}

















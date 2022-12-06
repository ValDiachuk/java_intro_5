package homeworks;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n**********Task-1**********\n");
        String str1 = "    Hello    ";
        System.out.println(noSpace(str1));

        System.out.println("\n**********Task-2**********\n");
        String str2 = "Hello";
        System.out.println(replaceFirstLast(str2));

        System.out.println("\n**********Task-3**********\n");
        String str3 = "Java";
        System.out.println(hasVowel(str3));

    }

    public static String noSpace(String str1) {
        str1 = str1.replaceAll("\\s", "");
        return str1;
    }

    public static String replaceFirstLast(String str2){

        if(str2.length() < 2){
            return "";
        }else {
            StringBuilder newString = new StringBuilder(str2);
            char first = newString.charAt(0);
            newString.setCharAt(0, newString.charAt(newString.length() - 1));
            newString.setCharAt(newString.length() - 1, first);
            return newString.toString();
        }
    }
    public static boolean hasVowel (String str3){

        return str3.contains("a") || str3.contains("e") || str3.contains("o")  || str3.contains("u") || str3.equalsIgnoreCase("I");
    }


}


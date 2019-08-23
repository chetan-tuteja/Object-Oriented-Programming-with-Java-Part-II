
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a string: ");
        String in = reader.nextLine();
        //allVowels(in);
        //isAWeekDay(in);
        clockTime(in);
        //temp(in);

    }

    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }

    public static boolean allVowels(String string) {
        if (string.matches("(a|i|e|o|u|ä|ö)+(|a|i|e|o|u|ä|ö)*")) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }

    public static boolean clockTime(String string) {
        boolean temp = false, temp2 = false, temp3 = false;
        String[] parts = string.split(":");

        if (parts.length < 3) {
            System.out.println("The form is wrong.");
            return false;
        }

        if (parts[0].matches("(0|1)[0-9]") || parts[0].matches("2[0-3]")) {
            temp = true;
        }
        if (parts[1].matches("([0-5])[0-9]")) {
            temp2 = true;
        }
        if (parts[2].matches("([0-5])[0-9]")) {
            temp3 = true;
        }
        if (temp && temp2 && temp3) {
            System.out.println("The form is fine");
            return temp;
        } else {
            System.out.println("The form is wrong.");
            return false;
        }
    }

}


public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Mikael");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");

    }

    private static void printWithSmileys(String characterString) {
        int len = characterString.length();
        if (len >= 5) {
            rows(6);
        } else {
            rows(5);
        }
        if (len % 2 == 0) {
            System.out.println("");
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println("");
            System.out.println(":) " + characterString + "  :)");
        }
        if (len >= 5) {
            rows(6);
        } else {
            rows(5);
        }

    }

    private static void rows(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(":)");
        }
    }

}

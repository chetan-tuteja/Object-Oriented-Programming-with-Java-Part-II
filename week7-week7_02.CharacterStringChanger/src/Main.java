
public class Main {

    public static void main(String[] args) {
        // Test your program here
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('a', 'b'));
        scandiesAway.addChange(new Change('r', 'x'));
        System.out.println(scandiesAway.change("carrot"));
    }
}

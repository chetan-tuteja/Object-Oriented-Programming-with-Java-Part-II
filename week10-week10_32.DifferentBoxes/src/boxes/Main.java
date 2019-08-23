package boxes;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        
        Box box = new OneThingBox();
        System.out.println(box.isInTheBox(new Thing("a")));
    }
}

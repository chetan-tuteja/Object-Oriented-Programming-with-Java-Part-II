package farmsimulator;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        Cow cow1 = new Cow("Cow 1");
        cow1.liveHour();
        BulkTank m = new BulkTank();
        Barn nav = new Barn(m);
        nav.installMilkingRobot(new MilkingRobot());
        nav.takeCareOf(cow1);
    }
}

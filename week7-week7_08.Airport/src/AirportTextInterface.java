/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.Scanner;

public class AirportTextInterface {

    private Scanner reader;
    private AirplaneDatabase airplaneDatabase;
    private FlightDatabase flightDatabase;

    public AirportTextInterface(Scanner reader) {
        this.reader = reader;
        this.airplaneDatabase = new AirplaneDatabase();
        this.flightDatabase = new FlightDatabase();
    }

    public void start() {
        this.airportPanel();

        while (true) {
            this.airportPanelOperations();
            String command = reader.nextLine();
            if (command.equals("x")) {
                flightUI();
                break;
            } else if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            }
        }

    }

    public void flightUI() {
        this.flightPanel();

        while (true) {
            this.flightPanelOperations();
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                planeInfo();
            }
        }
    }

    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
    }

    private void airportPanelOperations() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.println("> ");
    }

    private void flightPanel() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
    }

    private void flightPanelOperations() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.println("> ");
    }

    private void addAirplane() {
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.println("Give plane capacity: ");
        int planeCap = Integer.parseInt(reader.nextLine());

        airplaneDatabase.addAirplaneToDatabase(new Airplane(planeID, planeCap));
    }

    private void addFlight() {
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.println("Give departure airport code: ");
        String depCode = reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destCode = reader.nextLine();

        Airplane temp = airplaneDatabase.retAirplane(planeID);
        flightDatabase.addFlightToDatabase(new Flight(temp, depCode, destCode));
    }

    private void printPlanes() {
        airplaneDatabase.printPlanes();
    }

    private void printFlights() {
        flightDatabase.printFlights();
    }

    private void planeInfo() {
        System.out.println("Give plane ID: ");
        String planeId = reader.nextLine();
        airplaneDatabase.planeInfo(planeId);
    }
}

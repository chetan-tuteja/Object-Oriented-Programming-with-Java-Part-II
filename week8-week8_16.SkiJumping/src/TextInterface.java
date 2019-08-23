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

public class TextInterface {

    private Scanner reader;
    private ParticipantDatabase database;
    private int counter;

    public TextInterface(Scanner reader) {
        this.reader = reader;
        this.database = new ParticipantDatabase();
        this.counter = 1;
    }

    public void start() {
        this.openingText();

        while (true) {
            System.out.println("  Participant name: ");
            String command = reader.nextLine();
            if (command.equals("")) {
                jumpingPhase();
                break;
            } else {
                addParticipant(command);
            }
        }
    }

    private void jumpingPhase() {
        this.jumpingOpeningText();

        while (true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            if (command.equalsIgnoreCase("jump")) {
                jumpingProcess();
                this.counter++;
            } else {
                finalResults();
                break;
            }
        }
    }

    private void finalResults() {
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        this.database.printEndResults();
    }

    private void jumpingProcess() {
        System.out.println("");
        System.out.println("Round " + this.counter);
        System.out.println("");
        System.out.println("Jumping order:");
        this.database.printAll();
        System.out.println("Results of round " + this.counter);
        this.database.printJumpResults();

    }

    private void openingText() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }

    private void jumpingOpeningText() {
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
    }

    private void addParticipant(String name) {
        this.database.addNew(new Participant(name));
    }

}

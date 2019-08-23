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

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        this.statement();

        while (true) {
            System.out.println("Statement: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("translate")) {
                this.translation();
            } else {
                System.out.println("Unknown Statement");
            }
        }
    }

    private void statement() {
        System.out.println("Statement:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
    }

    private void add() {
        System.out.println("In Finnish: ");
        String word = reader.nextLine();
        System.out.println("Translation: ");
        String trans = reader.nextLine();
        this.dictionary.add(word, trans);
    }

    private void translation() {
        System.out.println("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }
}

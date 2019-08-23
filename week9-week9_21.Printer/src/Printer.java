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
import java.io.File;

public class Printer {

    private String filename;

    public Printer(String filename) throws Exception {
        this.filename = filename;
    }

    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(new File(this.filename));
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            } else if (word.isEmpty()) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}

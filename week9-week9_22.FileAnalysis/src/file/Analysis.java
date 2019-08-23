/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Chetan Tuteja
 */
public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        Scanner reader = new Scanner(this.file);
        int total = 0;
        while (reader.hasNextLine()) {
            String word = reader.nextLine();
            total++;
        }
        reader.close();
        return total;
    }

    public int characters() throws Exception {
        Scanner reader = new Scanner(this.file);
        int total = 0;
        while (reader.hasNextLine()) {
            String word = reader.nextLine();
            if (word.contains("")) {
                total++;
            }
            total += word.length();
        }
        reader.close();
        return total;
    }
}

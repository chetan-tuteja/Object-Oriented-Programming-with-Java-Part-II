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

public class Reader {

    private Scanner reader;

    public Reader() {
        this.reader = new Scanner(System.in);
    }

    public String readString() {
        String ret = reader.nextLine();
        return ret;
    }

    public int readInteger() {
        int ret = Integer.parseInt(reader.nextLine());
        return ret;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

/**
 *
 * @author Chetan Tuteja
 */
public class WordInspection {

    private File file;
    private ArrayList<String> list;

    public WordInspection(File file) throws Exception {
        this.file = file;
        this.list = new ArrayList<String>();

        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            this.list.add(line);
        }
    }

    public int wordCount() {
        return this.list.size();
    }

    public List<String> wordsContainingZ() {
        List<String> ret = new ArrayList<String>();
        for (String i : this.list) {
            if (i.contains("z")) {
                ret.add(i);
            }
        }
        return ret;
    }

    public List<String> wordsEndingInL() {
        List<String> ret = new ArrayList<String>();
        for (String i : this.list) {
            if (i.endsWith("l")) {
                ret.add(i);
            }
        }
        return ret;
    }

    public List<String> palindromes() {
        List<String> ret = new ArrayList<String>();
        for (String i : this.list) {
            if (checkPalindrome(i)) {
                ret.add(i);
            }
        }
        return ret;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> ret = new ArrayList<String>();
        for (String i : this.list) {
            if (checkVowels(i)) {
                ret.add(i);
            }
        }
        return ret;
    }

    private boolean checkPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            return true;
        }
        return false;
    }

    private boolean checkVowels(String word) {
        if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
            return true;
        }
        return false;
    }
}

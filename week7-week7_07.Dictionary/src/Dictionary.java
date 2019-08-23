/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> hash;

    public Dictionary() {
        this.hash = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        this.hash.put(word, translation);
    }

    public String translate(String word) {
        return this.hash.get(word);
    }

    public int amountOfWords() {
        return this.hash.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> ret = new ArrayList<String>();
        for (String i : this.hash.keySet()) {
            ret.add(i + " = " + this.hash.get(i));
        }
        return ret;
    }
}

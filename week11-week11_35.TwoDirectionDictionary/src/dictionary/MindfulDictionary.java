/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.*;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Chetan Tuteja
 */
public class MindfulDictionary {

    private Map<String, String> map;
    private File file;

    public MindfulDictionary() {
        this.map = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.file = new File(file);
        this.map = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        if (!this.map.containsKey(word)) {
            this.map.put(word, translation);
        }
    }

    public String translate(String word) {
        if (this.map.containsKey(word)) {
            return this.map.get(word);
        } else if (this.map.containsValue(word)) {
            for (String i : this.map.keySet()) {
                if (this.map.get(i).equalsIgnoreCase(word)) {
                    return i;
                }
            }
        }
        return null;
    }

    public void remove(String word) {
        if (this.map.containsKey(word)) {
            this.map.remove(word);
        } else if (this.map.containsValue(word)) {
            this.map.remove(this.translate(word));
        }
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(this.file);
            if (reader.hasNextLine()) {
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    String[] parts = line.split(":");
                    this.add(parts[0], parts[1]);
                }
                return true;
            }
        } catch (Exception e) {
        }

        return false;
    }

    public boolean save() {
        if (!this.file.exists() && this.map.isEmpty()) {
            return false;
        } else {
            try {
                FileWriter writer = new FileWriter(this.file);
                for (String i : this.map.keySet()) {
                    writer.write(i + ":" + this.map.get(i) + "\n");
                }
                writer.close();
            } catch (Exception e) {
            }
            return true;
        }
    }

}

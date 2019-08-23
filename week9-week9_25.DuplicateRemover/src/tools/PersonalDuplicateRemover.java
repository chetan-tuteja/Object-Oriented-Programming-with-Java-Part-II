/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Chetan Tuteja
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> set;
    private int counter;

    public PersonalDuplicateRemover() {
        this.set = new HashSet<String>();
        this.counter = 0;
    }

    @Override
    public void add(String characterString) {
        if (this.set.contains(characterString)) {
            this.counter++;
        }
        this.set.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.counter;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.set;
    }

    @Override
    public void empty() {
        this.set.clear();
        this.counter = 0;
    }

}

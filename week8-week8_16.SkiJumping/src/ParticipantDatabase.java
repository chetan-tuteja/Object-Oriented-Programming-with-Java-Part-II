/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ParticipantDatabase {

    private ArrayList<Participant> list;
    private Random random;

    public ParticipantDatabase() {
        this.list = new ArrayList<Participant>();
        this.random = new Random();
    }

    public void addNew(Participant participant) {
        this.list.add(participant);
    }

    public void printAll() {
        Collections.sort(list, new SortAgainstPoints());

        int k = 1;
        for (Participant i : this.list) {
            System.out.print("  " + k + ". ");
            System.out.println(i);
            k++;
        }
        System.out.println("");
    }

    public void printJumpResults() {
        Collections.sort(this.list, new SortAgainstPoints());

        for (Participant i : this.list) {
            System.out.println("  " + i.name());

            int lengthCount = this.printLen();
            int votesCount = this.printVotes();
            System.out.println("");
            i.addJump(lengthCount);

            i.updatePoints(lengthCount + votesCount);
        }
        System.out.println("");
    }

    public void printEndResults() {
        Collections.sort(list, new SortAgainstPoints());
        Collections.reverse(list);

        int k = 1;
        for (Participant i : this.list) {
            System.out.println(k + "           " + i);
            System.out.print("            ");
            i.printJumps();
            System.out.println("");
            k++;
        }
    }

    private int ranLength() {
        return this.random.nextInt(61) + 60;
    }

    private int ranVotes() {
        return this.random.nextInt(11) + 10;
    }

    private int printLen() {
        int temp = this.ranLength();
        System.out.println("    length: " + temp);
        return temp;
    }

    private int printVotes() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            temp.add(this.ranVotes());
        }
        System.out.print("    judge votes: ");
        System.out.print(temp);
        Collections.sort(temp);

        int toRet = temp.get(1) + temp.get(2) + temp.get(3);
        return toRet;
    }

}

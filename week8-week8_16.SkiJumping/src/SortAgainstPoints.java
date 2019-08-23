/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.Comparator;

public class SortAgainstPoints implements Comparator<Participant> {

    @Override
    public int compare(Participant part1, Participant part2) {
        return part1.points() - part2.points();
    }
}

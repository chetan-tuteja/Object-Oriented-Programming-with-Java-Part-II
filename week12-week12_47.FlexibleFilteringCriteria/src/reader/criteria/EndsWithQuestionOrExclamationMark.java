/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Chetan Tuteja
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {

    public EndsWithQuestionOrExclamationMark() {
    }

    @Override
    public boolean complies(String line) {
        if (line.length() == 0) {
            return false;
        }
        if (line.charAt(line.length() - 1) == '?' || line.charAt(line.length() - 1) == '!') {
            return true;
        }
        return false;
    }
}

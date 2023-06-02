package ar.com.inna.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutions {

    public List<String> dialing(String digits) {

        List<String> result = new ArrayList<String>();
        List<String> dialpad = new ArrayList<String>();

        List<String> numbers = Arrays.asList("", "", "abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");

        for (int i = 0; i < digits.length(); i++)
            dialpad.add(numbers.get(Integer.parseInt(String.valueOf(digits.charAt(i)))));

        if(dialpad.size() == 0)
            return result;

        return iterate(dialpad, 0, "", new ArrayList<String>());

    }

    private List<String> iterate(List<String> dialpad, int index, String predicate, List<String> lista) {

        List<String> result = lista;

        for(String letter : dialpad.get(index).split("")) {

            String partial = new StringBuilder().append(predicate).append(letter).toString();

            if ((dialpad.size() - 1) >= (index + 1))
                result = iterate(dialpad, (index + 1), partial, lista);
            else
                result.add(partial);

        }

        return result;

    }

}

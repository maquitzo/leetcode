package ar.com.inna.leetcode;

import java.util.*;

public class Solution {

    //17. Letter Combinations of a Phone Number

    public List<String> letterCombinations(String digits) {

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

        String letters = dialpad.get(index);

        for (int i = 0; i < letters.length(); i++) {

            String partial = new StringBuilder().append(predicate).append(letters.charAt(i)).toString();

            if((dialpad.size() -1) >= (index+1))
                result = iterate(dialpad, (index +1), partial, lista);
            else
                result.add(partial);

        }

        return result;

    }

    //15. 3Sum
    public List<List<Integer>> threeSum(int[] nums) {

//        {-1,0,1,2,-1,-4}
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> hashmap = new HashMap<Integer, Integer>();

        for(Integer number: nums)
            hashmap.put(number,number);

        int n1,n2,n3 = 0;

        for(int first = 0; first < nums.length; first++) {

            n1 = nums[first];

            for(int second = (first + 1); second < nums.length; second++) {

                n2= nums[second];

                n3 = (n1 + n2) * -1;

                if (hashmap.containsKey(n3)) {
                    List<Integer> list = Arrays.asList(n1,n2,n3);
                    Collections.sort(list);

                    if(!result.contains(list))
                        result.add(list);
                }


            }

        }

        return result;
    }
}

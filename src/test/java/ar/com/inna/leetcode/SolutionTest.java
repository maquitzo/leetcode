package ar.com.inna.leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void letterCombinations() {

        Solution sln = new Solution();
        List<String> result = sln.letterCombinations("23");

        //assume that the below array represents expected result
        String[] expectedOutput = result.toArray(new String[0]);
        //assuem that the below array is returned from the method
        //to be tested.
        String[] methodOutput = {"ad","ae","af","bd","be","bf","cd","ce","cf"};
        assertArrayEquals(expectedOutput, methodOutput);

    }

    @Test
    void threeSum() {

        Solution sln = new Solution();
        List<List<Integer>> expectedOutput = sln.threeSum(new int[] {-1,0,1,2,-1,-4});
        List<List<Integer>> methodOutput = Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1)) ;
        assert(expectedOutput.equals(methodOutput));

    }
}
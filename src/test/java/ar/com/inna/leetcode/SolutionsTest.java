package ar.com.inna.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {

    @Test
    void dialing() {
        Solutions va = new Solutions();
        List<String> result = va.dialing("23");
        String[] compare = new String[] {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        assertArrayEquals(result.toArray(),compare);
    }
}
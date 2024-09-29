import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class L2022211876_7_Test {
    Solution7 solution = new Solution7();
    // 有效等价类
    @Test
    public void testValidInputs() {
        // 测试示例 1
        String s1 = "dcab";
        List<List<Integer>> pairs1 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        String result1 = solution.smallestStringWithSwaps(s1, pairs1);
        assertEquals("bacd", result1);

        // 测试示例 2
        String s2 = "dcab";
        List<List<Integer>> pairs2 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
        String result2 = solution.smallestStringWithSwaps(s2, pairs2);
        assertEquals("abcd", result2);

        // 测试示例 3
        String s3 = "cba";
        List<List<Integer>> pairs3 = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2));
        String result3 = solution.smallestStringWithSwaps(s3, pairs3);
        assertEquals("abc", result3);

        // 测试示例 4
        String s4 = "aa";
        List<List<Integer>> pairs4 = Arrays.asList(Arrays.asList(0, 1));
        String result4 = solution.smallestStringWithSwaps(s4, pairs4);
        assertEquals("aa", result4);

        // 测试示例 5
        String s5 = "abc";
        List<List<Integer>> pairs5 = Arrays.asList();
        String result5 = solution.smallestStringWithSwaps(s5, pairs5);
        assertEquals("abc", result5);

    }

    // 无效等价类
    @Test
    public void testSingleElement() {
        assertEquals("a", solution.smallestStringWithSwaps("a", Arrays.asList()));
    }

    @Test
    public void testNoSwaps() {
        assertEquals("xyz", solution.smallestStringWithSwaps("xyz", Arrays.asList()));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", solution.smallestStringWithSwaps("", Arrays.asList()));
    }

    // 边界情况
    @Test
    public void testTwoSameCharacters() {
        assertEquals("aa", solution.smallestStringWithSwaps("aa", Arrays.asList(Arrays.asList(0, 1))));
    }

    @Test
    public void testLargeInput() {
        String s = "zyxwvutsrqponmlkjihgfedcba";
        List<List<Integer>> pairs = Arrays.asList();
        assertEquals("zyxwvutsrqponmlkjihgfedcba", solution.smallestStringWithSwaps(s, pairs));
    }
}
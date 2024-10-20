import org.example.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

    //测试用例设计的基本原则包括：首先，边界值分析强调关注输入数据的边界值，因为许多错误往往发生在这些边界条件上，通过测试边界值可以更有效地识别潜在的错误；其次，错误推测法则依据经验和对程序的理解，推测可能存在的错误并设计针对性的测试用例；最后，等价类划分将输入数据分为若干个等价类，从每个类中选择一个或多个代表性数据进行测试，这样不仅能减少测试用例的数量，还能确保覆盖所有可能的输入情况。

public class L2022211949_11_Test {

    // 测试用例1：基本功能测试，包含正数和负数，验证算法能否正确找到所有三数之和为零的组合
    // 测试用例：{-1, 0, 1, 2, -1, -4}
    @Test
    public void testThreeSumExample1() {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(expected, result);
    }

    // 测试用例2：测试包含重复元素的数组，验证算法能否正确处理重复元素并避免重复组合
    // 测试用例：{0, 1, 1}
    @Test
    public void testThreeSumExample2() {
        Solution solution = new Solution();
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(expected, result);
    }

    // 测试用例3：测试全零数组，验证算法能否正确处理特殊情况并返回正确的组合
    // 测试用例：{0, 0, 0}
    @Test
    public void testThreeSumExample3() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(expected, result);
    }

    // 测试用例4：测试包含大量重复元素的数组，验证算法能否高效处理并返回正确的组合
    // 测试用例：{4, -2, -3, 4, 3, 2, -4, 3, -1}
    @Test
    public void testThreeSumWithDuplicates() {
        Solution solution = new Solution();
        int[] nums = {4, -2, -3, 4, 3, 2, -4, 3, -1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, -1, 3), Arrays.asList(-3, -1, 4));
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }


    // 测试用例5：测试全负数数组，验证算法能否正确处理并返回空结果（因为不存在三数之和为零的组合）
    // 测试用例：{-1, -2, -3, -4, -5}
    @Test
    public void testThreeSumWithNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-1, -2, -3, -4, -5};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(expected, result);
    }

    // 测试用例6：测试一个元素的集合
    // 测试用例：{1}
    @Test
    public void testThreeSumWithSingleElement() {
        Solution solution = new Solution();
        int[] nums = {1};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(expected, result);
    }

    // 测试用例7：测试空集合
    // 测试用例：{}
    @Test
    public void testThreeSumWithEmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(expected, result);
    }
}

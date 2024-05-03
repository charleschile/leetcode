import java.util.HashMap;

public class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        // 创建一个 HashMap 用于存储数组元素和它们的下标
        HashMap<Integer, Integer> map = new HashMap<>();

        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 计算当前元素与目标值的差值
            int complement = target - nums[i];
            // 在 HashMap 中查找差值是否存在
            if (map.containsKey(complement)) {
                // 如果存在，则返回差值的下标和当前元素的下标
                return new int[] {map.get(complement), i};
            }
            // 如果差值不存在，则将当前元素及其下标放入 HashMap 中
            map.put(nums[i], i);
        }
        // 如果没有找到符合条件的两个数，返回空数组
        return new int[] {};
    }

    public static void main(String[] args) {
        // 读取输入
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine().trim();
        int target = scanner.nextInt();

        // 去除输入中的方括号，并根据逗号分割字符串得到整数数组
        String[] numsStr = input.substring(1, input.length() - 1).split(",");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i].trim());
        }

        // 创建 Solution 实例
        Solution0001 solution = new Solution0001();

        // 调用 twoSum 方法求解
        int[] result = solution.twoSum(nums, target);

        // 输出结果，注意格式
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 1, 1, 1, 2, 2};
        int[] array2 = {1, 2, 3, 4, 4};

        System.out.println("Majority Element in array1: " + majorityElement(array1));
        System.out.println("Majority Element in array2: " + majorityElement(array2));
    }

    public static Integer majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > nums.length / 2) ? candidate : null;
    }
}

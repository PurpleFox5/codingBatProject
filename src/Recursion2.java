import java.util.HashMap;
import java.util.Map;

public class Recursion2 {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupSum(start + 1, nums, target - nums[start])) return true;
        return groupSum(start + 1, nums, target);

    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        } else {
            if (groupSum6(start + 1, nums, target)) {
                return true;
            }

            return groupSum6(start + 1, nums, target - nums[start]);
        }
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        return groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupSum5(start + 1, nums, target - nums[start])
                && checkOne(start, nums)) {
            return true;
        }
        return nums[start] % 5 != 0 && groupSum5(start + 1, nums, target);
    }

    private boolean checkOne(int start, int[] nums) {
        if (start == 0) return true;
        return start <= 0 || nums[start - 1] % 5 != 0 || nums[start] != 1;

    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                nums[i - 1] += nums[i];
                if (i + 1 < nums.length && nums[i] != nums[i + 1])
                    nums[i] = 0;
                else if (i == nums.length - 1)
                    nums[i] = 0;
            }
        }

        if (start >= nums.length) {
            return target == 0;
        }
        if (groupSumClump(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSumClump(start + 1, nums, target);

    }
    public boolean splitArray(int[] nums) {
        int ind = 0;
        int sum1 = 0;
        int sum2 = 0;
        if (ind >=nums.length){
            return sum1==sum2;
        }
        return groupSum(sum1, sum2, ind, nums);

    }



    private boolean groupSum(int sum1, int sum2, int ind, int[] nums) {
        return groupSum(sum1+nums[ind], sum2, ind+1, nums) ||
                groupSum(sum1, sum2+nums[ind], ind+1, nums);
    }


    public boolean splitOdd10(int[] nums) {
       return sumGroup(0,0,0,nums);
    }

    public boolean sumGroup(int sum1, int sum2, int ind, int[] nums) {
        if (ind >=nums.length){
            return sum1 % 10 == 0 && sum2 % 2 == 1;
        }
        return sumGroup(sum1+nums[ind], sum2, ind+1, nums) ||
                sumGroup(sum1, sum2+nums[ind], ind+1, nums);
    }

    public boolean split53(int[] nums) {
        return sumGroup1(0,0,0,nums);
    }

    public boolean sumGroup1(int sum1, int sum2, int ind, int[] nums) {
        if (ind >=nums.length){
            return sum1 == sum2;
        }
        if (nums[ind] % 5 == 0){
            return sumGroup1(sum1+nums[ind], sum2, ind+1, nums);
        }
        else if (nums[ind] % 3 == 0){
            return sumGroup1(sum1, sum2+nums[ind], ind+1, nums);
        }
        else{
            return sumGroup1(sum1+nums[ind], sum2, ind+1, nums) ||
                    sumGroup1(sum1, sum2+nums[ind], ind+1, nums);
        }


    }

}

import java.util.Arrays;
import java.util.Map;

public class Array3 {
    public int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSpan = 1;
        for (int i = 0; i < nums.length; i++) {
            int span = 0;
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    span = j - i + 1;
                    break;
                }
            }
            if (span > maxSpan) {
                maxSpan = span;
            }

        }
        return maxSpan;
    }

    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                int ind = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        ind = j;
                        break;
                    }
                }
                if (ind == i) {
                    for (int j = 1; j < i; j++) {
                        if (nums[j] == 4 && nums[j - 1] != 3) {
                            ind = j;
                            break;
                        }
                    }
                }
                nums[ind] = nums[i + 1];
                nums[i + 1] = 4;


            }

        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                int ind = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        ind = j;
                        break;
                    }
                }
                if (ind == i) {
                    for (int j = 0; j < i; j++) {
                        if ((nums[j] == 5 && j == 0) || (nums[j] == 5 && nums[j - 1] != 4)) {
                            ind = j;
                            break;
                        }
                    }
                }
                nums[ind] = nums[i + 1];
                nums[i + 1] = 5;


            }

        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int len = nums.length;
        int sum1 = 0;
        int sum2 = 0;

        for (int num : nums) {
            sum1 += num;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (sum1 == sum2) {
                return true;
            } else {
                sum1 -= nums[i];
                sum2 += nums[i];
            }
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int anOuter : outer) {
            if (anOuter == inner[j]) {
                j++;
            }
            if (j == inner.length) {
                return true;
            }
        }
        return false;
    }

    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    result[i * n + j] = 0;
                } else {
                    result[i * n + j] = n - j;
                }

            }
        }
        return result;
    }


    public static int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[k++] = j;
            }
        }
        return result;
    }

    public static int countClumps(int[] nums) {
        int clumps = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= nums.length - 2 && nums[i] == nums[i + 1]) {
                clumps++;

                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[i] != nums[j] || j == nums.length - 1) {
                        i = j - 1;
                        break;
                    }
                }
            }

        }
        return clumps;
    }

    private static int maxMirror(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if(nums[i + count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }


    public static void main(String[] args) {
//        System.out.println(Arrays.toString(seriesUp(3)));
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
    }


}

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2 {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];
        return max - min;

    }

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];

        return (sum - max - min) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean isSix = false;
        for (int num : nums) {
            if (num == 6) {
                isSix = true;
            } else if (isSix && num == 7) {
                isSix = false;
            } else if (!isSix) {
                sum += num;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        boolean istwo = false;
        for (int num : nums) {

            if (istwo && num == 2) {
                return true;
            }
            istwo = num == 2;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }

        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += 2;
            }
        }
        return sum == 8;

    }

    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) != 0) {
                count++;
            }
        }

        return count;
    }


    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && (nums[i + 1] == 7 ||
                    (i + 2 != nums.length && nums[i + 2] == 7))) {
                return true;
            }
        }
        return false;
    }


    public String[] fizzBuzz(int start, int end) {
        String[] array = new String[end - start];
        for (int i = 0; i < array.length; i++) {
            int cur = start + i;
            if (cur % 3 == 0 && cur % 5 == 0) {
                array[i] = "FizzBuzz";
            } else if (cur % 3 == 0) {
                array[i] = "Fizz";
            } else if (cur % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = String.valueOf(cur);
            }
        }
        return array;
    }

    public boolean modThree(int[] nums) {
        int odd = 0;
        int even = 0;

        for (int n :
                nums) {
            if (n % 2 == 0) {
                odd++;
                if (odd == 3 || even == 3) {
                    return true;
                }
                even = 0;
            } else {
                even++;
                if (odd == 3 || even == 3) {
                    return true;
                }
                odd = 0;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean is1 = false;
        for (int n :
                nums) {
            if (n == 1) {
                is1 = true;
            }
            if (is1 && n == 2) {
                return true;

            }

        }
        return false;
    }

    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                two = true;
            } else if (nums[i] == 4 && nums[i + 1] == 4) {
                four = true;
            }
        }
        return two ^ four;
    }

    public boolean no14(int[] nums) {
        boolean noOne = true;
        boolean noFour = true;

        for (int n :
                nums) {
            if (n == 1) {
                noOne = false;
            } else if (n == 4) {
                noFour = false;
            }

        }
        return noFour || noOne;
    }

    public boolean only14(int[] nums) {
        for (int n : nums
                ) {
            if (n != 1 && n != 4) {
                return false;
            }
        }
        return true;
    }

    public boolean more14(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for (int num : nums) {
            if (num == 1) {
                countOne++;
            } else if (num == 4) {
                countFour++;
            }

        }
        return countOne > countFour;

    }

    public static boolean isEverywhere(int[] nums, int val) {
        if (nums.length < 2) {
            return true;
        }
        int ind = nums[0] == val ? 0 : nums[1] == val ? 1 : -1;
        if (ind != -1) {
            for (int i = ind; i < nums.length - 2; i = i + 2) {
                if (nums[i] != val || nums[i + 2] != val) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[start] = num;
                start++;
            } else {
                result[end] = num;
                end--;
            }
        }
        return result;

    }

    public static int[] withoutTen(int[] nums) {
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10){
                for (int j = i; j < end; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }

                nums[end] = 0;

                end--;
                i--;
            }
        }
        return nums;

    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(withoutTen(new int[]{1, 10, 10, 2})));
//        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
    }


}

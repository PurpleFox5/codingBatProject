import java.lang.reflect.Array;
import java.util.Arrays;

public class String3 {
    public String deFront(String str) {
        int n = str.length();
        if (n > 0 && str.charAt(0) == 'a') {
            if (n > 1 && str.charAt(1) == 'b') {
                return str;
            }
            return str.charAt(0) + str.substring(2, n);
        } else if (n > 1 && str.charAt(1) == 'b') {
            return str.substring(1, n);

        }
        return str.substring(2, n);
    }

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
            return str.substring(0, word.length());
        }
        return "";
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = findMax(nums, i);
            }
        }
        return nums;
    }

    int findMax(int[] subArr, int cur) {
        int max = 0;
        for (int i = cur; i < subArr.length; i++) {
            if (max < subArr[i] && subArr[i] % 2 == 1) {
                max = subArr[i];
            }
        }
        return max;
    }

    public int[] post4(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                return Arrays.copyOfRange(nums, i + 1, nums.length);
            }
        }
        return new int[]{};
    }

    public int[] tenRun(int[] nums) {
        boolean isvalue = false;
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                isvalue = true;
                value = nums[i];
            } else if (isvalue) {
                nums[i] = value;
            } else if (isvalue && nums[i] > value) {
                value = nums[i];
            }
        }
        return nums;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length < 1) {
            return new int[]{};
        }
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
        }
        return arr;
    }

    public boolean twoTwo(int[] nums) {
        if ((nums.length > 1 && nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2) ||
                (nums.length == 1 && nums[nums.length - 1] == 2)) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                i++;
            }
            if (nums[i] == 2 && nums[i + 1] != 2) {
                return false;
            }
        }


        return true;
    }

    public boolean isEverywhere(int[] nums, int val) {
        int isInPair;
        if (nums.length >= 1 && nums[0] == val) {
            isInPair = 0;
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] == val) {
                    isInPair = i;
                } else if (i - isInPair > 2) {
                    return false;
                }
            }
        } else if (nums.length >= 2 && nums[1] == val) {
            isInPair = 1;
            for (int i = 3; i < nums.length; i++) {
                if (nums[i] == val) {
                    isInPair = i;
                } else if (i - isInPair > 2) {
                    return false;
                }
            }
        }

        return true;
    }


    public boolean sameEnds(int[] nums, int len) {
        int[] start = Arrays.copyOfRange(nums, 0, len);
        int[] end = Arrays.copyOfRange(nums, nums.length - len, nums.length);
        return Arrays.equals(start, end);
    }


    public boolean haveThree(int[] nums) {
        int countTree = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (i != nums.length - 1 && nums[i + 1] == 3) {
                    return false;
                }
                countTree++;
            }
        }
        return countTree == 3;
    }


    public static boolean tripleUp(int[] nums) {

        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2]) {
                return true;
            }
        }
        return false;

    }


    public int[] pre4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                return Arrays.copyOfRange(nums, 0, i);
            }
        }
        return new int[]{};
    }


    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] withoutTen(int[] nums) {
        int replace = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                nums[i] = nums[i - replace];
                nums[i - replace] = 0;
                replace++;
            }

        }
        return nums;

    }


    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (Character.isDigit(cur)) {
                sum += Integer.parseInt(String.valueOf(cur));
            }
        }
        return sum;
    }

    static String sameEnds(String string) {
        int i = string.length() / 2;
        String start;
        String end;
        do {
            start = string.substring(0, i);
            end = string.substring(string.length() - i, string.length());
            i--;
        } while (!start.equals(end));
        return start;
    }

    public static String mirrorEnds(String string) {
        int i = string.length();
        StringBuffer start;
        StringBuffer end;
        do {
            start = new StringBuffer(string.substring(0, i));
            end = new StringBuffer(string.substring(string.length() - i, string.length())).reverse();

            i--;
        } while (!start.toString().equals(end.toString()));
        return start.toString();
    }

    public int maxBlock(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public int sumNumbers(String str) {
        int sum = 0;
        int fromDigit = -1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (fromDigit == -1) {
                    fromDigit = i;
                }
            } else if (fromDigit != -1) {
                sum += Integer.parseInt(str.substring(fromDigit, i));
                fromDigit = -1;
            }
        }
        if (fromDigit != -1) {
            sum += Integer.parseInt(str.substring(fromDigit, str.length()));
        }
        return sum;
    }

    public static String notReplace(String str) {

        StringBuilder temp = new StringBuilder(str);

        for (int i = 0; i < temp.length() - 1; i++) {
            if (temp.substring(i, i + 2).equals("is")) {
                if (i != 0 && Character.isLetter(temp.charAt(i - 1))){
                    continue;
                }
                else if(i != temp.length() - 2 && Character.isLetter(temp.charAt(i + 2))) {
                    continue;
                }
                temp.replace(i, i + 2, "is not");
            }

        }
        return temp.toString();
    }

        public int countYZ (String str){
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isLetter(str.charAt(i))) {
                    if (i != 0 && (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y' ||
                            str.charAt(i - 1) == 'Z' || str.charAt(i - 1) == 'Y')) {
                        count++;
                    }
                }
            }
            int last = str.length() - 1;
            if (str.charAt(last) == 'z' || str.charAt(last) == 'y' ||
                    str.charAt(last) == 'Z' || str.charAt(last) == 'Y') {
                count++;
            }
            return count;
        }

        public static boolean gHappy (String str){
            if (str.length() == 1) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'g') {
                    if (i != 0 && i != str.length() - 1 && !(str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g')) {
                        return false;
                    } else if (i == 0 && str.charAt(i + 1) != 'g') {
                        return false;
                    } else if (i == str.length() - 1 && str.charAt(i - 1) != 'g') {
                        return false;
                    }
                }

            }
            return true;
        }

        public String starOut (String str){
            return str.replaceAll("(\\w?\\*\\w?)", "");
        }

        public boolean xyBalance (String str){
            int indX = str.lastIndexOf('x');
            int indY = str.lastIndexOf('y');
            if (indX == -1) {
                return true;
            }
            return indX < indY;
        }

        public static int[] zeroFront ( int[] nums){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 10) {
                    int pos = findPosition(nums, i);
                    nums[i] = nums[pos];
                    nums[pos] = 0;
                }
            }
            return nums;
        }
        private static int findPosition ( int[] nums, int end){
            for (int i = nums.length - 1; i >= end; i--) {
                if (nums[i] != 0) {
                    return i;
                }
            }
            return nums.length - 1;
        }


        public static void main (String[]args){
            System.out.println(notReplace("This is right"));
//            System.out.println(zeroFront(new int[]{10, 2, 10}));
//            System.out.println(tripleUp(new int[]{1, 2, 3}));
//        System.out.println(gHappy("mggm"));
        }
    }

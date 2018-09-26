import java.util.HashMap;
import java.util.Map;

public class Recursion1 {
    private int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);

    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    private int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        }
        return 2 + bunnyEars2(bunnies - 1);
    }

    private int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    private int count7(int n) {
        if (n / 10 == 0) {
            if (n % 10 == 7) {
                return 1;
            }
            return 0;
        }
        return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
    }

    private int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    private int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    private int countX(String str) {
        int ind = str.indexOf("x");
        int k = 0;
        if (ind != -1) {
            k = 1 + countX(str.substring(ind + 1));
        }
        return k;
    }

    private String changeXY(String str) {
        int ind = str.indexOf("x");
        if (ind != -1) {
            str = str.replace('x', 'y');
            changeXY(str.substring(ind + 1));
        }
        return str;
    }

    private String changePi(String str) {
        int ind = str.indexOf("pi");
        if (ind != -1) {
            str = str.replace("pi", "3.14");
            changePi(str.substring(ind + 3));
        }
        return str;
    }

    private static String noX(String str) {
        int ind = str.indexOf("x");
        if (ind != -1) {
            str = str.substring(0, ind) + str.substring(ind + 1, str.length());
            return noX(str);
        } else {
            return str;
        }

    }

    private boolean array6(int[] nums, int index) {
        if (index >= nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }

    private int array11(int[] nums, int index) {
        if (index < nums.length) {
            if (nums[index] == 11) {
                return 1 + array11(nums, index + 1);
            } else {
                return array11(nums, index + 1);
            }
        }
        return 0;
    }

    private static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false;
        }
        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }
        return array220(nums, index + 1);
    }


    public String allStar(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(0) + "*" + allStar(str.substring(1, str.length()));
    }

    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(1) + "*" + pairStar(str.substring(1, str.length()));
        }
        return str.charAt(0) + pairStar(str.substring(1, str.length()));
    }

    public static String endX(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1, str.length())) + 'x';
        } else {
            return str.charAt(0) + endX(str.substring(1, str.length()));
        }
    }

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.substring(0, 3).equals("abc") ||
                str.substring(0, 3).equals("aba")) {
            return 1 + countAbc(str.substring(2, str.length()));
        }
        return countAbc(str.substring(1, str.length()));
    }

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2, str.length()));
        }
        return count11(str.substring(1, str.length()));
    }

    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1, str.length()));
        }
        return str.charAt(0) + stringClean(str.substring(1, str.length()));
    }

    public static String parenBit(String str) {
        if (str.charAt(0) == '(' &&
                str.charAt(str.length() - 1) == ')') {
            return str;
        } else if (str.charAt(0) == '(') {
            return parenBit(str.substring(0, str.length() - 1));
        } else if (str.charAt(str.length() - 1) == ')') {
            return parenBit(str.substring(1));
        }
        return parenBit(str.substring(1, str.length() - 1));
    }

    public boolean nestParen(String str) {
        if (str.length() < 1) {
            return true;
        }
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    public boolean strCopies(String str, String sub, int n) {
        int ind = str.indexOf(sub);
        if (ind == -1) {
            return n == 0;
        }
        return strCopies(str.substring(ind + 1, str.length()), sub, n - 1);
    }

//    public int count8(int n) {
//        if (n / 10 == 0) {
//
//        }
//        if (n % 10 == 8) {
//            return 1 + count8(n / 10);
//        }
//    }


    public static int strDist(String str, String sub) {
        if (!str.contains(sub)) {
            return 0;
        }
        if (str.startsWith(sub) &&
                str.endsWith(sub)) {
            return str.length();
        } else if (str.startsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (str.endsWith(sub)) {
            return strDist(str.substring(1), sub);
        }

        return strDist(str.substring(1, str.length() - 1), sub);
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        }
        return count8(n / 10);
    }
    public static int countPairs(String str) {
        if (str.equals("") || str.length() < 3) return 0;
        if (str.charAt(0) == str.charAt(2)) return 1 + countPairs(str.substring(1));
        else return countPairs(str.substring(1));

    }
    public static int countHi2(String str) {
        int ind = str.indexOf("hi");
        if (ind == -1 || str.equals("")){
            return 0;
        }
        else{
            if ((ind != 0 && str.charAt(ind-1)!='x') ||
                    ind == 0){
                return 1+countHi2(str.substring(ind+2));
            }
            else{
                return countHi2(str.substring(ind+2));
            }
        }

    }



    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
//        System.out.println(countPairs("axax"));
//        System.out.println(strDist("hiHellohihihi", "ll"));
//            System.out.println(parenBit("(xy)1"));
//        System.out.println(pairStar("xxyy"));
//        System.out.println(array220(new int[] {3}, 0));
    }

}


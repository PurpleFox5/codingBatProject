import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, string.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            map.put(string.substring(0, 1), string.substring(string.length() - 1, string.length()));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            String first = String.valueOf(string.charAt(0));
            if (map.containsKey(first)) {
                map.put(first, map.get(first) + string);
            } else {
                map.put(first, string);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
            if (map.get(string) % 2 == 0){
                result+=string;
            }
        }
        return result;
    }
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, true);
            } else {
                map.put(string, false);
            }
        }
        return map;

    }

    private static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String first = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(first)){
                String tmp = strings[i];
                strings[i]=strings[map.get(first)];
                strings[map.get(first)] = tmp;
                map.remove(first);
            }else{
                map.put(first, i);
            }

        }
        return strings;


    }
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String first = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(first) && map.get(first)!=-1){
                String tmp = strings[i];
                strings[i]=strings[map.get(first)];
                strings[map.get(first)] = tmp;
                map.put(first, -1);
            }else if (!map.containsKey(first)){
                map.put(first, i);
            }

        }
        return strings;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(allSwap(new
                String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"})));
    }

}

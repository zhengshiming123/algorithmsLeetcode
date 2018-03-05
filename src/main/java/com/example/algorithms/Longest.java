package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by h on 2018/2/26.
 */
public class Longest {

    public static void main(String[] args) {
        String s = "abcabcdbb";
        Longest longest = new Longest();

        int i = longest.lengthOfLongestSubstring2(s);
        System.out.println(i);

    }
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map map = new HashMap();
        int a = 0;
        int b = 0;
        int mapSize = 0;
        for (int i = 0; i <chars.length ; i++) {
            map.put(chars[i], i);
            if (map.size() != mapSize + 1) {
                map.clear();
                mapSize = 0;
                map.put(chars[i], i);
                String substring = s.substring(a, i);
                if (substring.length()>=b)
                    b = substring.length();
                System.out.println(substring);
                a = i;
            }
            mapSize = map.size();
        }
        return b;

        //map.put()

    }


    public int lengthOfLongestSubstring1(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap();
        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i);
            max= Math.max(max,i-j);
        }
        return max;
    }
}
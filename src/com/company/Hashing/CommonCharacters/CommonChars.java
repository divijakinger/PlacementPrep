package com.company.Hashing.CommonCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonChars {
    public static void main(String[] args) {
        String[] words = new String[]{"bella","label","roller"};
        System.out.println(commonChars(words));
    }
    static List<String> commonChars(String[] words){
        HashMap<Character,Integer> min_frequency = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (char ch='a';ch<='z';ch++){
            min_frequency.put(ch,1000);
        }

        for (String curr:words){
            HashMap<Character,Integer> current_frequency = new HashMap<>();
            for (int i=0;i<curr.length();i++) {
                char ch = curr.charAt(i);
                current_frequency.put(ch,current_frequency.getOrDefault(ch,0)+1);
            }

            for (char ch='a';ch<='z';ch++){
                min_frequency.put(ch,Math.min(min_frequency.get(ch),current_frequency.getOrDefault(ch,0)));
            }
        }

        for (char ch='a';ch<='z';ch++){
            while (min_frequency.get(ch)>0 && min_frequency.get(ch)<1000){
                ans.add(String. valueOf(ch));
                min_frequency.put(ch,min_frequency.get(ch)-1);
            }
        }
        return ans;
    }
}

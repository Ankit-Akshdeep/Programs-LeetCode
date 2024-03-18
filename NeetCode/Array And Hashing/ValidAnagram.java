import java.util.*;
public class ValidAnagram{

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i<s1.length(); i++){
            char chs = s1.charAt(i);
            map.put(chs, map.getOrDefault(chs, 0) + 1);
        }

        for(int i = 0; i<s2.length(); i++){
            char cht = s2.charAt(i);
            if(map.get(cht) != null){
                if(map.get(cht) == 1){
                    map.remove(cht);
                } else{
                    map.put(cht, map.get(cht) - 1);
                }
            } else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        
        System.out.println(isAnagram(s1, s2)); //expected output - true
    }
}
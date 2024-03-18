import java.util.*;
public class LongestConsecutive{

    public static int LC(int nums[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int num : nums){
            hs.add(num);
        }

        int longest = 0;
        for(int val : hs){
            if(!hs.contains(val-1)){
                int l = val + 1;
                while(hs.contains(l)){
                    l++;
                }
                longest = Math.max(longest, l - val);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println(LC(nums)); //expected output - 4
    }
}
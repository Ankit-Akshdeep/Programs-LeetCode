import java.util.*;
public class TwoSum{

    public static int[] twoSum(int nums[], int target){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            hm.put(nums[i], i);
        }
        for(int i = 0; i<nums.length;i++){
            int complement = target - nums[i];
            while(hm.containsKey(complement) && hm.get(complement) != i){
                return new int[]{i, hm.get(complement)};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums, target));

    }
}
import java.util.*;
public class TopKFrequent{

    public static int[] frequent(int nums[], int k){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        List<Integer> bucket[] = new ArrayList[nums.length - 1];

        for(int key : hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int res[] = new int[k];
        int index = 0;
        for(int pos = bucket.length - 1; pos>=0 ; pos--){
            if(bucket[pos]!=null){
                for (int val : bucket[pos]) {
                    res[index++] = val;
                    if(index == k){
                        return res;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        int k = 2;
        System.out.println(frequent(nums, k));
    }
}
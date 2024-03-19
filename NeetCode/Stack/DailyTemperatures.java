import java.util.*;
public class DailyTemperatures{

    public static int[] warm(int temp[]){
        Stack<Integer> s = new Stack<>();
        int res[] = new int[temp.length];

        for(int i = temp.length - 1; i>=0 ;i--){
            while(!s.isEmpty() && temp[i]>=temp[s.peek()]){
                s.pop();
            }
            if(!s.isEmpty()){
                res[i] = s.peek() - i;
            }
            s.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(warm(temp)));
    }
}
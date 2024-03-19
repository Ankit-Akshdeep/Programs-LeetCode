import java.util.*;
public class ReversePolish{

    public static int evaluate(String s[]){
        Stack<Integer> stk = new Stack<>();

        for(String token : s){
            
            if(token == "+"){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n1+n2;
                stk.push(res);
            }
            else if(token == "*"){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n1*n2;
                stk.push(res);
            }
            else if(token == "-"){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2-n1;
                stk.push(res);
            }
            else if(token == "/"){
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2/n1;
                stk.push(res);
            }
            else{
                stk.push(Integer.parseInt(token));
            }
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        String s[] =  {"2","1","+","3","*"}; 
        System.out.println(evaluate(s)); //prints 9
    }
}
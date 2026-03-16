
// LeetCode 22 – Generate Parentheses
import java.util.*;
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    void backtrack(List<String> res,String cur,int open,int close,int n){
        if(cur.length()==2*n){
            res.add(cur);
            return;
        }
        if(open<n)
            backtrack(res,cur+"(",open+1,close,n);
        if(close<open)
            backtrack(res,cur+")",open,close+1,n);
    }
    public static void main(String[] args) {
        GenerateParentheses g=new GenerateParentheses();
        System.out.println(g.generateParenthesis(3));
    }
}
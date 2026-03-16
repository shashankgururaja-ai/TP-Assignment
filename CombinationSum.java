
// LeetCode 39 – Combination Sum
import java.util.*;
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int remain,int start){
        if(remain==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<nums.length && remain>=nums[i];i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,remain-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args){
        CombinationSum cs=new CombinationSum();
        int[] nums={2,3,6,7};
        System.out.println(cs.combinationSum(nums,7));
    }
}
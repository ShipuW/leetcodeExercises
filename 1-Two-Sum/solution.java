import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i ++) {
            table.put(nums[i],i);
        }
        
        for (int j = 0; j < nums.length; j++){
            if(table.containsKey(target - nums[j])){
                
                int[] result = {j, table.get(target - nums[j])};
                if (j == table.get(target - nums[j])) continue;
                //result[0] = j;
                //result[1] = table.get(target - nums[j]);
                return result;
            }
            
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
public class Solution {
    public boolean containsDuplicate(int[] nums) {
      //some comment
	 Set<Integer> set = new HashSet<Integer>();
         for(int i : nums)
             if(!set.add(i)){
                 return true; 
             }     
         return false;
    }
}

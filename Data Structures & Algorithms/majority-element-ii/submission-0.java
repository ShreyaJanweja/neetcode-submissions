class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>nums.length/3){
                ans.add(key);
            }
        }
        return ans;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        
        int size=nums.length/2;
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i: nums)
        {
            if(!count.containsKey(i))
            {
                //If hashMap is not storing the given number then update the frequecy and put 1 as it is coming first time
                count.put(i,1);
            }
            else
            {
                count.put(i,count.get(i)+1);
            }
            if(count.get(i)>size)
            {
                return i;
            }
        }
        return -1;
        
    }
}
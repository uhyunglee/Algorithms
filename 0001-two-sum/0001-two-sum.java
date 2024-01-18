class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        
        //target에서 첫번째 수를 뺀 결과를 키로 조회하고 현재 인덱스가 아닌 경우 정답으로 리턴 
        for(int i = 0; i <nums.length; i++){
            if(numsMap.containsKey(target-nums[i]))
                return new int[] {i, numsMap.get(target-nums[i])};
            //정답이 아니면 비교를 ㅟ해 인덱스를 맵에 저장
            numsMap.put(nums[i], i);
        }
        //항상 정답이 존재하므로 널이 리턴되는 경우는 없음
        return null;
    }
}
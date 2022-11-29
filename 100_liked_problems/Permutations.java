class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solution(result, new ArrayList<>(), nums);
        return result;
    }
  
    public void solution(List<List<Integer>> result, List<Integer> currentList, int[] nums) {
        if (currentList.size() == nums.length) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (currentList.contains(nums[i])) {
                continue;
            }
            currentList.add(nums[i]);
            solution(result, currentList, nums);
            currentList.remove(currentList.size() - 1);
        }
    }
}

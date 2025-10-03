public class PrintTwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 0;

        PrintTwoSum obj = new PrintTwoSum();
        int[] res = obj.twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}

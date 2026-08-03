public class BuildArray {
    // method name should be camelCase
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]]; // core logic for permutation
        }

        return ans;
    }

    // for testing
    public static void main(String[] args) {
        BuildArray obj = new BuildArray();
        int[] nums = {0,2,1,5,3,4};
        int[] result = obj.buildArray(nums);

        for(int num : result) {
            System.out.print(num + " ");
        }
        // Output: 0 1 2 4 5 3
    }
}
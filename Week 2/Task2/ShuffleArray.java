public class ShuffleArray {

    // Method to shuffle the array
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;

        // nums = [x1,x2,...,xn,y1,y2,...,yn]
        // ans = [x1,y1,x2,y2,...,xn,yn]
        for(int i = 0; i < n; i++) {
            ans[index++] = nums[i]; // take from first half
            ans[index++] = nums[i + n]; // take from second half
        }

        return ans;
    }

    // for testing
    public static void main(String[] args) {
        ShuffleArray obj = new ShuffleArray();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int[] result = obj.shuffle(nums, n);

        // Print result
        for(int num : result) {
            System.out.print(num + " ");
        }
        // Output: 2 3 5 4 1 7
    }
}
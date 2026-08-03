public class HighestAltitude {

    // Method to find highest altitude
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0; // start at 0

        for(int g : gain) {
            currentAltitude += g;  // update current altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude); // track max
        }

        return maxAltitude;
    }

    // for testing
    public static void main(String[] args) {
        HighestAltitude obj = new HighestAltitude();

        int[] gain1 = {-5,1,5,0,-7};
        System.out.println(obj.largestAltitude(gain1)); 
        // Output: 1
        // Altitudes: 0 -> -5 -> -4 -> 1 -> 1 -> -6. Max = 1

        int[] gain2 = {-4,-3,-2,-1,4,3,2};
        System.out.println(obj.largestAltitude(gain2)); 
        // Output: 0
        // Altitudes: 0 -> -4 -> -7 -> -9 -> -10 -> -6 -> -3 -> -1. Max = 0
    }
}
public class MinimumReqursive {
    public static int findminimum(int[] arr, int n) {
        if(n == 1) return arr[0];
        return Math.min(arr[n-1], findminimum(arr, n-1));
    }
}

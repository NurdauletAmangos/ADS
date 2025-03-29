public  class Average_of_an_array {
    public static double findAverage(int n, int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 2, 4, 1};
        System.out.println(findAverage(n, arr));
    }
}
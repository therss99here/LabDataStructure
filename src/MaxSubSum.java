public class MaxSubSum {
    public static void main(String[] args){
        int arr[] = {-2, -5, 6, -2, -3, 1, 5, -6};
        int n = arr.length;
        int max_sum = maxSubArraySum(arr, 0, n - 1);
    }

    private static int maxSubArraySum(int[] arr, int l, int h) {
        if (l==h){
            return arr[l];
        }

        int m = (l + h) / 2;

        return Math.max(Math.max(maxSubArraySum(arr, l, m), maxSubArraySum(arr, m+1, h)), maxCrossArray(arr, l, m , h));
    }

    private static int maxCrossArray(int[] arr, int l, int m, int h) {
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for(int i = m; i >= l; i--) {
            sum += arr[i];
            if(sum>left_sum){
                left_sum = sum;
            }
        }

        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for(int i = m+1; i <= l; i++) {
            sum += arr[i];
            if(sum>right_sum){
                right_sum = sum;
            }
        }
        return Math.max(right_sum+left_sum, Math.max(left_sum, right_sum));
    }
}

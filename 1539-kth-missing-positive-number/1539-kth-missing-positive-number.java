class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length;

        while(left < right){
            int mid = left + (right - left) / 2;
            // Agar mid tak missing numbers ki count k se kam hai, toh k-th missing number right side mein hoga, isliye left = mid + 1 karte hain....!
            if((arr[mid] - (mid + 1)) < k){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left + k; // k missing numbers ko represent karta hai, aur left se unki position adjust karke hum kth missing positive number return karte hain.
    }
}
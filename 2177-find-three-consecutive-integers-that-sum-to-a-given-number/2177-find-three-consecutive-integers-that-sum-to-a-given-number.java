class Solution {
    public long[] sumOfThree(long num) {
        if(num % 3 != 0){
            return new long[]{};
        } // num is not divisible by 3 so...returns an empty array because no three consecutive integers can have that sum.

        long x = num / 3;

        return new long[]{x - 1, x , x + 1};
    }
}
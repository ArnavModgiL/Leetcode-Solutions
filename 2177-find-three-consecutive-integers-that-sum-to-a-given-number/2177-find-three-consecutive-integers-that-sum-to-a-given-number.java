class Solution {
    public long[] sumOfThree(long num) {
        if(num % 3 != 0){
            return new long[0]; // if..num is not divisible by 3, and if so, return new long[0] returns an empty array because no three consecutive integers can have that sum.....
        } else {
            return new long[]{num/3 - 1 , num/3 , num/3 + 1};// bez x-1+x+x+1=num..so...num/3=x;
        }
    }
}
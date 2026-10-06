

class Solution {
    public void sortColors(int[] nums) {

        // 0, 1 aur 2 ki frequency/count store karne ke liye
        int zero = 0;
        int one = 0;
        int two = 0;

        // Array ke har element ko check karenge
        for(int i = 0; i < nums.length; i++) {

            // Agar current element 0 hai,
            // to zero ka count increase karo
            if(nums[i] == 0) {
                zero++;
            }

            // Agar current element 1 hai,
            // to one ka count increase karo
            if(nums[i] == 1) {
                one++;
            }

            // Agar current element 2 hai,
            // to two ka count increase karo
            if(nums[i] == 2) {
                two++;
            }
        }

        // 'answer' batayega ki ab array ke kis index par
        // next value insert karni hai
        int answer = 0;

        // Pehle saare 0 put karenge
        // jitne 0 count hue hain utni baar loop chalega
        for(int i = 0; i < zero; i++) {
            nums[answer] = 0;
            answer++;
        }

        // Uske baad saare 1 put karenge
        // jitne 1 count hue hain utni baar
        for(int i = 0; i < one; i++) {
            nums[answer] = 1;
            answer++;
        }

        // Last mein saare 2 put karenge
        // jitne 2 count hue hain utni baar
        for(int i = 0; i < two; i++) {
            nums[answer] = 2;
            answer++;
        }
    }
}
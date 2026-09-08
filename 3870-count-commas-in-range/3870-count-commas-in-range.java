class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0; // Aghr number jo hai 1000 sai chotu hai soo no comma islye return 0.
        }
        return n - 999; // isme [last - first + 1] condition used hai okie. . .
    }
}
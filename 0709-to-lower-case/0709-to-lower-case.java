class Solution {
    public String toLowerCase(String s) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                answer += Character.toLowerCase(ch);
            } else {
                answer += ch;
            }
        }
        return answer;
    }
}
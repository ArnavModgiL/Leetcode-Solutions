class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String lower = word.toLowerCase();
            String row = "";

            if(row1.contains("" + lower.charAt(0))) {
                row = row1;
            } else if(row2.contains("" + lower.charAt(0))) {
                row = row2;
            } else {
                row = row3;
            }
            boolean valid = true;
            for(int j = 0; j < lower.length(); j++) {
                char ch = lower.charAt(j);

                if(!row.contains("" + ch)) {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }
}
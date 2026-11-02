class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            char x = magazine.charAt(i);

            map.put(x, map.getOrDefault(x,0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char x = ransomNote.charAt(i);

            if(map.containsKey(x) && map.get(x) > 0){
                map.put(x, map.get(x) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
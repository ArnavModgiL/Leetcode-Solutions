
class Solution { 
    public List<Integer> findDuplicates(int[] nums) { 
        
        // HashMap me har number ki frequency (count) store karenge
        HashMap<Integer, Integer> map = new HashMap<>(); 
        
        // Duplicate numbers ko store karne ke liye result list
        List<Integer> ans = new ArrayList<>(); 
 
        // Array ke har element ko traverse kar rahe hain
        for(int x : nums){ 
            
            // Agar number pehle se map me present hai,
            // to uski frequency ko 1 se increase kar do
            if(map.containsKey(x)){ 
                map.put(x, map.get(x) + 1); 
            } 
            
            // Agar number pehli baar mila hai,
            // to uski frequency 1 set kar do
            else { 
                map.put(x, 1); 
            } 
        } 
 
        // Map ke saare unique numbers ko traverse kar rahe hain
        for(int x : map.keySet()){ 
            
            // Agar kisi number ki frequency exactly 2 hai,
            // iska matlab ye number array me duplicate hai
            if(map.get(x) == 2){ 
                ans.add(x); 
            } 
        } 
        
        // Saare duplicate numbers ki list return kar do
        return ans; 
    } 
}
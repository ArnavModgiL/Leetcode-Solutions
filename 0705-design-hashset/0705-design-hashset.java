class MyHashSet {

    int set[] = new int[1000001];

    public MyHashSet() {  
    }
    
    public void add(int key) {
        set[key] = 1; // corresponding array index par 1 store karna, which indicates that the element is present in our HashSet.
    }
    
    public void remove(int key) {
        set[key] = 0; // corresponding array index par 0 store karna, which indicates that the element is no longer present in our HashSet.
    }
    
    public boolean contains(int key) {
        if(set[key] == 1){
            return true; // checks whether the given key is present in the HashSet; if its value is 1, it returns true...
        } else {
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
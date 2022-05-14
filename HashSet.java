class MyHashSetBruteForce {
    int set[];
    int size;

    public MyHashSetBruteForce() {
        size = (int)(Math.pow(10, 6)) + 1;
        set = new int[size];
    }
    
    public void add(int key) {
        set[key] = 1;
    }
    
    public void remove(int key) {
        set[key] = 0;
    }
    
    public boolean contains(int key) {
        return set[key] == 1 ? true : false;
    }
}

// Efficient
class MyHashSet {
    private static final int capacity = 1000;
    
    class Node{
        int key;
        Node next;
        public Node(int key) {
            this.key = key;
        }
    }
    
    Node[] array;
    int size;
    
    public MyHashSet() {
        this.array = new Node[capacity];
        this.size = 0;
        
    }
    
    public void add(int key) {
        int code = hashCode(key);
        int index = getIndex(code);
        
        Node node = new Node(key);
        if(array[index] != null) {
            Node head = array[index];
            node.next = head;    
        }
        array[index] = node;
    }
    
    public void remove(int key) {
        int code = hashCode(key);
        int index = getIndex(code);
        
        Node cur = array[index];
        Node prev = null;
        
        while(cur != null) {
            if(cur.key == key) {
                if(cur == array[index]) {
                    array[index] = cur.next;
                } else {
                    prev.next = cur.next;
                }   
            }
            prev = cur;
            cur = cur.next;
        }
        
    }
    
    public boolean contains(int key) {
        int code = hashCode(key);
        int index = getIndex(code);
        
        Node cur = array[index];
        
        while(cur != null) {
            if(cur.key == key) {
                return true;
            }
            cur = cur.next;
        }
        
        return false;
    }
    
    private int hashCode(int key) {
        int sum = 0;
        //1,2,3
        while(key > 0) {
            sum = sum * 10 + key%10;
            key /= 10;
        }
        return sum;
    }
    
    private int getIndex(int code) {
        return code % array.length;
    }
    
}

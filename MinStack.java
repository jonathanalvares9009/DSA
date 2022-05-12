import java.util.ArrayList;

class MinStack {

    ArrayList<Integer> arr;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        arr = new ArrayList<>();
    }

    public void push(int val) {
        min = Math.min(val, min);
        arr.add(val);
    }

    public void pop() {
        arr.remove(arr.size() - 1);
        min = Integer.MAX_VALUE;
        for (Integer i : arr) {
            min = Math.min(min, i);
        }
    }

    public int top() {
        return arr.get(arr.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
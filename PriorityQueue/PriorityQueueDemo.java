package PriorityQueue;

import java.util.PriorityQueue;

class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr[] = { 2, 3, 2, 2, 4};
        for(int idx = 0; idx < arr.length; idx++) {
            pq.add(arr[idx]);
        }

        while(!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
}
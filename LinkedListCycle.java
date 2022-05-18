import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class LinkedListCycle {
    public boolean hasCycleSlowAndFast(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head, fast = head;
        slow = slow.next;
        fast = fast.next != null ? fast.next.next : fast.next;
        while(fast != null && (slow != fast)) {
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : fast.next;
        }
        if(fast == null) return false;
        return true;
    }

    public boolean hasCycleHashSet(ListNode head) {
        if(head == null || head.next == null) return false;
        HashSet<ListNode> nodes = new HashSet<>();
        ListNode temp = head;
        while(temp != null && !nodes.contains(temp)) {
            nodes.add(temp);
            temp = temp.next;
        }
        if(temp == null) return false;
        return true;
    }
}
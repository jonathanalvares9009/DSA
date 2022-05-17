/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoSortedLists {
    
    public ListNode mergeTwoListsFourPtr(ListNode list1, ListNode list2) {
        ListNode list = null;
        ListNode list1Ptr = list1, list2Ptr = list2, listPtr = null;
        while(list1Ptr != null && list2Ptr != null) {
            if(list1Ptr.val <= list2Ptr.val) {
                list = list == null ? list1Ptr : list;
                if(listPtr == null) listPtr = list1Ptr;
                else {
                    listPtr.next = list1Ptr;
                    listPtr = listPtr.next;
                }
                list1Ptr = list1Ptr.next;
            } else {
                list = list == null ? list2Ptr : list;
                if(listPtr == null) listPtr = list2Ptr;
                else {
                    listPtr.next = list2Ptr;
                    listPtr = listPtr.next;
                }
                list2Ptr = list2Ptr.next;
            }
        }
        if(list1Ptr != null) {
            list = list == null ? list1Ptr : list;
            if(listPtr == null) listPtr = list1Ptr;
            else {
                listPtr.next = list1Ptr;
                listPtr = listPtr.next;
            }
        }
        if(list2Ptr != null) {
            list = list == null ? list2Ptr : list;
            if(listPtr == null) listPtr = list2Ptr;
            else {
                listPtr.next = list2Ptr;
                listPtr = listPtr.next;
            }
        }
        return list;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode mergedList = null;
        if(list1.val < list2.val) {
            mergedList = list1;
            mergedList.next = mergeTwoLists(list1.next, list2);
        } else {
            mergedList = list2;
            mergedList.next = mergeTwoLists(list1, list2.next);
        }
        return mergedList;
    }
}
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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Initialize a dummy node to simplify the merging process
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Traverse both lists simultaneously and merge them
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // Attach the remaining nodes from list1 or list2
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // Return the merged list starting from the next of dummy node
        return dummy.next;
    }
}

// Link: https://leetcode.com/problems/linked-list-cycle/description/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slowPointer = head, fastPointer = head;
        while(fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
    }
}

// Beats: 100% in Runtime, 18% in Memory

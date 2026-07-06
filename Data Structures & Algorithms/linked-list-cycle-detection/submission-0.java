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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode curr = head;
        if (curr == null) return false;
        
        while (curr != null && !map.containsKey(curr)) {
            ListNode nextTemp = curr.next;
            if (map.containsKey(curr)) {
                return true;
            } else {
                map.put(curr, curr.val);
            }
            curr = nextTemp;
        }

        if (map.containsKey(curr)) {
            return true;
        }

        for (Map.Entry<ListNode, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().val + " " + entry.getValue());
        }
        return false;
    }
}

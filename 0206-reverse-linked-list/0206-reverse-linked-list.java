class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null; 
        
        while (current != null) {
            nextNode = current.next; 
            current.next = prev;     
            prev = current;         
            current = nextNode;      
        }
        
        return prev; 
    }
}

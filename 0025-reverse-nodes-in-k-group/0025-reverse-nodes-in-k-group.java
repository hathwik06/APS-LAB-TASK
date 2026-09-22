class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        
        ListNode temp = new ListNode(-1);
        temp.next = head;
        
        ListNode prevGpeEnd = temp; 
        
        while (true) {
            ListNode kth = prevGpeEnd;
            
            
            for (int i = 1; i <= k && kth != null; i++) {
                kth = kth.next;
            }
            
           
            if (kth == null) {
                break;
            }
            
            
            ListNode nextGpeStart = kth.next;
            ListNode curr = prevGpeEnd.next;
            ListNode prev = nextGpeStart; 
            
            
            while (curr != nextGpeStart) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            
            
            ListNode oldGpeStart = prevGpeEnd.next;
            prevGpeEnd.next = kth;
            prevGpeEnd = oldGpeStart;    
        }  
        
        return temp.next;
    }
}

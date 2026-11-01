class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;

        while (true) {
            ListNode kp = getKthNode(prev, k);
            if (kp == null) break;

            ListNode gs = prev.next;
            ListNode ngs = kp.next;

            ListNode prevNode = ngs;
            ListNode curr = gs;

            while (curr != ngs) {
                ListNode nextTemp = curr.next;
                curr.next = prevNode;
                prevNode = curr;
                curr = nextTemp;
            }

            prev.next = kp;
            prev = gs;
        }

        return temp.next;
    }

    private ListNode getKthNode(ListNode start, int k) {
        while (start != null && k > 0) {
            start = start.next;
            k--;
        }
        return start;
    }
}

package LinkedList;

public class InsertionSortList {
	public void swap(ListNode a, ListNode b){
        a.val = a.val + b.val;
        b.val = a.val - b.val;
        a.val = a.val - b.val;
    }
    public ListNode insertionSortList(ListNode a) {
        ListNode prev = a;
        ListNode next;
        while(prev != null){
            next = prev.next;
            while(next != null){
                if(prev.val > next.val){
                    swap(prev,next);
                }
                next = next.next;
            }
            prev = prev.next; 
        }
        return a;
    }

}

//Given a linked list, determine if it has a cycle in it.

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
public class LinkedListCycle_141 {
  public boolean hasCycle(ListNode head) {
    // if (head == null) return false;
    // ListNode slow = head;
    // ListNode fast = head;
    // while ( slow != null && fast != null) {
    //     if (slow == fast && slow != head) {
    //         return true;
    //     }
    //     slow = slow.next;
    //     fast = fast.next.next;
    // }
    // return false;

    if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    while(runner.next!=null && runner.next.next!=null) {
      walker = walker.next;
      runner = runner.next.next;
      if(walker==runner) return true;
    }
    return false;
  }
}
//Reverse a singly linked list.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList_206 {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode nextNode = head.next;
    head.next = null;
    ListNode newHead = reverseList(nextNode);
    nextNode.next = head;
    return newHead;

    // ListNode prev = null;
    // ListNode cur = head;
    // while (cur != null) {
    //     ListNode nextNode = cur.next;
    //     cur.next = prev;
    //     prev = cur;
    //     cur = nextNode;
    // }
    // return prev;
  }
}
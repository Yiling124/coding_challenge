//Remove all elements from a linked list of integers that have value val.
//
//  Example
//  Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
//  Return: 1 --> 2 --> 3 --> 4 --> 5

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveLinkedListElements_203 {
  // public ListNode removeElements(ListNode head, int val) {
  //     ListNode newHead = new ListNode(0);
  //     newHead.next = head;
  //     ListNode prev = newHead;
  //     ListNode cur = head;
  //     while (cur != null) {
  //         ListNode nextNode = cur.next;
  //         if (cur.val == val) {
  //             prev.next = nextNode;
  //             cur = nextNode;
  //         } else {
  //             prev = cur;
  //             cur = nextNode;
  //         }
  //     }
  //     return newHead.next;
  // }

  public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
      head = head.next;
    }
    if (head == null) {
      return null;
    }

    ListNode cur = head.next;
    ListNode prev = head;

    while (cur != null) {
      ListNode nxt = cur.next;
      if (cur.val == val) {
        prev.next = nxt;
      } else {
        prev = cur;
      }
      cur = nxt;
    }
    return head;
  }
}
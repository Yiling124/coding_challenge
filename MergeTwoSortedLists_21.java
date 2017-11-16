//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoSortedLists_21 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //         if (l1 == null) {
    //             return l2;
    //         }
    //         if (l2 == null) {
    //             return l1;
    //         }
    //         ListNode newHead = l1.val <= l2.val ? l1 : l2;
    //         ListNode cur = newHead;
    //         ListNode secListHead = l1.val > l2.val ? l1 : l2;

    //         while (cur.next != null || cur.next.val <= secListHead.val) {
    //             cur = cur.next;
    //         }
    //         ListNode temp = cur.next;
    //         cur.next = secListHead;
    //         secListHead = temp;
    //         mergeTwoLists(cur.next, secListHead);
    //         return newHead;

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode newHead = l1.val <= l2.val ? l1 : l2;
    ListNode cur = newHead;
    ListNode secListHead = l1.val > l2.val ? l1 : l2;
    while (cur != null && secListHead != null) {
      if (cur.next == null || cur.next.val > secListHead.val) {
        ListNode temp = cur.next;
        cur.next = secListHead;
        secListHead = temp;
      }
      cur = cur.next;
    }
    return newHead;
  }
}
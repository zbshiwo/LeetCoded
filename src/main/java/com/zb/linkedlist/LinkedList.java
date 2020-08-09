package com.zb.linkedlist;

import com.zb.base.IssueId;
import com.zb.base.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@IssueId("https://leetcode.com/problemset/all/?topicSlugs=linked-list")
public class LinkedList {

    private LinkedList() {}

    // Easy
    /**
     * Merge two sorted linked lists and return it as a new sorted list.
     * The new list should be made by splicing together the nodes of the first two lists.
     * @param l1 a sorted linked list like [1 -> 2 -> 4]
     * @param l2 a sorted linked list like [1 -> 3 -> 4]
     * @return [1 -> 1 -> 2 -> 3 -> 4 -> 4]
     */
    @IssueId("https://leetcode.com/problems/merge-two-sorted-lists/")
    public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            temp.next = l2;
        } else {
            temp.next = l1;
        }
        return head.next;
    }

    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     * @param head a sorted linked list lisk [1 -> 1 -> 2]
     * @return
     */
    @IssueId("https://leetcode.com/problems/remove-duplicates-from-sorted-list/")
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    /**
     * Given a linked list, determine if it has a cycle in it.
     * @return whether the linked list has cycle
     * @see LinkedList#getEnterListNode(com.zb.base.ListNode)
     * @see LinkedList#getCycleLength(com.zb.base.ListNode)
     */
    @IssueId("https://leetcode.com/problems/linked-list-cycle/")
    public static boolean hasCycle(ListNode head) {
        return true;
    }

    /**
     *
     * @param head
     * @return
     * @see LinkedList#hasCycle(com.zb.base.ListNode)
     */
    public static ListNode getEnterListNode(ListNode head) {
        return null;
    }

    /**
     *
     * @param head
     * @return
     * @see LinkedList#hasCycle(com.zb.base.ListNode)
     */
    public static int getCycleLength(ListNode head) {
        return 0;
    }

    /**
     * remove all elements from a linked list of integers that have value {@code val}
     * @param head a linked list of integers [1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6]
     * @param val [6]
     * @return a linked list of integers without {@code val} [1 -> 2 -> 3 -> 4 -> 5]
     */
    @IssueId("https://leetcode.com/problems/remove-linked-list-elements/")
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode p = result;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return result.next;
    }

    /**
     * reverse a linked list
     * @param head a linked list like [1 -> 2 -> 4 -> 3]
     * @return a reversed linked list [3 -> 4 -> 2 -> 1]
     */
    @IssueId("https://leetcode.com/problems/reverse-linked-list/")
    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    /**
     * Given a non-empty, singly linked list with head node {@code head}, return a middle node of linked list.
     * If there are two middle nodes, return the second middle node.
     * @param head a non-empty, singly linked list [1 -> 2 -> 3 -> 4 -> 5 -> 6]
     * @return the middle node [4 -> 5 -> 6]
     */
    @IssueId("https://leetcode.com/problems/middle-of-the-linked-list/")
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Given {@code head} which is a reference node to a singly-linked list.
     * The value of each node in the linked list is either 0 or 1.
     * The linked list holds the binary representation  of  a number.
     * Return the decimal value of the number in the linked list.
     * @param head
     * @return
     */
    @IssueId("https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/")
    public static int getDecimalValue(ListNode head) {
        return 0;
    }

    /**
     * Write a program to find the node which the intersection of two singly linked list begins.
     * @param headA a singly linked list, [a1 -> a2 -> c1 -> c2 -> c3]
     * @param headB a singly linked list, [b1 -> b2 -> b3 -> c1 -> c2 -> c3]
     * @return The node which the intersection of two singly linked list begins
     */
    @IssueId("https://leetcode.com/problems/intersection-of-two-linked-lists/")
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    /**
     * Given a linked list, swap every two adjacent node and return its head.<br/>
     * You may not modify the values in the list's nodes, only nodes itself may be changed.<br/>
     * 给定一个链表，每两个相邻节点交换一次，返回链表的头。<br/>
     * 不能修改链表节点中的值，只能修改节点本身<br/>
     * Example:<br/>
     * <pre>1 -> 2 -> 3 -> 4        =>         2 -> 1 -> 4 -> 3</pre>
     */
    @IssueId("https://leetcode.com/problems/swap-nodes-in-pairs/")
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    // Medium

    /**
     *
     * @param l1 [2 -> 4 -> 3]
     * @param l2 [5 -> 6 -> 4]
     * @return [7 -> 0 -> 8]
     */
    @IssueId("https://leetcode.com/problems/add-two-numbers/")
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode head = new ListNode();
        ListNode p = head;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(temp % 10);
            p = p.next;
            temp /= 10;
        }
        if (temp == 1) {
            p.next = new ListNode(1);
        }
        return head.next;
    }

    @IssueId("https://leetcode.com/problems/odd-even-linked-list/")
    public static ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode odd = head, even = head.next, evenHead = even;
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }

    /**
     * Given a linked list, remove the n-th node from the end of list and return its head
     * 给定一个链表，从末尾删除第 n 个节点并返回头部
     */
    @IssueId("https://leetcode.com/problems/remove-nth-node-from-end-of-list/")
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        ListNode quick = start, slow = start;
        start.next = head;

        while (n > 0 && quick != null) {
            quick = quick.next;
            n--;
        }
        while (quick != null && quick.next != null) {
            slow = slow.next;
            quick = quick.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    /**
     * Given a sorted linked list, delete all nodes that have duplicate numbers. leaving only distinct numbers from the original list.
     * 给定一个排序链表，删除所有有重复数字的节点，只保留原始链表中不同的数字
     * @see com.zb.linkedlist.LinkedList#deleteDuplicates(ListNode)
     */
    @IssueId("https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/")
    public static ListNode deleteDuplicates2(ListNode head) {
        return null;
    }

    /**
     * Given the {@code head} of a linked list,<br/>
     * we repeatedly delete consecutive sequences of nodes that sum to 0 util there are no such sequences.<br/>
     * After doing so, return the {@code head} of the final linked list.<br/>
     * <br/>
     * 给定一个链表的 {@code head} 节点，反复删除求和为 0 的节点序列，直到没有此类序列为止。<br/>
     * 这样做之后，返回最终链表的 {@code head}
     */
    @IssueId("https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/")
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0), cur = dummy;
        Map<Integer, ListNode> map = new HashMap<>();
        dummy.next = head;
        int temp = 0;
        while (cur != null) {
            temp += cur.val;
            if (map.containsKey(temp)) {
                // remove unneeded map entry
                cur = map.get(temp).next;
                int p = temp + cur.val;
                while (p != temp) {
                    map.remove(p);
                    cur = cur.next;
                    p += cur.val;
                }
                map.get(temp).next = cur.next;
            } else {
                map.put(temp, cur);
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    /**
     * Given a singly linked list.
     * <pre>L: L0 -> L1  ->  ... -> Ln-1 -> Ln</pre>
     * Reorder it to
     * <pre>L: L0 -> Ln  ->  L1 -> Ln-1 -> L2 -> Ln-2 -> ...</pre>
     * You may not modify the values in the list's nodes. onlt nodes itself may be changed.<br/>
     * <br/>
     * 给定一个单链表。
     * <pre>L: L0 -> L1  ->  ... -> Ln-1 -> Ln</pre>
     * 重排序后为
     * <pre>L: L0 -> Ln  ->  L1 -> Ln-1 -> L2 -> Ln-2 -> ...</pre>
     * 不能修改链表节点中的值，只能修改节点本身<br/>
     *
     * @see LinkedList#middleNode(com.zb.base.ListNode)
     * @see LinkedList#reverseList(com.zb.base.ListNode)
     */
    @IssueId("https://leetcode.com/problems/reorder-list/")
    public static void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        // use the fast slow pointer to find the middle node, if there are two middle nodes, return the first middle node
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse form the middle node
        ListNode cur = slow.next, newHead = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = temp;
        }
        slow.next = null;
        // start reorder
        ListNode p = head, q = newHead;
        while (q != null) {
            ListNode pNext = p.next, qNext = q.next;
            p.next = q;
            q.next = pNext;
            p = p.next.next;
            q = qNext;
        }
    }

    /**
     * Given a linked list, rotate the list to the right by {@code k} places, where k is non-negative.<br/>
     * 提供一个链表，将列表向右旋转k个位置，其中k为非负数。<br/>
     * <pre>
     * Input: 0->1->2->NULL, k = 4
     * Output: 2->0->1->NULL
     * Explanation:
     * rotate 1 steps to the right: 2->0->1->NULL
     * rotate 2 steps to the right: 1->2->0->NULL
     * rotate 3 steps to the right: 0->1->2->NULL
     * rotate 4 steps to the right: 2->0->1->NULL
     * </pre>
     * @see LinkedList#removeNthFromEnd(com.zb.base.ListNode, int)
     */
    @IssueId("https://leetcode.com/problems/rotate-list/")
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode quick = head, slow = head;
        while (k > 0) {
            quick = quick.next;
            if (quick == null) {
                quick = head;
            }
            k--;
        }
        while (quick.next != null) {
            quick = quick.next;
            slow = slow.next;
        }
        if (slow.next == null) {
            return head;
        }
        ListNode newHead = slow.next, cur = newHead;
        slow.next = null;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;
        return newHead;
    }

    /**
     * Given a singly linked list with head node {@code head}. </br>
     * write a function to split the linked list into {@code k} consecutive linked list "parts".<br/>
     * The length of each part should ne as equal as possible, no two parts should have a size differing by more than 1.</br>
     * This may lead to some parts being null. <br/>
     * The parts should be in order of occurrence in the input list </br>
     * and parts occurring earlier should always have a size greater than or equal parts occurring later.<br/>
     * Return a list of ListNode's representing the linked list parts that are formed.<br/>
     * <br/>
     * 给定一个带有头结点的链表 {@code head}, 编写一个函数将链表拆分为 {@code k} 个连续的链表部分 <br/>
     * 每个部分的长度尽可能相等，两个部分的大小之差不得超过1。这可能导致某些部分为空。<br/>
     * 每个几点应该按照输入列表中的顺序排序，并且中较早出现的部分的长度应该大于或等于较晚出现的比大小。<br/>
     * 返回表示所形成的链接列表部分的 {@code ListNode} 的 List。
     * <pre>
     * Input:
     * root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
     * Output: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
     * </pre>
     */
    @IssueId("https://leetcode.com/problems/split-linked-list-in-parts/")
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int length = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            length++;
        }
        ListNode temp = head, prev = null;
        int n = length / k, r = length % k;
        for (int i = 0; i < result.length && temp != null; i++, r--) {
            result[i] = temp;
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
        return result;
    }
}

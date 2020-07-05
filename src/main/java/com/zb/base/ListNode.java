package com.zb.base;

public class ListNode {
    @SuppressWarnings("checkstyle:VisibilityModifier")
    public int val;
    @SuppressWarnings("checkstyle:VisibilityModifier")
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

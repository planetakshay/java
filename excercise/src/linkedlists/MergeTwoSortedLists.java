package linkedlists;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tmp_node = new ListNode(0);
        ListNode curr_node = tmp_node;

        while(list1 != null && list2!=null){

            if(list1.val < list2.val){
                curr_node.next = list1;
                list1 = list1.next;
            }else{
                curr_node.next = list2;
                list2 = list2.next;
            }
            curr_node = curr_node.next;
        }
        if(list1!=null){
            curr_node.next = list1;
            list1 = list1.next;
        }
        if(list2!=null){
            curr_node.next = list2;
            list2 = list2.next;
        }
        return tmp_node.next;
    }

}

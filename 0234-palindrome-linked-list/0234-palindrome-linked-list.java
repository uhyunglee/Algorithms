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
import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        boolean answer = false;
        
        ListNode node = head;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        
        if(list.size() == 1) return true;
        
        while(!list.isEmpty()){
            if(answer == true && list.size() == 1) return true;
            if(list.pollLast() == list.pollFirst())
                answer = true;
            else {
                answer = false;
                break;
            }
        }
        
        return answer;
        
    }
}
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
import java.math.BigInteger;
class Solution {
    public ListNode reverseList(ListNode head){
        ListNode prev = null, node = head;
        
        while(node != null){
            // 현재 노드의 다음 노드 미리 지정
            ListNode next = node.next;
            // 현재 노드의 다음으로 이전 노드 지정
            node.next = prev;
            // 이전 노드는 현재 노드로 지정
            prev = node;
            // 미리 지정했던 다음노드를 현재로 변경
            node = next;
        }
        return prev;
    }
    
    public BigInteger toBigInt(ListNode node){
        String val = "";
        
        while(node != null){
            val += node.val;
            node = node.next;
        }
        
        return new BigInteger(val);
    }
    
    public ListNode toReversedLinkedList(BigInteger val){
        ListNode prev = null, node = null;
        // 정수형 -> 문자, 한글자씩 순회
        for(char c : String.valueOf(val).toCharArray()){
            node = new ListNode(Character.getNumericValue(c));
            node.next = prev;
            prev = node;
        }
        return node;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Reversed = reverseList(l1);
        ListNode l2Reversed = reverseList(l2);
        
        BigInteger result = toBigInt(l1Reversed).add(toBigInt(l2Reversed));
        
        return toReversedLinkedList(result);
    }
}
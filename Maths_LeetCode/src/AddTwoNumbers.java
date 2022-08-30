public class AddTwoNumbers {
    /*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */
    /*
    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
     */
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        int carry = 0;
        while(l1!=null || l2!=null || carry>0){
            int val = carry;
            if(l1!=null){
                val += l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                val += l2.val;
                l2 = l2.next;
            }

            carry = val/10;
            val %= 10;
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummyHead.next;
    }
    public static void main(String[] args) {
    ListNode l1=new ListNode(2);
    ListNode l2=new ListNode(5);
    ListNode l3=new ListNode();

        l3=addTwoNumbers(l1,l2);
    System.out.println(l3.val);
    }
}

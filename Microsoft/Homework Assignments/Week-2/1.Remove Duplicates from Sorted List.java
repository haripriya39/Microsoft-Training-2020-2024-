class Solution {
public ListNode deleteDuplicates(ListNode head) {
ListNode curr=head;
while(curr!=null && curr.next!=null)
{
while(curr!=null && curr.next!=null && curr.val==curr.next.val)
{
curr.next=curr.next.next;
}
curr=curr.next;
}
return head;
}
}

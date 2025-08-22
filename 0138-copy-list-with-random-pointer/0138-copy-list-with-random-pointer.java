/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node temp= head;
        while(temp!=null){
            Node nextElement = temp.next;
            Node copy = new Node(temp.val);
            temp.next=copy;
            copy.next=nextElement;
            temp=nextElement;
        }

        temp=head;
        while(temp!=null){
            Node copyNode = temp.next;
            if(temp.random!=null){
                copyNode.random = temp.random.next;
            }
            temp=temp.next.next;
        }
        temp=head ;
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(temp!=null){
            res.next=temp.next;
            res = res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummyNode.next;
    }
}

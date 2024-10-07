package zuoshen.jichuban.src.class02;

public class Code02_DeleteGivenValue {

    public static class Node{
        public int value;
        public Node next;
        public Node(int data) {
            value = data;
        }
    }

    public static Node deleteGivenValue(Node head, int num) {
        while(head != null) {
            if (head.value != num) {
                break;
            }
            head = head.next;
        }
        Node pre = head;
        Node cur = head;
        while(cur != null) {
            if (cur.value == num) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}

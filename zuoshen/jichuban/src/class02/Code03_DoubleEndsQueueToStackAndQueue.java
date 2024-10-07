package zuoshen.jichuban.src.class02;

public class Code03_DoubleEndsQueueToStackAndQueue {

    //双向链表
    public static class Node<T> {
        public T value;
        public Node<T> last;
        public Node<T> next;
        public Node(T data) {
            value = data;
        }
    }

    public static class DoubleEndsQueue<T> {
        //用双链表构造队列
        public Node<T> head;
        public Node<T> tail;
        public void addFromHead(T value) {
            //从头部加节点
            Node<T> cur = new Node<T>(value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                cur.next = head;
                head.last = cur;
                head = cur;
            }
        }
        public void addFromBottom(T value) {
            //从尾部加节点
            Node<T> cur = new Node<T>(value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                tail.next = cur;
                cur.last = tail;
                tail = cur;
            }
        }

        public T popFromHead() {
            if (head == null) {
                return null;
            }
            Node<T> cur = head;
            if (head == tail) {
                head = null;
                tail = null;
            }
            else {
                head = head.next;
                head.last = null;
            }
            return cur.value;
        }

        public T popFromBottom() {
            if (head == null) {
                return null;
            }
            Node<T> cur = tail;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.last;
                tail.next = null;
            }
            return cur.value;
        }

        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }
    }

    public static class MySatck<T> {
        private DoubleEndsQueue<T> queue;
        public MySatck() {
            queue = new DoubleEndsQueue<T>();
        }
        public void push(T value) {
            queue.addFromHead(value);
        }
        public T pop() {
            return queue.popFromHead();
        }
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    public static class MyQueue<T> {
        private DoubleEndsQueue<T> queue;
        public MyQueue() {
            queue = new DoubleEndsQueue<T>();
        }
        public void push(T value) {
            queue.addFromHead(value);
        }
        public T poll() {
            return queue.popFromBottom();
        }
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }
    public static void main(String[] args) {


    }
}

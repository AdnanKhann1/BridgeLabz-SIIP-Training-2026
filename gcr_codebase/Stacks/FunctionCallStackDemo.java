public class FunctionCallStackDemo {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedListStack {
        private Node top;

        public void push(String value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        public String pop() {
            if (top == null) {
                return null;
            }
            String value = top.data;
            top = top.next;
            return value;
        }

        public String peek() {
            if (top == null) {
                return null;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push("FunctionA");
        stack.push("FunctionB");
        stack.push("FunctionC");

        System.out.println("Current: " + stack.peek());
        System.out.println("Return: " + stack.pop());
        System.out.println("Return: " + stack.pop());
        System.out.println("Current: " + stack.peek());
    }
}

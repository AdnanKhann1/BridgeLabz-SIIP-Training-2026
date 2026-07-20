public class FixedCapacityStackDemo {

    static class FixedStack {
        private String[] arr;
        private int top;
        private int capacity;

        public FixedStack(int capacity) {
            this.capacity = capacity;
            this.arr = new String[capacity];
            this.top = -1;
        }

        public boolean push(String value) {
            if (top == capacity - 1) {
                return false;
            }
            arr[++top] = value;
            return true;
        }

        public String pop() {
            if (top == -1) {
                return null;
            }
            return arr[top--];
        }

        public String peek() {
            if (top == -1) {
                return null;
            }
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        FixedStack stack = new FixedStack(3);

        System.out.println(stack.push("Edit1"));
        System.out.println(stack.push("Edit2"));
        System.out.println(stack.push("Edit3"));
        System.out.println(stack.push("Edit4"));

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Peek: " + stack.peek());
    }
}

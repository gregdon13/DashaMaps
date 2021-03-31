public class Node<E, T> {
    //option to be made generic if I replace the fields
        private E key;
        private T value;
        private Node<E, T> next;

        public Node(E key, T value, Node<E, T> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node (E key, T value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public boolean hasNext() {
            if (this.next == null) {
                return false;
            } else {
                return true;
            }
        }

        public Node<E, T> getNext() {
            return this.next;
        }

        public void setNext(Node<E, T> next) {
            this.next = next;
        }

        public void setKey(E key) {
            this.key = key;
        }

        public E getKey() {
            return this.key;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue () {
            return this.value;
        }
}

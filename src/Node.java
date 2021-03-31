public class Node<E, T> {
        private String key;
        private Integer value;
        private Node<E, T> next;

        public Node(String key, Integer value, Node<E, T> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node (String key, Integer value) {
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

        public void setKey(String key) {
            this.key = key;
        }

        public String getKey() {
            return this.key;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getValue () {
            return this.value;
        }
}

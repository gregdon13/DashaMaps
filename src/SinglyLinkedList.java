public class SinglyLinkedList<E, T> {
    private Node<E, T> head;

    public SinglyLinkedList(E key) {
        this.head = new Node<E, T>(key, null, null);
    }

    public void addNode(E key, T value) {
        Node<E, T> temp = head;
        while (temp.hasNext()) {
            temp = temp.getNext();
        }
        temp.setNext(new Node<E, T>(key, value));
    }

    public void removeNode(int index) throws IndexOutOfBoundsException {
        Node<E, T> temp = this.head;
        if (index == 0) {
            this.head = this.head.getNext();
        } else {
            //catches if not index == 0
            for (int i = 0; i < index -1; i++) {
                if (temp.hasNext()) {
                    temp = temp.getNext();
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            temp.setNext(temp.getNext().getNext());
        }
    }

    public int find (E key) {
        Node<E, T> temp = this.head;
        int index = 0;
        while (temp.hasNext()) {
            if (temp.getKey().equals(key)) {
                return index;
            }
            index++;
            temp = temp.getNext();
        }
        return -1;
    }

    public boolean contains (E key) {
        return this.find(key) != -1;
    }

    public int size() {
        Node<E, T> temp = this.head;
        int index = 0;
        while (temp.hasNext()) {
            index++;
            temp = temp.getNext();
        }
        return index;
    }

    public boolean isEmpty() {
        Node<E, T> temp = this.head;
        return !temp.hasNext();
    }

}

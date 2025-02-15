import javafx.util.Pair;

public class DashaMapOne implements HashMapX {
    SinglyLinkedList[] singlyLinkedList;

    public DashaMapOne() {
        singlyLinkedList = new SinglyLinkedList[26];
        singlyLinkedList[0] = new SinglyLinkedList<String, String>("a");
        singlyLinkedList[1] = new SinglyLinkedList<String, String>("b");
        singlyLinkedList[2] = new SinglyLinkedList<String, String>("c");
        singlyLinkedList[3] = new SinglyLinkedList<String, String>("d");
        singlyLinkedList[4] = new SinglyLinkedList<String, String>("e");
        singlyLinkedList[5] = new SinglyLinkedList<String, String>("f");
        singlyLinkedList[6] = new SinglyLinkedList<String, String>("g");
        singlyLinkedList[7] = new SinglyLinkedList<String, String>("h");
        singlyLinkedList[8] = new SinglyLinkedList<String, String>("i");
        singlyLinkedList[9] = new SinglyLinkedList<String, String>("j");
        singlyLinkedList[10] = new SinglyLinkedList<String, String>("k");
        singlyLinkedList[11] = new SinglyLinkedList<String, String>("l");
        singlyLinkedList[12] = new SinglyLinkedList<String, String>("m");
        singlyLinkedList[13] = new SinglyLinkedList<String, String>("n");
        singlyLinkedList[14] = new SinglyLinkedList<String, String>("o");
        singlyLinkedList[15] = new SinglyLinkedList<String, String>("p");
        singlyLinkedList[16] = new SinglyLinkedList<String, String>("q");
        singlyLinkedList[17] = new SinglyLinkedList<String, String>("r");
        singlyLinkedList[18] = new SinglyLinkedList<String, String>("s");
        singlyLinkedList[19] = new SinglyLinkedList<String, String>("t");
        singlyLinkedList[20] = new SinglyLinkedList<String, String>("u");
        singlyLinkedList[21] = new SinglyLinkedList<String, String>("v");
        singlyLinkedList[22] = new SinglyLinkedList<String, String>("w");
        singlyLinkedList[23] = new SinglyLinkedList<String, String>("x");
        singlyLinkedList[24] = new SinglyLinkedList<String, String>("y");
        singlyLinkedList[25] = new SinglyLinkedList<String, String>("z");
    }

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            char current = Character.toLowerCase(input.charAt(0));
            return Character.toString(current);
        }
        return null;
    }

    public Node<String, String> findIn (int arrIndex, String key) {
        Node<String, String> temp = singlyLinkedList[arrIndex].getHead();
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    @Override
    public void set(String key, String value) {
        String firstLetter = HashFunctionOne(key);
        for (SinglyLinkedList s : singlyLinkedList) {
            if (s.getHead().getKey().equals(firstLetter)) {
                s.addNode(key, value);
            }
        }
    }

    @Override
    public void delete(String key) {
        String firstLetter = HashFunctionOne(key);
        for (SinglyLinkedList s : singlyLinkedList) {
            if (s.getHead().getKey().equals(firstLetter)) {
                Node<String, String> temp = s.getHead();
                while (temp.hasNext()) {
                    if (temp.getNext().getKey().equals(key)) {
                        temp.setNext(temp.getNext().getNext());
                        break;
                    }
                    temp = temp.getNext();
                }
            }
        }
    }

    @Override
    public String get(String key) {
        String firstLetter = HashFunctionOne(key);
        for (SinglyLinkedList s : singlyLinkedList) {
            if (s.getHead().getKey().equals(firstLetter)) {
                Node<String, String> temp = s.getHead();
                while (temp != null) {
                    if (temp.getKey().equals(key)) {
                        return temp.getValue();
                    }
                    temp = temp.getNext();
                }
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty(int num) {
        if (this.singlyLinkedList[num].getHead().getNext() == null) {
            return true;
        }
        return false;
    }

    @Override
    public long size() {
        long counter = 0;
        for (SinglyLinkedList s : singlyLinkedList) {
            if (s.getHead().hasNext()) {
                Node<String, String> temp = s.getHead();
                while (temp.hasNext()) {
                    counter++;
                    temp = temp.getNext();
                }
            }
        }
        return counter;
    }
}

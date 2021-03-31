public class DashaMapOne implements HashMapX {
    SinglyLinkedList[] singlyLinkedList;

    public DashaMapOne() {
        singlyLinkedList = new SinglyLinkedList[26];
        singlyLinkedList[0] = new SinglyLinkedList<String, Integer>("a");
        singlyLinkedList[1] = new SinglyLinkedList<String, Integer>("b");
        singlyLinkedList[2] = new SinglyLinkedList<String, Integer>("c");
        singlyLinkedList[3] = new SinglyLinkedList<String, Integer>("d");
        singlyLinkedList[4] = new SinglyLinkedList<String, Integer>("e");
        singlyLinkedList[5] = new SinglyLinkedList<String, Integer>("f");
        singlyLinkedList[6] = new SinglyLinkedList<String, Integer>("g");
        singlyLinkedList[7] = new SinglyLinkedList<String, Integer>("h");
        singlyLinkedList[8] = new SinglyLinkedList<String, Integer>("i");
        singlyLinkedList[9] = new SinglyLinkedList<String, Integer>("j");
        singlyLinkedList[10] = new SinglyLinkedList<String, Integer>("k");
        singlyLinkedList[11] = new SinglyLinkedList<String, Integer>("l");
        singlyLinkedList[12] = new SinglyLinkedList<String, Integer>("m");
        singlyLinkedList[13] = new SinglyLinkedList<String, Integer>("n");
        singlyLinkedList[14] = new SinglyLinkedList<String, Integer>("o");
        singlyLinkedList[15] = new SinglyLinkedList<String, Integer>("p");
        singlyLinkedList[16] = new SinglyLinkedList<String, Integer>("q");
        singlyLinkedList[17] = new SinglyLinkedList<String, Integer>("r");
        singlyLinkedList[18] = new SinglyLinkedList<String, Integer>("s");
        singlyLinkedList[19] = new SinglyLinkedList<String, Integer>("t");
        singlyLinkedList[20] = new SinglyLinkedList<String, Integer>("u");
        singlyLinkedList[21] = new SinglyLinkedList<String, Integer>("v");
        singlyLinkedList[22] = new SinglyLinkedList<String, Integer>("w");
        singlyLinkedList[23] = new SinglyLinkedList<String, Integer>("x");
        singlyLinkedList[24] = new SinglyLinkedList<String, Integer>("y");
        singlyLinkedList[25] = new SinglyLinkedList<String, Integer>("z");
    }

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            char current = Character.toLowerCase(input.charAt(0));
            return Character.toString(current);
        }
        return null;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}

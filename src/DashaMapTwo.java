public class DashaMapTwo implements HashMapX{
    SinglyLinkedList[] singlyLinkedList;

    public DashaMapTwo() {
        singlyLinkedList = new SinglyLinkedList[26];
        singlyLinkedList[0] = new SinglyLinkedList<>("a");
        singlyLinkedList[1] = new SinglyLinkedList<>("b");
        singlyLinkedList[2] = new SinglyLinkedList<>("c");
        singlyLinkedList[3] = new SinglyLinkedList<>("d");
        singlyLinkedList[4] = new SinglyLinkedList<>("e");
        singlyLinkedList[5] = new SinglyLinkedList<>("f");
        singlyLinkedList[6] = new SinglyLinkedList<>("g");
        singlyLinkedList[7] = new SinglyLinkedList<>("h");
        singlyLinkedList[8] = new SinglyLinkedList<>("i");
        singlyLinkedList[9] = new SinglyLinkedList<>("j");
        singlyLinkedList[10] = new SinglyLinkedList<>("k");
        singlyLinkedList[11] = new SinglyLinkedList<>("l");
        singlyLinkedList[12] = new SinglyLinkedList<>("m");
        singlyLinkedList[13] = new SinglyLinkedList<>("n");
        singlyLinkedList[14] = new SinglyLinkedList<>("o");
        singlyLinkedList[15] = new SinglyLinkedList<>("p");
        singlyLinkedList[16] = new SinglyLinkedList<>("q");
        singlyLinkedList[17] = new SinglyLinkedList<>("r");
        singlyLinkedList[18] = new SinglyLinkedList<>("s");
        singlyLinkedList[19] = new SinglyLinkedList<>("t");
        singlyLinkedList[20] = new SinglyLinkedList<>("u");
        singlyLinkedList[21] = new SinglyLinkedList<>("v");
        singlyLinkedList[22] = new SinglyLinkedList<>("w");
        singlyLinkedList[23] = new SinglyLinkedList<>("x");
        singlyLinkedList[24] = new SinglyLinkedList<>("y");
        singlyLinkedList[25] = new SinglyLinkedList<>("z");
    }

    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            char current = Character.toLowerCase(input.charAt(1));
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

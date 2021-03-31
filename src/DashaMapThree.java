public class DashaMapThree implements HashMapX{
    SinglyLinkedList[] singlyLinkedList;

    public DashaMapThree() {
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

    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            int current = Character.toLowerCase(input.charAt(0)+input.charAt(1));
            if (current > 122) {
                int newVal = (current - 122) + 96;
                char wrapLetter = (char) newVal;
                return Character.toString(wrapLetter);
            }
            return Character.toString((char) current);
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

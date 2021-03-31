public class DashaMapThree implements HashMapX{
    Node[] nodeArray;

    public DashaMapThree() {
        nodeArray = new Node[26];
        nodeArray[0] = new Node("a", null, null);
        nodeArray[1] = new Node("b", null, null);
        nodeArray[2] = new Node("c", null, null);
        nodeArray[3] = new Node("d", null, null);
        nodeArray[4] = new Node("e", null, null);
        nodeArray[5] = new Node("f", null, null);
        nodeArray[6] = new Node("g", null, null);
        nodeArray[7] = new Node("h", null, null);
        nodeArray[8] = new Node("i", null, null);
        nodeArray[9] = new Node("j", null, null);
        nodeArray[10] = new Node("k", null, null);
        nodeArray[11] = new Node("l", null, null);
        nodeArray[12] = new Node("m", null, null);
        nodeArray[13] = new Node("n", null, null);
        nodeArray[14] = new Node("o", null, null);
        nodeArray[15] = new Node("p", null, null);
        nodeArray[16] = new Node("q", null, null);
        nodeArray[17] = new Node("r", null, null);
        nodeArray[18] = new Node("s", null, null);
        nodeArray[19] = new Node("t", null, null);
        nodeArray[20] = new Node("u", null, null);
        nodeArray[21] = new Node("v", null, null);
        nodeArray[22] = new Node("w", null, null);
        nodeArray[23] = new Node("x", null, null);
        nodeArray[24] = new Node("y", null, null);
        nodeArray[25] = new Node("z", null, null);
    }

    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            char current = (char) Character.toLowerCase(input.charAt(0)+input.charAt(1));
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

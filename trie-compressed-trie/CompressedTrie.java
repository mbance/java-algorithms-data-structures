import java.util.Map;
import java.util.TreeMap;

public class CompressedTrie {
    public Map<String, CompressedTrie> children;
    public CompressedTrie() {
        children = new TreeMap<String, CompressedTrie>();
    }
    public static CompressedTrie compressTrie(Trie t) {
        CompressedTrie n = new CompressedTrie();
        char[] set = new char[27];
        n.children.put(t.s + '{', n);

        System.out.println();
        System.out.println(n.children.toString());

        return n;
    }
    public boolean query(String s) {
    return false;
    }
    public void insert(String s) {
    }
}
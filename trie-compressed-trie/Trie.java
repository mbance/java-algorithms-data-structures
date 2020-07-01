public class Trie {
    char n;
    public Trie[] children;
    public boolean word;
    public String s;
    public Trie() {
        this.children = new Trie[27];
        word = false;
    }
    public void insert(String s) {
        this.s = s;
        if(s.isEmpty()){
            this.word = true;
            this.children[26] = new Trie();
            return;
        }
        char letter = s.charAt(0);
        int index = letter - 'a';
        if(this.children[index] == null){
            this.children[index] = new Trie();
            this.children[index].n = letter;
        }
        this.children[index].insert(s.substring(1));

    }

    public boolean query(String s) {
        if(s.isEmpty()) return this.word;

        int idx = s.charAt(0) - 'a';

        if(this.children[idx] == null){
            return false;
        }

        return this.children[idx].query(s.substring(1));
    }
    public String getString(){
        return s;
    }
}
import java.util.*;

public class HashTable {
    // public for testing purposes

    public int buckets[]; //buckets array
    long a, c, m;

    public HashTable(long _a, long _c, long _m) {
    }

    //instance variables
    this.m = (int)_m;
    this.a = (int)_a;
    this.c = (int)_c;

    buckets - new int(int)_m);

    public void hash(int key){
        return (int)(_a * key + _c) % _m;
    }

    public void insert(int key) {
        /*
        function insert(o,h)
            i ← hash(o,h); k ← 0
            repeat
                j ← probe(i,k,h); k ← k + 1
            until free?(h.table[j])
            h.table[j] ← o
        end function
        */

        i = key;
        k = 0;
        Do{
            j = probe();
            k++;
        }
        Until{
            HashTable[j]
        }
        HashTable[j] = o
    }

    public boolean find(int key) {
    
    /*
        function find(o,h)
            i ← hash(o,h); k ← 0
            repeat
                j ← probe(i,k,h); k ← k + 1
                if h.table[j] = o then
                    return true
                end if
            until empty?(h.table[j])
            return false
        end function
    */
    }


    public void delete(int key)

    /*
    function delete(o,h)
        i ← hash(o,h); k ← 0
        repeat
            j ← probe(i,k,h); k ← k + 1
        until h.table[j] = o
        h.table[j] ← †
    end function

    function free?(value)
        return empty?(value) ∨ value = †
    end function
    */

    public double loadFactor() {
        return 0.0;
    }
}
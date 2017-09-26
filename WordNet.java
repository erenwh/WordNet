import java.util.HashMap;

/**
 * @Author Han Wang
 * @Date 3/29/17
 */
public final class WordNet {
    HashMap<String, Bag<Integer>> map;
    // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) {}
    // is the word a WordNet noun? This can be used to search for existing
// nouns at the beginning of the printSap method
    public boolean isNoun(String word) {
        return false;
    }
    //string -> set of integer
    // print the synset (second field of synsets.txt) that is the common ancestor
// of nounA and nounB in a shortest ancestral path as well as the length of the path,
// following this format: "sap<space>=<space><number>,<space>ancestor<space>=<space><synsettext>"
// If no such path exists the sap should contain -1 and ancestor should say "null"
// This method should use the previously defined SAP datatype
    public void printSap(String nounA, String nounB) {}
}

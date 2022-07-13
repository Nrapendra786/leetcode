package mypack.design_add_andsearch_words;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    Map<Character,TrieNode> children = new HashMap<Character,TrieNode>();
    boolean endOfWord=false;
    public TrieNode() {}

    public void addWord(String word){
        TrieNode current = this;
        for(char c: word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                current.children.put(c, new TrieNode());
            }
            current = current.children.get(c);
        }
    }



}

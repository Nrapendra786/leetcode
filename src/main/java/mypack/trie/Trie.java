package mypack.trie;

import javax.swing.table.TableRowSorter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        Map<Character, TrieNode> children = root.children;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode t;
            if (children.containsKey(ch)) {
                t = children.get(ch);
            } else {
                t = new TrieNode(ch);
                children.put(ch,t);
            }
           // children = t.children;
            if (i == word.length() - 1) {
                t.isLeaf = true;
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = searchNode(word);
        return node != null && node.isLeaf;
    }

    public boolean startsWith(String prefix) {
        return Objects.nonNull(searchNode(prefix));
    }

    private TrieNode searchNode(String str) {
        Map<Character, TrieNode> children = root.children;
        TrieNode node = null;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (children.containsKey(ch)) {
                node = children.get(ch);
                node.children = children;
            } else {
                return null;
            }
        }
        return node;
    }
}



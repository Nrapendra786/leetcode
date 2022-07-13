package mypack.design_add_andsearch_words;

public class WordDictionary {

  private TrieNode root;

  public WordDictionary(){
      root = new TrieNode();
  }

  public void addWord(String word){
      TrieNode currentNode = root;
      for(char c : word.toCharArray()){
            if(!currentNode.children.containsKey(c)){
                currentNode.children.put(c,new TrieNode());
            }
            currentNode = currentNode.children.get(c);
      }
      currentNode.endOfWord=true;
  }

  private boolean searchInWord(String word, TrieNode trieNode){
        for(int i=0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!trieNode.children.containsKey(ch)){
                if(ch == '.') {
                    for(char charac : trieNode.children.keySet()){
                        TrieNode child = trieNode.children.get(charac);
                        if(searchInWord(word.substring(i+1), child)){
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                trieNode = trieNode.children.get(ch);
            }
        }
        return trieNode.endOfWord;
  }

  public boolean search(String word){
      return searchInWord(word,root);
  }
}

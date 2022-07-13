package mypack.tree_printer;


import java.util.*;

public class TreePrinter {

    public static void printTree(List<Relation> relations){

        Map<String,List<String>> maps = new HashMap<String,List<String>>();
        Set<String> childrens = new HashSet<>();
        List<String> newList;
        for(Relation relation : relations){
            childrens.add(relation.getChild());
            if (maps.containsKey(relation.getParent())) {
                 maps.get(relation.getParent()).add(relation.getChild());
            } else {
                newList = new ArrayList<>();
                newList.add(relation.getChild());
                maps.put(relation.getParent(), newList);
            }
        }

        String root= "";
        for(Map.Entry<String,List<String>> entry : maps.entrySet()) {
            if(!childrens.contains(entry.getKey())){
                root= entry.getKey();
                break;
            }
        }
        dfs(root,0,maps);
    }

    private static void dfs(String root,int level,Map<String,List<String>> maps){
       for(int i=0;i< level;i++){
           System.out.println("\t");
       }
        List<String> children;
        System.out.println(root);
       if(maps.containsKey(root)){
           children = maps.get(root);
       } else {
           return;
       }

       for(String child:children){
           dfs(child,level + 1, maps);
       }

    }

    public static void main(String[] args) {
        List<Relation> relations = new ArrayList<>();
        relations.add(new Relation("animal","mammal"));
        relations.add(new Relation("animal","bird"));
        relations.add(new Relation("lifeform","animal"));
        relations.add(new Relation("cat","loin"));
        relations.add(new Relation("mammal","cat"));
        relations.add(new Relation("animal","fish"));
        TreePrinter.printTree(relations);
    }
}

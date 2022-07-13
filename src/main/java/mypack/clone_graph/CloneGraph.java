package mypack.clone_graph;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {

    public Node cloneGraph(Node node) {
        if(node == null)
            return node;
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Node> map = new HashMap<>();//
        // Add the node to the queue. Give the start node a clone in the vertexMap
        Node head = new Node(node.val, new ArrayList<>());//
        map.put(node, head);
        queue.add(node);
        while (!queue.isEmpty()){
           Node tmp = queue.remove();
           for(Node n : tmp.neighbors){
                if (!map.containsKey(n)){
                    map.put(n,new Node(n.val,new ArrayList<>()));
                    queue.add(n);
                }
              map.get(tmp).neighbors.add(map.get(n));
           }
        }
        return head;
    }
}

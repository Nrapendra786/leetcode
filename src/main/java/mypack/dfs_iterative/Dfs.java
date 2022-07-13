package mypack.dfs_iterative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Edge
{
    int source, dest;

    public Edge(int source, int dest)
    {
        this.source = source;
        this.dest = dest;
    }
}

class Graph
{
    // A list of lists to represent an adjacency list
    List<List<Integer>> adjList = null;

    // Constructor
    Graph(List<Edge> edges, int n)
    {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // add edges to the undirected graph
        for (Edge edge: edges)
        {
            int src = edge.source;
            int dest = edge.dest;

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}

public class Dfs {

    public static void iterativeDFS(Graph graph,int v, boolean [] discovered) {
           Stack<Integer> stack = new Stack();
           stack.push(v);
           while (!stack.empty()){
               v = stack.pop();
               if(discovered[v]){
                    continue;
               }
               discovered[v] = true;
               List<Integer> adjList = graph.adjList.get(v);
               for(int i = adjList.size() -1; i>=0 ;i++){
                    int u = adjList.get(i);
                    if(!discovered[u]){
                        stack.push(u);
                    }
               }
           }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                // Notice that node 0 is unconnected
                new Edge(1, 2), new Edge(1, 7), new Edge(1, 8), new Edge(2, 3),
                new Edge(2, 6), new Edge(3, 4), new Edge(3, 5), new Edge(8, 9),
                new Edge(8, 12), new Edge(9, 10), new Edge(9, 11)
                // (6, 9) introduces a cycle
        );

        // total number of nodes in the graph (labelled from 0 to 12)
        int n = 13;

        // build a graph from the given edges
        Graph graph = new Graph(edges, n);

        // to keep track of whether a vertex is discovered or not
        boolean[] discovered = new boolean[n];

        // Do iterative DFS traversal from all undiscovered nodes to
        // cover all connected components of a graph
        for (int i = 0; i < n; i++)
        {
            if (!discovered[i]) {
                iterativeDFS(graph, i, discovered);
            }
        }
    }
}

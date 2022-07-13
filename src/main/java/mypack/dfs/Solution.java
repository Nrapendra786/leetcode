package mypack.dfs;
import java.util.*;
class Solution {

    public boolean validPath(int n, int[][] edges, int start, int end) {

        if (start == end) return true;

        Graph graph = new Graph(n);

        for (int edge[] : edges) {
            graph.addEdge(edge[0], edge[1]);
        }
        return graph.isConnected(start, end);
    }
}

class Graph {

    private int nodes;
    private List<List<Integer>> graph;
    private boolean[] visited;

    public Graph(int nodes) {
        this.nodes = nodes;
        this.graph = new ArrayList<>();
        this.visited = new boolean[nodes];

        for (int i = 0; i < nodes; ++i) {
            this.graph.add(i, new ArrayList<>());
        }
    }

    public void addEdge(int a, int b) {
        this.graph.get(a).add(b);
        this.graph.get(b).add(a);
    }

    public boolean isConnected(int source, int destination) {
        dfs(source);
        return this.visited[destination];
    }

    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            this.visited[node] = true;

            for (int i : this.graph.get(node)) {
                if (!this.visited[i]) {
                    stack.push(i);
                }
            }
        }
    }
}

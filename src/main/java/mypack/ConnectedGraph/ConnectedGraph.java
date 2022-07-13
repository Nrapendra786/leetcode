package mypack.ConnectedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectedGraph {

    public static int countComponents(int n, int[][] edges) {

        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        boolean []visited= new boolean[n];

        int count = 0;

        for(int i = 0; i < n;i++) {
            graph.put(i, new ArrayList<>());
        }

        for(int i = 0; i < edges.length;i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,graph,visited);
            }
        }
        return count;
    }

    private static void dfs(int at, HashMap<Integer,List<Integer>> graph, boolean[] visited) {
       visited[at]=true;
       for(Integer child: graph.get(at)){
             if(!visited[child]) {
                 dfs(child, graph, visited);
             }
       }
    }

    public static void main(String[] args) {
        System.out.println(countComponents(5, new int[][] {{0,1},{1,2},{3,4}}));
        System.out.println(countComponents(5, new int[][] {{0,1},{1,2},{2,3},{3,4}}));
    }
}

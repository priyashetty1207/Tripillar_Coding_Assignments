package Module14Graphs;

import java.util.*;

public class DFS {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    DFS(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    void dfs(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int n : adj.get(node)) {
            if (!visited[n])
                dfs(n, visited);
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);

        boolean[] visited = new boolean[4];
        g.dfs(0, visited);
    }
}

package Module14Graphs;

import java.util.*;

public class GraphTraversal {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    GraphTraversal(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    void traverse(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int n : adj.get(node)) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversal g = new GraphTraversal(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);

        g.traverse(0);
    }
}
package Module14Graphs;

import java.util.*;

public class DetectCycle {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    DetectCycle(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    boolean hasCycle(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int n : adj.get(node)) {
            if (!visited[n]) {
                if (hasCycle(n, visited, node))
                    return true;
            } else if (n != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycle g = new DetectCycle(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0);

        boolean[] visited = new boolean[3];

        System.out.println("Cycle exists: " + g.hasCycle(0, visited, -1));
    }
}
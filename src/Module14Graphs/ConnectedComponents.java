package Module14Graphs;
import java.util.*;

public class ConnectedComponents {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    ConnectedComponents(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void dfs(int node, boolean[] visited) {
        visited[node] = true;

        for (int n : adj.get(node)) {
            if (!visited[n])
                dfs(n, visited);
        }
    }

    int countComponents() {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ConnectedComponents g = new ConnectedComponents(5);
        g.addEdge(0,1);
        g.addEdge(2,3);

        System.out.println("Components: " + g.countComponents());
    }
}

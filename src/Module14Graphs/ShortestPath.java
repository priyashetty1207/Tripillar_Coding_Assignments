package Module14Graphs;
import java.util.*;

public class ShortestPath {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    ShortestPath(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void shortestPath(int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        dist[src] = 0;
        q.add(src);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : adj.get(node)) {
                if (dist[n] == -1) {
                    dist[n] = dist[node] + 1;
                    q.add(n);
                }
            }
        }

        System.out.println("Distances: " + Arrays.toString(dist));
    }

    public static void main(String[] args) {
        ShortestPath g = new ShortestPath(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);

        g.shortestPath(0);
    }
}
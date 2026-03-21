package Module14Graphs;

import java.util.*;

public class PrintNeighbors {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int V = 3;
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);

        int node = 0;
        System.out.println("Neighbors of " + node + ": " + adj.get(node));
    }
}

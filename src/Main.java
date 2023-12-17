public class Main {

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(2, 2);
        System.out.println(g.toString());

        int[] adj = g.findAdjacencyVertices(2);
        for (int i = 0; i < adj.length; i++) {
            System.out.print(adj[i] + " ");
        }
        System.out.println();

        g.removeEdge(2,2);
        g.removeEdge(0, 2);
        for (int i = 0; i < adj.length; i++) {
            System.out.print(adj[i] + " ");
        }
        System.out.println();
    }
}

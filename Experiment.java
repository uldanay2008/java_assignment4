public class Experiment {
    public void runTraversals(Graph g, int startNode) {
        System.out.println("\n--- Result ---");

        long start = System.nanoTime(); // Замер времени начала
        System.out.print("BFS: ");
        g.bfs(startNode);
        long end = System.nanoTime(); // Конец замера
        System.out.println("\nBFS Time: " + (end - start) + " ns");

        start = System.nanoTime();
        System.out.print("DFS: ");
        g.dfs(startNode);
        end = System.nanoTime();
        System.out.println("\nDFS Time: " + (end - start) + " ns");
    }

    public Graph createGraph(int size) {
        Graph g = new Graph();
        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i)); // Создание графа заданного размера
        }
        // Создаем простые связи (например, цепочка)
        for (int i = 0; i < size - 1; i++) {
            g.addEdge(i, i + 1);
        }
        return g;
    }
}
public class Edge {
    private Vertex source; // Начальная вершина
    private Vertex destination; // Конечная вершина

    public Edge(Vertex source, Vertex destination) {
        this.source = source; // Конструктор
        this.destination = destination;
    }

    public Vertex getSource() { return source; } // Геттеры
    public Vertex getDestination() { return destination; }

    @Override
    public String toString() {
        return source + " -> " + destination; // Метод toString
    }
}
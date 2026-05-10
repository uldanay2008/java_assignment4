public class Main {
    public static void main(String[] args) {
        Experiment exp = new Experiment();

        // Тест на 10 вершинах
        System.out.println("Small graph (10 vertices)");
        Graph small = exp.createGraph(10);
        exp.runTraversals(small, 0);

        // Тест на 30 вершинах
        System.out.println("\nMedium graph (30 vertices)");
        Graph medium = exp.createGraph(30);
        exp.runTraversals(medium, 0);

        // Тест на 100 вершинах
        System.out.println("\nLarge graph (100 vertices)");
        Graph large = exp.createGraph(100);
        exp.runTraversals(large, 0);
    }
}
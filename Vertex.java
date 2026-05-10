public class Vertex {
    private int id; // Уникальный идентификатор

    public Vertex(int id) {
        this.id = id; // Конструктор
    }

    public int getId() {
        return id; // Геттер
    }

    @Override
    public String toString() {
        return "V" + id; // Метод toString
    }
}
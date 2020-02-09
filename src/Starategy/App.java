package Starategy;

public class App {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setStrategy(new Multiply());
        manager.operation(5, 5);

    }
}

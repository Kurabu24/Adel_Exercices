public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car();
        car1.speed = 0;
        car1.speedUp();
        System.out.println(car1.speed);
        Bicycle bicycle1 = new Bicycle();
        bicycle1.speed = 0;
        bicycle1.speedUp();
        System.out.println(bicycle1.speed);
    }
}
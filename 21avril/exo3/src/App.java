public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Fraction fraction1 = new Fraction(4, 5);
        Fraction fraction2 = new Fraction(1, 8);
        Fraction result = fraction1.add(fraction2);
        result.reduceFrac();
        System.out.println(result.toString());
    }
}

public class App {
    public static void main(String[] args) {
        Dih4 t1 = new Dih4(Transform.ROTATE_90_CLOCKWISE);
        Dih4 t2 = new Dih4(Transform.REFLECT_VERTICAL);
        Dih4 result = t1.then(t2);
        System.out.println(result.toString());

        Dih4 inv = t1.inv();
        System.out.println(inv.toString());
        System.out.println(result.equals(inv));
        System.out.println(result.equals(result));
    }
}

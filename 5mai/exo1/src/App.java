public class App {
    int digitCount = 0;
    public int count(double n){
        if(n*n < 1){
            int result = digitCount;
            digitCount = 0;
            return result;
        }
        else{
            digitCount ++;
            n = n/10;
            return count(n);
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
        System.out.println(app.count(318));
        System.out.println(app.count(-92563));
        System.out.println(app.count(4666));
        System.out.println(app.count(-314890));
        System.out.println(app.count(654321));

    }
}

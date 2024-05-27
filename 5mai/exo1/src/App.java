public class App {
    public int count(int n){
        if(n/10 == 0 ){
            return 1;
        }
        else{
            return  1 + count(n/10);
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

public class App {
    public static void main(String[] args) {
        VersionManager vm = new VersionManager("1.2.3");
        System.out.println(vm.release()); // Outputs: 1.2.3
        vm.major().patch();
        System.out.println(vm.release()); // Outputs: 2.0.1
        vm.rollback();
        System.out.println(vm.release()); // Outputs: 1.2.3
        vm.minor().patch().patch();
        System.out.println(vm.release()); // Outputs: 1.3.2
    }
}

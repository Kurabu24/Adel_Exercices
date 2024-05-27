import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    CoinMachine game = new CoinMachine() ;
    ArrayList<String> instr1= new ArrayList<>();
    instr1.add("share");
    ArrayList<String> instr2= new ArrayList<>();
    instr2.add("steal");
    ArrayList<String> instr3= new ArrayList<>();
    instr3.add("share");
    instr3.add("steal");
    ArrayList<String> instr4= new ArrayList<>();
    instr4.add("share");
    instr4.add("share");
    game.getCoinBalance(instr1, instr2);
    // Both people spend one coin, and receive 3 coins each.

    game.getCoinBalance(instr1, instr1);
    // Person 1 gains 3 coins, while person 2 loses a coin.

    game.getCoinBalance(instr3, instr4);
    // Neither person spends any coins and so no one gets rewarded.
    }
}

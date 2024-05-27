import java.util.ArrayList;

public class CoinMachine {
    public void getCoinBalance(ArrayList<String> person1, ArrayList<String> person2) {
        int wallet1 = 3;
        int wallet2 = 3;
        if (person1.size() != person2.size()) {
            System.err.println("We dont have the same number of instructions");
            return;
        }
        for (int i = 0; i < person1.size(); i++) {
            if (person1.get(i) == "share" && person2.get(i) == "share") {
                wallet1 += 2;
                wallet2 += 2;
            }
            else if (person1.get(i) == "steal" && person2.get(i) == "share") {
                wallet1 += 3;
                wallet2 -= 1;
            }
            else if (person1.get(i) == "share" && person2.get(i) == "steal") {
                wallet1 -= 1;
                wallet2 += 3;
            }
            else if (person1.get(i) == "steal" && person2.get(i) == "steal") {
            }
            else{
                System.err.println("a word in misspelled in the arraylist");
                break;
            }
        }
        ArrayList<Integer> balance = new ArrayList<>();
        balance.add(wallet1);
        balance.add(wallet2);
        System.out.println(balance);

    }

}
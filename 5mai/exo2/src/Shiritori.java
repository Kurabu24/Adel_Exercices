import java.util.ArrayList;

public class Shiritori {
    private ArrayList<String> words;
    private boolean game_over;

    public Shiritori() {
        this.words = new ArrayList<>();
        this.game_over = false;
    }
    public void restart(){
        this.words.clear();
        this.game_over = false;

    }

    private boolean isValid(String word) {
        if (this.words.isEmpty()) {
            return true;
        } else if (this.words.get(this.words.size() - 1).charAt(this.words.get(this.words.size() - 1).length()-1) == word
                .charAt(0)) {
            for(String element :this.words){
                if(element == word){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public void getWords(){
        System.out.println(this.words);
    }
    public void play(String word){
        if(game_over){
            return;
        }
        if(this.isValid(word)){
            this.words.add(word);
            System.out.println(this.words);
        }
        else{
            System.out.println("Game Over");
            this.game_over = true;
            return ;
        }
    }

}

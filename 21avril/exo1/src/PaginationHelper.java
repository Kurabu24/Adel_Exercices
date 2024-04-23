import java.util.List;
import java.util.ArrayList;
public class PaginationHelper<all> {
    private List<all> collection;
    private int itemparpage;
    private ArrayList<Integer> stack;
    public PaginationHelper(List<all> collection, int itemparpage){
        this.collection = collection;
        this.itemparpage = itemparpage;
        this.stack = new ArrayList<>();
    }
    public int pageCount(){
        return (int)Math.ceil((double)collection.size() / itemparpage);
    }
    public int itemCount(){
        return collection.size();
    }
    public int pageItemCount(int index){
        stack.add(index);
        if (index < 0 || index >= this.pageCount()){
            return -1;
        }
        if(index == this.pageCount() -1){
            return collection.size() % itemparpage == 0 ? itemparpage : collection.size() % itemparpage;

        }

        return itemparpage;
    }
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount()) {
            return -1;
        }
        return itemIndex / itemparpage;
    }
    public void nextPage(){
        if(stack.get(stack.size()-1)+1 >= this.pageCount()){
            System.err.println("Error you are in the last page");
        }
        else{
            itemsInPage(stack.get(stack.size()-1)+1);
        }
    }
    public void previousPage(){
        if(stack.size() == 0 || stack.size() == 1 ){
            System.out.println("You don't have a previous page");
        }
        else{
            itemsInPage(stack.get(stack.size()-1));
        }
    }
    public ArrayList<all> itemsInPage(int index){
        this.stack.add(index);
        ArrayList<all> tmp = new ArrayList<>();
        for(int i = 0;i < pageItemCount(index);i++){
            tmp.add(collection.get(index*this.itemparpage +i));
        }
        return tmp;
    }
    public String toString(ArrayList<all> list){
        String str ="";
        all tmp;
        for (int i = 0; i < list.size(); i++){
            tmp = list.get(i);
            str = str +tmp.toString();
        }
        return str;
    }
}

import java.util.List;
public class PaginationHelper<all> {
    private List<all> collection;
    private int itemparpage;
    public PaginationHelper(List<all> collection, int itemparpage){
        this.collection = collection;
        this.itemparpage = itemparpage;
    }
    public int pageCount(){
        return (int)Math.ceil((double)collection.size() / itemparpage);
    }
    public int itemCount(){
        return collection.size();
    }
    public int pageItemCount(int index){
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
}

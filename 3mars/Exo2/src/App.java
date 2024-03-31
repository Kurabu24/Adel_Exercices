public class App {
    public int search(SingleNum list){
        int [] final_list = new int[list.nums.length+1];
        MaxList mList = new MaxList(list);
        for (int i = 0 ; i < list.nums.length ; i++){
            if (mList.maxlist[list.nums[i]] == 1){
                final_list [i] = -list.nums[i];
            }
            if (mList.maxlist[list.nums[i]] == 0){
                mList.maxlist[list.nums[i]] = 1;
                final_list [i] = list.nums[i];
            }
            
        }
        int result = 0;
        for (int i=0; i < final_list.length ; i++){
            result += final_list[i];
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        int [] nums = {4,2,2,4,3,3,5};
        SingleNum singleNum1 = new SingleNum(nums);
        System.out.println(app.search(singleNum1));
    }
}

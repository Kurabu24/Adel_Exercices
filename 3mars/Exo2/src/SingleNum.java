public class SingleNum{
    int [] nums;
    SingleNum(int [] nums){
        this.nums = nums;
    }
    public int getMax(){
        int max = 0;
        for (int i:nums){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    

}
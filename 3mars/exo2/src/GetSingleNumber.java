public class GetSingleNumber {
    int [] nums;
    public int singlenums(int[] nums) {
        int a = 0;
        for (int i :nums){
            a = a ^ i; // it is a xor operation  
        }
        return a;
        //For exemple : a ^ b ^ a = b
    }
}

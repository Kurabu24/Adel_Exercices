public class App {
    public static void main(String[] args) {
    int[] nums1 = {2, 2, 1};
    int[] nums2 = {4, 1, 2, 1, 2};
    int[] nums3 = {1};
    GetSingleNumber getSingleNumber1 = new GetSingleNumber();
    GetSingleNumber getSingleNumber2 = new GetSingleNumber();
    GetSingleNumber getSingleNumber3 = new GetSingleNumber();
    System.out.println(getSingleNumber1.singlenums(nums1));
    System.out.println(getSingleNumber2.singlenums(nums2));
    System.out.println(getSingleNumber3.singlenums(nums3));
    
    }
}
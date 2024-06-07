public class codeTest5 {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {1, 2, 3, 4, 5};
    System.out.println(search(arr1, 9));
  }

  public static int search(int[] nums, int target) {
    int result = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        result = i;
        break;
      }
    }
    return result;
  }
}

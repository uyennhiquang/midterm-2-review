package unit04;

public class NodeStackMain {
  public static void main(String[] args) {
    NodeStack<Integer> nums = new NodeStack<Integer>(5);

    for (int i = 1; i < 11; i *= 2) {
      nums.push(i);
    }

    for (int num:nums) {
      System.out.println(num);
    }
  }
  
}

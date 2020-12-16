import java.util.*;
import java.io.*;

public class SortTester {
  public static void main(String[] args) {
    int[] tester1 = new int[] {5, 1, 122, -5, 16};
    System.out.println(Arrays.toString(tester1));
    //System.out.println(Arrays.toString(Sorts.swap(tester1, 0, 1))); //swap works
    //actual loop no
    Sorts.bubbleSort(tester1);
    System.out.println(Arrays.toString(tester1));



  }
}

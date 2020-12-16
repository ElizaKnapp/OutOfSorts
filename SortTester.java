import java.util.*;
import java.io.*;

public class SortTester {
  public static void main(String[] args) {
    int[] tester1 = new int[] {5, 1, 12, -5, 16};
    System.out.println(Arrays.toString(tester1));

    Sorts.bubbleSort(tester1);
    System.out.println(Arrays.toString(tester1));



  }
}

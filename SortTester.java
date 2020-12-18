import java.util.*;
import java.io.*;

public class SortTester {
  public static void main(String[] args) {

    int length = 100; //change this to make the array longer
    int times = 1000; //change this to make more individual test cases

    int error = 0;
    for (int j = 0; j < times; j++) {
      Random num = new Random();
      int seed = num.nextInt()  % 1000;
      Random tester = new Random(seed);
      int[] testArr = new int[length];
        for (int i = 0; i < length; i++) {
          testArr[i] = tester.nextInt() % 1000;
        }
      int[] clone = testArr.clone();
      Arrays.sort(clone);
      Sorts.bubbleSort(testArr);
      if (!Arrays.equals(clone, testArr)) {
        System.out.println("problem with test case #" + j);
        error++;
      }
    }
    if (error == 0) {
      System.out.println("everything works");
    }


  }
}

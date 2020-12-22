import java.util.*;
import java.io.*;

public class SortTester{

  public static void main(String[]args){
    //args 0 must be "bubble" or "test" (unless you add more)

    int length = 100; //change this to make the array longer
    int times = 1000; //change this to make more individual test cases

    if(args[0].equals("bubble")){
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
          error++;
        }
      }
      if (error == 0) {
        System.out.println("everything works");
      }
      else {
        System.out.println("there is a problem with random sort no duplicates");
      }
    }
    if(args[0].equals("selection")){
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
        Sorts.selectionSort(testArr);
        if (!Arrays.equals(clone, testArr)) {
          error++;
        }
      }
      if (error == 0) {
        System.out.println("everything works");
      }
      else {
        System.out.println("there is a problem with random sort no duplicates");
      }
    }
    if(args[0].equals("insertion")){
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
        Sorts.insertionSort(testArr);
        if (!Arrays.equals(clone, testArr)) {
          error++;
        }
      }
      if (error == 0) {
        System.out.println("everything works");
      }
      else {
        System.out.println("there is a problem with random sort no duplicates");
      }
    }


  }
}

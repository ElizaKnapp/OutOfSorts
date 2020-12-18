import java.util.*;
import java.io.*;

public class Sorts {
  public static void bubbleSort(int[] data) {
    int count = 0;
    for (int i = 0; i < data.length - 1; i++) {
      count = 0;
      //System.out.println("round " + i);
      for (int j = 0; j < data.length - 1 - i; j++) {
        if (data[j] > data[j + 1]) {
          int holder = data[j];
          data[j] = data[j + 1];
          data[j + 1] = holder;
          count++;
        }
        //System.out.println(Arrays.toString(data));
      }
      if (count == 0) {
        i = data.length;
      }
    }
  }

  public static void selectionSort(int[] data) {
    int indexOfLow = 0;
    for (int i = 0; i < data.length - 1; i++) {
      indexOfLow = 0;
      for (int j = i; j < data.length; j++) {
        if (data[j] < data[indexOfLow]) {
          indexOfLow = j;
        }
      }
      int temp = data[0];
      data[0] = data[indexOfLow];
      data[indexOfLow] = temp;
    }
  }

//  public static void insertionSort(int[] data) {

//  }

}

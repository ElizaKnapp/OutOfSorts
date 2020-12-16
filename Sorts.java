import java.util.*;
import java.io.*;

public class Sorts {
  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length - 1; i++) {
      if (data[i] > data[i + 1]) {
        data = swap(data, i, i + 1);
      }
    }
  }

  public static int[] swap(int[] data, int index1, int index2) {
    //trying to replace index 1 and 2
    int[] ans = new int[data.length];
    for (int i = 0; i < index1; i++) {
      ans[i] = data[i];
    }
    ans[index1] = data[index2];
    ans[index2] = data[index1];
    for (int i = index2 + 1; i < data.length; i++) {
      ans[i] = data[i];
    }
    return ans;
  }
}

import java.util.*;
import java.io.*;

public class Sorts {
  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - 2 - i; j++) {
        if (data[j] > data[j + 1]) {
          int holder = data[j];
          data[j] = data[j + 1];
          data[j + 1] = holder;
        }
      }
    }

  }

}

public class Sorts {

  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length - 1; i++) {
      if (data[i] > data[i + 1]) {
        data = swap(data, data[i], data[i + 1]);
      }
    }
  }
}

public class QuickSort {

  public void sort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
    for (int a : arr) {
      System.out.print(a + ", ");
    }
    System.out.println();
    try {
      Thread.sleep(5000);
    } catch(Exception ex) {}
  }

  public void quickSort(int[] arr, int left, int right) {
    if (left < right) {
      int p = partition(arr, left, right);
      quickSort(arr, left, p - 1);
      quickSort(arr, p + 1, right);
    }
  }

  public int partition(int[] arr, int left, int right) {
    int pivot = arr[right];
    int i = left - 1;

    for (int j = left; j < right; ++j) {
      if (arr[j] <= pivot) { 
        ++i;
        swap(arr,i,j);
      }
    }
    swap(arr, i+1, right);
    return i+1;
  }

  public void swap(int[] arr, int a, int b) {
    if (a == b) return;
    printArray(arr, a, b);
    int aux = arr[a];
    arr[a] = arr[b];
    arr[b] = aux;
    printArray(arr, b, a);
    printArray(arr, null, null);
  }

  public void printArray(int[] arr, Integer x, Integer y) {
    int max = arr[0];
    int min = 0;
    for (int a : arr) {
      max = Math.max(max, a);
      min = Math.min(min, a);
    }
    System.out.print("\033[0;0H\033[2J");
    for (int i = max+1; i > 0; --i) {
      System.out.print("⬜");
      for (int a = 0; a < arr.length; ++a) {
        if (arr[a] < i || arr[a] <= 0) {
          System.out.print("⬜");
        } else {
          if (y != null && a == y) {
            System.out.print("🟥");
          } else if(x != null && a == x) {
            System.out.print("🟩");
          } else {
            System.out.print("⬛");
          }
        }
      }
      System.out.println("⬜");
    }
    for (int i = 0; i >= min; --i) {
      System.out.print("⬜");
      for (int a = 0; a < arr.length; ++a) {
        if (arr[a] >= i || arr[a] >= 0) {
          System.out.print("⬜");
        } else {
          if (y != null && a == y) {
            System.out.print("🟥");
          } else if(x != null && a == x) {
            System.out.print("🟩");
          } else {
            System.out.print("⬛");
          }
        }
      }
      System.out.println("⬜");
    }
    System.out.println();
    try {
      Thread.sleep(500);
    } catch(Exception ex) {}
  }
}
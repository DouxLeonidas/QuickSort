class Main {
  public static void main(String[] args) {
    System.out.println("Let's Sort");
    QuickSort qs = new QuickSort();
    qs.sort(new int[]{1,6,2,8,3,7});
    qs.sort(new int[]{5,5,1,4,3,2,5,4,3,6});
    qs.sort(new int[]{24,21,18,15,12,9,6,3});
    qs.sort(new int[]{1,-2,3,-4,5,-6,7,-8,9,-10});
  }
}
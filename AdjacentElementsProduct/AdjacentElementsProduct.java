class AdjacentElementsProduct {

  public static void main(String args[]) {
    int[] inputArray = {3, 6, -2, -5, 7, 3};
    AdjacentElementsProduct a = new AdjacentElementsProduct();
    System.out.println(a.adjacentElementsProduct(inputArray));
  }

  int adjacentElementsProduct(int[] inputArray) {
    int i = 0;
    int j = 1;

    int largest = -1000;
    while (j < inputArray.length) {
        int temp = inputArray[i] * inputArray[j];
        if (temp > largest) {
            largest = temp;
        }

        i++;
        j++;
    }
    return largest;
  }
}

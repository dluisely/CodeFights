class Add {

  public static void main(String args[]) {
    int param1 = 1;
    int param2 = 2;
    Add a = new Add();
    System.out.println(a.add(param1, param2));
  }

  public int add(int param1, int param2) {
      int sum = param1 + param2;
      return sum;
  }
}

class MakeArrayConsecutive2 {

  public static void main(String args[]) {
    int[] statues = {6, 2, 3, 8};
    MakeArrayConsecutive2 m = new MakeArrayConsecutive2();
    System.out.println(m.makeArrayConsecutive2(statues));
  }

  int makeArrayConsecutive2(int[] statues) {

    int min = statues[0];
    int max = statues[0];

    for (int i = 1; i < statues.length; i++) {
        if (statues[i] > max) {
            max = statues[i];
        }
        if (statues[i] < min) {
            min = statues[i];
        }
    }

    int additional = (max - min) - (statues.length - 1);
    return additional;
  }
}

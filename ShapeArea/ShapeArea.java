class ShapeArea {

  public static void main(String args[]) {
    int n = 7000;
    ShapeArea s = new ShapeArea();
    System.out.println(s.shapeArea(n));
  }

  int shapeArea(int n) {
    int area = 1;

    for (int i = 1; i < n; i++) {
        area += 4 * i;
    }

    return area;
}
}

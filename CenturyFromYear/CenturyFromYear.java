class CenturyFromYear {

  public static void main(String args[]) {
    int year = 1905;
    CenturyFromYear c = new CenturyFromYear();
    System.out.println(c.centuryFromYear(year));
  }

  int centuryFromYear(int year) {
    if (year > 2005 || year < 0) {
        System.out.println("Year is invalid");
    }

    int endDigits = year % 100;

    if (endDigits == 00) {
        return year/100;
    } else {
        return (year/100) + 1;
    }

  }
}

public class Date {
  private int year, month, day;

  public Date(int year, int month, int day) {
    setYear(year);
    setMonth(month);
    setDay(day);
  }

  public String toString() {
    return year + "/" + month + "/" + day;
  }

  public boolean isNewerThan(Date date) {
    if (this.year > date.year)
      return true;
    if (this.year == date.year) {
      if (this.month > date.month)
        return true;
      if (this.month == date.month)
        if (this.day > date.day)
          return true;
    }
    return false;
  }

  public int getYear() {
    return year;
  }

  private void setYear(int year) {
    this.year = year;
  }

  private void setMonth(int month) {
    this.month = month < 1 || month > 12 ? 1 : month;
  }

  private void setDay(int day) {
    this.day = day < 1 || day > daysInMonth() ? 1 : day;
  }

  private int daysInMonth() {
    switch (month) {
      case 2: return isLeap() ? 29 : 28;
      case 4: case 6: case 9: case 11: return 30;
      default: return 31;
    }
  }

  private boolean isLeap() {
    return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
  }
}

public class Movie implements Content {
  private String title;
  private double sizeInMB;
  private double price;

  public Movie(String title, double sizeInMB, double price) {
    this.title = title;
    this.sizeInMB = sizeInMB;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

    public double getSizeInMB() {
    return sizeInMB;
  }

    public double getPrice() {
    return price;
  }
}
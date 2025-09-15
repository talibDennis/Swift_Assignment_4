import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ContentServer server = new VideoServer();
    Store store = new Store(server);

    List<Content> availableMovies = store.listAvailableMovies();
    List<Content> selectedMovies = Arrays.asList(availableMovies.get(0), availableMovies.get(2));

    double totalPrice = store.calculateTotalPrice(selectedMovies);
    double downloadTime = store.estimateDownloadTime(selectedMovies, 50);

    System.out.println("Selected Movies");
    for (Content movie : selectedMovies) {
      System.out.println("- " + movie.getTitle());
    }

    System.out.printf("Total Price: $%,2f%n", totalPrice);
    System.out.printf("Estimated Download Time: %.2f seconds%n", downloadTime);

  }
}
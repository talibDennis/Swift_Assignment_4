import java.util.ArrayList;
import java.util.List;

public class VideoServer implements ContentServer {
  private List<Content> movies;

  public VideoServer() {
    movies = new ArrayList<>();
    movies.add(new Movie("Inception", 1500, 4.99));
    movies.add(new Movie("Interstellar", 200, 5.99));
    movies.add(new Movie("The Matrix", 1200, 3.99));
  }

  public List<Content> fetchAvailableContent() {
    return movies;
  }

}
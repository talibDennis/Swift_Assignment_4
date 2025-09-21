import java.util.List;

public class Store {
  private ContentServer server;

  public Store(ContentServer server) {
    this.server = server;
  }

  public List<Content> listAvailableMovies() {
    return server.fetchAvailableContent();
  }

  public double calculateTotalPrice(List<Content> selectedMovies) {
    return selectedMovies.stream().mapToDouble(Content::getPrice).sum();
  }

  public double estimateDownloadTime(List<Content> selectedMovies, double speedMbps) {
    double totalSizeMB = selectedMovies.stream().mapToDouble(Content::getSizeInMB).sum();
    double speedMBps = speedMbps / 8.0;
    return totalSizeMB / speedMBps;
  }
}
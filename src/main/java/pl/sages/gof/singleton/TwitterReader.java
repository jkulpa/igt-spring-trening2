package pl.sages.gof.singleton;

/**
 * Załóżmy, że zabronione jest crawlowanie Twitter'a przez kilka instancji tej samej aplikacji.
 * Zadbaj o to, aby nie dało się powołać kilku takich obiektów.
 */
public class TwitterReader {

  public String readFeed(String profileId) {
    // ...
    return "ANY FEED";
  }
}

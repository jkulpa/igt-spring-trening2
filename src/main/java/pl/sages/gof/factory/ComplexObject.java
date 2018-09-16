package pl.sages.gof.factory;

public class ComplexObject {

  private DatabaseService databaseService;

  private TokenExtractor tokenExtractor;

  public ComplexObject(DatabaseService databaseService, TokenExtractor tokenExtractor) {
    this.databaseService = databaseService;
    this.tokenExtractor = tokenExtractor;
  }

  public void doSomething() {
    // ...
  }
}

package pl.sages.gof.factory;

public class DatabaseService {

  private String jdbcString;

  public DatabaseService(String jdbcString) {
    this.jdbcString = jdbcString;
  }

  public String getData(String id) {
    // ...
    return "ANY";
  }
}

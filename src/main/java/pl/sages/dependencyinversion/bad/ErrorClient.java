package pl.sages.dependencyinversion.bad;

public class ErrorClient {
  public String sendAlert(String weatherConditions) {
    return "It is " + weatherConditions;
  }
}

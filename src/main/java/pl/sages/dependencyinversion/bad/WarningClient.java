package pl.sages.dependencyinversion.bad;

public class WarningClient {

  public String sendAlert(String weatherConditions) {
    return "It is " + weatherConditions;
  }
}

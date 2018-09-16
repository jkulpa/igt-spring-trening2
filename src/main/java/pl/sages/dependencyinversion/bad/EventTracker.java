package pl.sages.dependencyinversion.bad;

public class EventTracker {

  private String currentStatus;
  private ErrorClient errorClient;
  private WarningClient warningClient;

  public EventTracker() {
    errorClient = new ErrorClient();
    warningClient = new WarningClient();
  }

  public void setCurrentStatus(String actualState) {
    this.currentStatus = actualState;
    if (actualState.equals("error")) {
      String alert = errorClient.sendAlert(actualState);
      System.out.print(alert);
    }
    if (actualState.equals("warning")) {
      String alert = warningClient.sendAlert(actualState);
      System.out.print(alert);
    }
  }
}
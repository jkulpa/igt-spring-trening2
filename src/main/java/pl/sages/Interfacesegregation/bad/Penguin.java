package pl.sages.Interfacesegregation.bad;

public class Penguin implements Bird {
  private String currentLocation;
  private int numberOfFeathers;

  public Penguin(int initialFeatherCount) {
    this.numberOfFeathers = initialFeatherCount;
  }

  public void molt() {
    this.numberOfFeathers -= 1;
  }

  public void fly() {
    throw new UnsupportedOperationException();
  }

  public void swim() {
    this.currentLocation = "in the water";
  }
}
package pl.sages.gof.observer;


public class FirstObserver implements EventObserver {

  @Override
  public void eventChanged(Event event) {
    System.out.println("FirstObserver -> GOT " + event);
  }
}

package pl.sages.gof.observer;


public class SecondObserver implements EventObserver {

  @Override
  public void eventChanged(Event event) {
    System.out.println("SecondObserver -> GOT " + event);
  }
}

package pl.sages.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class Machine {

  private Event event;

  private List<EventObserver> eventObservers = new ArrayList<>();

  public void addObserver(EventObserver eventObserver) {
    eventObservers.add(eventObserver);
  }

  public void rmObserver(EventObserver eventObserver) {
    eventObservers.remove(eventObserver);
  }

  public void changeEvent(Event event) {
    this.event = event;
    notifyObservers();
  }

  private void notifyObservers() {
    eventObservers.forEach(eo -> eo.eventChanged(event));
  }

}

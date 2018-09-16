package pl.sages.gof.adapter;

/**
 * Kapitan potrafi korzystać z łodzi wiosłowej (ROW), która porusza się za pomocą metody row(..)
 */

public class Captain {

  private RowingBoat rowingBoat;

  public Captain() {}

  public Captain(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  public void setRowingBoat(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  public void row() {
    rowingBoat.row();
  }

}

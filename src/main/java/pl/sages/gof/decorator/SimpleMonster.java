package pl.sages.gof.decorator;

public class SimpleMonster implements Monster {

  @Override
  public void attack() {
    System.out.println("The troll tries to grab you!");
  }

  @Override
  public int getAttackPower() {
    return 10;
  }
}

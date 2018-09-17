package pl.igt;

/**
 * Created by acacko on 17.09.18
 */
public class MyClass implements MyInterface {


  @Override
  public boolean isValid(Object o) {
    return true;
  }

  @Override
  public boolean isValid1(Object o) {
    return true;
  }

  public static void main(String[] args) {
    MyInterface.isValid2(new Object());
  }
}

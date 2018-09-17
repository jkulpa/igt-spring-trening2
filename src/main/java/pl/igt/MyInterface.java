package pl.igt;


public interface MyInterface {

  boolean isValid(Object o);

  default boolean isValid1(Object o) {
    //....
    return isValid2(o);
  }

  static boolean isValid2(Object o) {
    //....

    return true;
  }

}

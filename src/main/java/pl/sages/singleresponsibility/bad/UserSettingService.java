package pl.sages.singleresponsibility.bad;

public class UserSettingService {

  public void changeEmail(User user) {
    if (checkAccess(user)) {
      //Grant option to change
    }
  }

  public boolean checkAccess(User user) {
    //Verify if the user is valid.
    return false;
  }
}

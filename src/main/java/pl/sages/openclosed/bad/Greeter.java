package pl.sages.openclosed.bad;

public class Greeter {

  private String formality;

  public String sayHello() {
    if (this.formality.equals("formal")) {
      return "Good evening, sir.";
    }
    else if (this.formality.equals("casual")) {
      return "What's up bro!";
    }
    else if (this.formality.equals("intimate")) {
      return "Hello Darling!";
    }
    else {
      return "Hello.";
    }
  }

  public void setFormality(String formality) {
    this.formality = formality;
  }
}
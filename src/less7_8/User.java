package less7_8;

public class User {
  public User(String login, String password) {
    this.login = login;
    this.password = password;
  }
  public String login, password;
  public Basket purchased;
  boolean isAuth(String login, String password) {
    if(this.login.equals(login) && this.password.equals(password)) return true;
    else return false;
  }

}

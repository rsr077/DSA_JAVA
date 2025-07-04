class User {
  String name = "Rajeev";

  @Override
  public String toString() {
    return "User name is " + name;
  }
}

public class Main {
  public static void main(String[] args) {
    User user = new User();
    System.out.println(user);
  }
}

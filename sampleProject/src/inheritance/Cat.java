package inheritance;

public abstract class Cat extends Animal {
  String location;
  String age;

  Cat() {
    location = "Singapore";
  }

  public abstract void growl();
}

package test;

//1. Create Class Car with model , speed  , gear
//Change the gear and print the speed details of the Car.
class CarDetail {
  String model;
  int speed;
  int gear;

  void setCarModel(String newCarModel) {
    model = newCarModel;
  }

  int changeGear(int gearToChange) {
    return gear + gearToChange;
  }

  void increaseCarSpeed(int speedToIncrese) {
    speed = speed + speedToIncrese;
  }

  void printCarStatus() {
    System.out.println("Card model is -> " + model + " Car current speed is -> " + speed);
  }

}

public class Car {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    CarDetail car = new CarDetail();
    car.setCarModel("Toyo");
    car.increaseCarSpeed(50);
    car.changeGear(2);
    car.printCarStatus();
    CarDetail car1 = new CarDetail();
    car1.printCarStatus();

  }
}
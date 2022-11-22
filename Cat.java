public class Cat extends Animal {

  @Override
  public void eat() {
    System.out.print("Cats love to eat fish ");
  }
  @Override
  public void sleep() {
    System.out.println("and sleeps all day");
  }
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}
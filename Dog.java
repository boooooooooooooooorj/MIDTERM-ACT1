public class Dog extends Animal {
 
  @Override
  public void eat() {
    System.out.print("Dog love to eat chicken ");
  }
  @Override
  public void sleep() {
    System.out.println("and sleep for 6-8 hours a day");
  }
  @Override
  public void makeSound() {
    System.out.println("AW AW AW");
  }
}
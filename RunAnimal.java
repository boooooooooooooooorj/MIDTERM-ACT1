import java.util.Scanner;

public class RunAnimal{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    
    System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog : ");
    String Animal = sc.nextLine();
    
    if(Animal.equalsIgnoreCase("B")) {
      Bird b = new Bird();
      b.eat();
      b.sleep();
      b.makeSound();
    }
    else if(Animal.equalsIgnoreCase("C")) {
      Cat c = new Cat();
      c.eat();
      c.sleep();
      c.makeSound();
    }
    else if(Animal.equalsIgnoreCase("D")) {
      Dog d = new Dog();
      d.eat();
      d.sleep();
      d.makeSound();
    }
  }
}
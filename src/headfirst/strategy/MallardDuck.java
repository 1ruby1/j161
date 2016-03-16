package headfirst.strategy;

public class MallardDuck extends Duck{
  
  public MallardDuck(){
    this(new FlyWithWings(),new Quack());
  }
  public MallardDuck(FlyBehavior fb, QuackBehavior qb){
    super.setQuackBehavior(qb);
    super.setFlyBehavior(fb);
  }
  public void display() {
   System.out.println("I'm a real Mallard duck");
 }
}
 
  
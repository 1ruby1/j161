package headfirst.strategy;


abstract class Duck{
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;
  
  public void setFlyBehavior(FlyBehavior fb){
    //다형성을 사용하기 위해서 파라미터를 interface type으로 준다.
    //
    this.flyBehavior = fb;
  }
  public FlyBehavior getFlyBehavior(){
    return this.flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior qb){
    this.quackBehavior = qb;
  }
  public QuackBehavior getQuackBehavior(){
    return this.quackBehavior;
  }
  public void swim(){
    System.out.println("All ducks swim");
  }
  public abstract void display();
 
  public void performFly(){
    this.flyBehavior.fly();
  }
  public void performQuack(){
    this.quackBehavior.quack();
  }
}
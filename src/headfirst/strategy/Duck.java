package headfirst.strategy;


abstract class Duck{
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;
  
  public void setFlyBehavior(FlyBehavior fb){
    //�������� ����ϱ� ���ؼ� �Ķ���͸� interface type���� �ش�.
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
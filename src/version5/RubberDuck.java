package version5;

public class RubberDuck implements Duck {
	private QuackBehavior quackBehavior;
        private FlyBehavior flyBehavior;

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
        
    public void display() {
	System.out.println("I'm a Rubber Duck");
    }

    @Override
    public void performQuack() {
         quackBehavior.quack();    
    }

    @Override
    public void performFly() {
        flyBehavior.fly();
    }
	

}

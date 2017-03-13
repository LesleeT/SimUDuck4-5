package version5;

public class RubberDuck implements Duck {
	private QuackBehavior quackBehavior;
        private FlyBehavior flyBehavior;

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

        @Override
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

        @Override
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
        
        @Override
    public final void display() {
	System.out.println("I'm a Rubber Duck");
    }

    @Override
    public final void performQuack() {
         quackBehavior.quack();    
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }
	

}

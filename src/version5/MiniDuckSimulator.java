package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck(new Quack(), new FlyWithWings());
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
                
                mallard.setFlyBehavior(new FlyRocketPowered());
                mallard.setQuackBehavior(new Quack());
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck(new FlyNoWay(), new Quack());
		model.display();
		model.performFly();
                
		model.setFlyBehavior( new FlyRocketPowered() );
		model.performFly();
	}

}

package gettingAge;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d = new MallardDuck();
		d.display();
		d.performQuack();
		d.performFly();
		d = new ModelDuck();
		d.display();
		d.performFly();
		d.performQuack();d.flyBehavior = new FlyWithWings();
	}

}

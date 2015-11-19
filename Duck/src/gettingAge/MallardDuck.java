package gettingAge;

public class MallardDuck extends Duck{
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I'm a real Mallard Duck");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

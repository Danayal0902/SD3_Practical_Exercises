
public class Milk extends AddDecorator {
	
	Coffee coffee;
	
	public Milk(Coffee coffee) {
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 0.05;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + " with milk";
	}
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

}

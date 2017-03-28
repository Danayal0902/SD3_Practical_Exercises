
public class Cream extends AddDecorator {
	
	Coffee coffee;
	
	public Cream(Coffee coffee) {
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 0.10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + " with cream";
	}
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

}


public class Syrup extends AddDecorator{
	
	Coffee coffee;
	
	public Syrup(Coffee coffee) {
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 0.30;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + " with syrup";
	}
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

}

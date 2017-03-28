
public class Chocolate extends AddDecorator{
	
	Coffee coffee;
	
	public Chocolate(Coffee coffee) {
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 0.40;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + " with chocolate";
	}
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

}


public class BuyAndAddToCoffee {

	public static void main(String[] args) {
		
		Coffee myCoffee = new Decaff();
		myCoffee = new Cream(myCoffee);
		myCoffee = new Chocolate(myCoffee);
		
		System.out.println(myCoffee.getDescription() +" £" + myCoffee.cost());

	}

}

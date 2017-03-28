
public class KylieMinogue {
	private static KylieMinogue uniqueInstance;
	
	private KylieMinogue() {}
	
	public static synchronized KylieMinogue getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new KylieMinogue();
		}
		else
		{
			throw new IllegalArgumentException("More than one Kylie?! Away and don't talk a load a sh**!");
		}
		return uniqueInstance;
	}
	
	public void demoMethod() {
		System.out.println("Aye");
	}

}

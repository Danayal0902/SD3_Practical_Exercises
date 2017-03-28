public abstract class Coffee {
	String description;
	
	public Coffee() {}
	
	public abstract double cost();
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
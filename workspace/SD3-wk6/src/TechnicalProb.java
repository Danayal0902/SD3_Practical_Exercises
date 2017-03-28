
public abstract class TechnicalProb {
	
	protected Technician technician;
	
	public abstract void fix();
	
	public Technician getTechnician() {
		return this.technician;
	}
	
	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

}

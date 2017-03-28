
public class HighPriority extends TechnicalProb {
	
	public HighPriority(Technician technician) {
		setTechnician(technician);
	}
	
	public void fix() {
		this.technician.fixThis("a big problem");
	}

}

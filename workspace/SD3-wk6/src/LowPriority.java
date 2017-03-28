
public class LowPriority extends TechnicalProb {
	
	public LowPriority(Technician technician) {
		setTechnician(technician);
	}
	
	public void fix() {
		this.technician.fixThis("a small problem");
	}

}

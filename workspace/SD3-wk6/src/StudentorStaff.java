
public class StudentorStaff {

	public static void main(String[] args) {
		Technician technician = new Technician();
		
		TechnicalProb lowPriority = new LowPriority(technician);
		TechnicalProb highPriority = new HighPriority(technician);
		
		technician.queueProblem(highPriority);
		technician.queueProblem(lowPriority);
		
		technician.fixProblem();
	}

}

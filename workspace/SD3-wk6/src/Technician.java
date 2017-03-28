import java.util.ArrayList;

public class Technician {
	
	private ArrayList <TechnicalProb> problems = new ArrayList <TechnicalProb>();
	
	public void queueProblem(TechnicalProb theProblem) {
		this.problems.add(theProblem);
	}
	
	public void fixProblem() {
		for (TechnicalProb problem : this.problems) {
			problem.fix();
		}
	}
	
	public void fixThis(String prob) {
		System.out.println("I am fixing " + prob);
	}

}

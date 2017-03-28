public abstract class MP {
	
	protected Residence residencyBehaviour;
	protected Belief beliefBehaviour;
	
	public void performBelief() {
		this.beliefBehaviour.belief();
	}
	
	public void changeResidence() {
		this.residencyBehaviour.residency();
	}
	
	
	public Residence getResidencyBehaviour() {
		return this.residencyBehaviour;
	}
	
	public void setResidencyBehaviour(Residence residencyBehaviour) {
		this.residencyBehaviour = residencyBehaviour;
	}
	
	public Belief getBeliefBehaviour() {
		return this.beliefBehaviour;
	}
	
	public void setBeliefBehaviour(Belief beliefBehaviour) {
		this.beliefBehaviour = beliefBehaviour;
	}

}

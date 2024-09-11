/**
 * 
 */
package slideDeckExercises_AnimalProject;

/**
 * 
 */
public class Mouse extends Animal {
	
	// Instance variables
	
	private boolean isCheeseFan;
	
	// Getters and setters

	/**
	 * @return the isCheeseFan
	 */
	public boolean isCheeseFan() {
		return isCheeseFan;
	}

	/**
	 * @param isCheeseFan the isCheeseFan to set
	 */
	public void setCheeseFan(boolean isCheeseFan) {
		this.isCheeseFan = isCheeseFan;
	}

	// toString method
	
	@Override
	public String toString() {
		return "Mouse [isCheeseFan=" + this.isCheeseFan + ", getName()=" + getName() + ", getNoise()=" + getNoise()
				+ ", getEyeColour()=" + getEyeColour() + "]";
	}
	
	

}

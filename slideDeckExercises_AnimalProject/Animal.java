/**
 * 
 */
package slideDeckExercises_AnimalProject;

/**
 * This is the Animal class
 */
public class Animal {

	// Instance variables

	private String name;
	private String noise;
	private String eyeColour;

	// Getters and setters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}

	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}

	/**
	 * @return the eyeColour
	 */
	public String getEyeColour() {
		return eyeColour;
	}

	/**
	 * @param eyeColour the eyeColour to set
	 */
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	
	// Methods
	
	// toString method
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", noise=" + noise + ", eyeColour=" + eyeColour + "]";
	}
	
	// makeNoise method

	public void makeNoise() {
		System.out.println(this.noise);
	}

}

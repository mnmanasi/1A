package songs;

public class Varnam {
	
	private String name;
	private String ragam;
	private String talam;
	private int minutes;
	
	public Varnam(String title, String raga, String tala, int length) {
		name = title;
		ragam = raga;
		talam = tala;
		minutes = length;
	}
	
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
	 * @return the ragam
	 */
	public String getRagam() {
		return ragam;
	}
	/**
	 * @param ragam the ragam to set
	 */
	public void setRagam(String ragam) {
		this.ragam = ragam;
	}
	/**
	 * @return the talam
	 */
	public String getTalam() {
		return talam;
	}
	/**
	 * @param talam the talam to set
	 */
	public void setTalam(String talam) {
		this.talam = talam;
	}
	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}
	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	

}

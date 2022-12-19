/**
 * Inheritance
 * @author Klara Makek
 * @version 25.1.2022.
 * Course: ISTE-120
 * HW 11
 */
/************** JAVADOC ************************/
public class Grad extends Student {
    private String researchArea;
    private double gradTuition = 713;

    public Grad() {
        super();
        researchArea = "";
    }

    /**
     * public accessor for research area of the student
     * 
     * @return the research area
     */
    public String getResearchArea() {
        return researchArea;
    }

    /**
     * public mutator for research area of the student
     * 
     * @param research area
     */
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    /**
     * public calculation for the tuition
     * 
     * @return the calculation
     */
    public double calcTuition() {
        return super.getNumCredits() * gradTuition;
    }

    /**
     * public string toString()
     * 
     * returns the string.format for the print
     */
    public String toString() {
        return String.format("%-20s %s %-20s %s", "\n\nGrad student: ", super.toString(), "\n\tResearch area: ",
                getResearchArea());
    }
}

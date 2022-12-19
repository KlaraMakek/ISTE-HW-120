/**
 * Inheritance
 * @author Klara Makek
 * @version 25.1.2022.
 * Course: ISTE-120
 * HW 11
 */
/************** JAVADOC ************************/
public class Undergrad extends Student { // extension of the Student
    // attributes
    private int yearLevel;
    private double tuitions = 517;

    // constructor - empty
    public Undergrad() {
    }

    /**
     * public accessor for year level of the student
     * 
     * @return the year level
     */
    public int getYearLevel() {
        return yearLevel;
    }

    /**
     * public mutator for year level of the student
     * 
     * @param year level
     */
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    /**
     * public calculation for the tuition
     * 
     * @return the calculation
     */
    public double calcTuition() {
        return super.getNumCredits() * tuitions;
    }

    /**
     * public string toString()
     * 
     * returns the string.format for the print
     */
    public String toString() {
        return String.format("%-20s %s %-20s %d", "\nUndergrad student: ", super.toString(), "\n\tYear Level: ",
                getYearLevel());
    }
}

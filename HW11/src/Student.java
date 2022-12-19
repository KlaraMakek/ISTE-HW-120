/**
 * Inheritance 
 * @author Klara Makek
 * @version 25.1.2022.
 * Course: ISTE-120
 * HW 11
 */
/************** JAVADOC ************************/
public class Student {
    // attributes
    private String name;
    private String id;
    private int numCredits;

    // constructor - parameterized
    public Student(String setName, String setId, int setNumCredits) {
        name = setName;
        id = setId;
        numCredits = setNumCredits;
    }

    // constructor - default
    public Student() {
        name = "";
        id = "";
        numCredits = 0;
    }

    /**
     * public accessor for a name of the student
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * public mutator for a name of the student
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * public accessor for a ID of the student
     * 
     * @return the ID
     */
    public String getId() {
        return id;
    }

    /**
     * public mutator for the ID of the student
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * public accessor for the number of credits of the student
     * 
     * @return the number of credits
     */
    public int getNumCredits() {
        return numCredits;
    }

    /**
     * public mutator for number of credits of the student
     * 
     * @param number of credits
     */
    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    /**
     * public calculation for the tuition
     * 
     * @return 0.0
     */
    public double calcTuition() {
        return 0.0;
    }

    /**
     * public string toString()
     * 
     * returns the string.format for the print
     */
    public String toString() {
        return String.format("%-10s %s %-10s %s %-20s %d", "\n\tName: ", getName(), "\n\tID: ", getId(),
                "\n\tCredits: ",
                getNumCredits());
    }
}

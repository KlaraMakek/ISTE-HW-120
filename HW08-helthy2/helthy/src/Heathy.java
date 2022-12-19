/**
 * Description: A program to calculate persons (BMR) and (BMI) update
 * @author Klara Makek
 * @version 2.11.2022.
 * Course: ISTE-120
 * HW08
 */
/************** JAVADOC ************************/
public class Heathy {
    /**
     * starter
     */
    private String name;
    private char gender;
    private double weight;
    private double height;
    private int age;
    private int activity;
    private String consent;

    /**
     * String to get a name
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Char to get a gender
     * 
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * double for get weight
     * 
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * double to get height
     * 
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * int for age
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * int to get activity
     * 
     * @return activity
     */
    public int getActivity() {
        return activity;
    }

    /**
     * string to get consent
     * 
     * @return consent
     */
    public String getConsent() {
        return consent;
    }

    /**
     * setter boolean for a name
     * 
     * @param name string
     * @return false if there is no input (0)
     * @return true if input is valid (=> 1)
     */
    public boolean setName(String name) {
        if (name.length() == 0) {
            return false;
        } else {
            this.name = name;
            return true;
        }
    }

    /**
     * setter boolean for gender
     * 
     * @param gender char
     * @return true if gender i gender is M(m)/F(f)
     * @return false if any other letter
     */
    public boolean setGender(char gender) {
        if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
            this.gender = gender;
            return true;
        }
        return false;
    }

    /**
     * setter boolean for weight
     * 
     * @param weight double
     * @return false if weight under 100 lbs
     * @return true if weight is "bigger" then 100 lbs
     */
    public boolean setWeight(double weight) {
        if (weight < 100) {
            return false;
        } else {
            this.weight = weight;
            return true;
        }
    }

    /**
     * setter boolean for height
     * 
     * @param height double
     * @return false if under 60 and over 84
     * @return true if 60 to 84 including them
     */
    public boolean setHeight(double height) {
        if (height < 60 || height > 84) {
            return false;
        } else {
            this.height = height;
            return true;
        }
    }

    /**
     * setter boolean for age
     * 
     * @param age int
     * @return false if under 18
     * @return true if 18 and over
     */
    public boolean setAge(int age) {
        if (age < 18) {
            return false;
        } else {
            this.age = age;
            return true;
        }
    }

    /**
     * setter boolean for activity
     * 
     * @param activity int
     * @return false if les then 1 and over 5
     * @return true if 1 to 5 including them
     */
    public boolean setActivity(int activity) {
        if (activity < 1 || activity > 5) {
            return false;
        } else {
            this.activity = activity;
            return true;
        }
    }


    /**
     * calculating conversion from lbs to kg
     * 
     * @param kg double
     * @return pcon - calculated
     */
    private double pcon(double kg) {
        return kg * 0.45359237;
    }

    /**
     * calculating conversion from inc to cm
     * 
     * @param cm double
     * @return wcon - calculated
     */
    private double wcon(double cm) {
        return cm * 2.54;

    }

    /**
     * getter fro BMR
     * if M(m) @return calculations for M(m)
     * else F(f) @return calculations for Ff)
     */
    public double getBMR() {
        if (gender == 'M' || gender == 'm') {
            return (66 + (13.7 * pcon(weight))) + (5 * wcon(height)) - (6.8 * age);
        } else {
            return (655 + (9.6 * pcon(weight))) + (1.8 * wcon(height)) - (4.7 * age);
        }
    }

    /**
     * getter for BMI
     * 
     * @return calculation for BMI
     */
    public double getBMI() {
        return (((weight) / Math.pow((height), 2)) * 703);
    }

    /**
     * setter for BMI
     * 
     * @return "Underweight" if < 18.5
     * @return "Normal weight" if >= 18.5 and < 25
     * @return "Overweight" if >= 25 < 30
     * @return "Obese" if >= 30
     * @return empty string
     */
    public String setBMI() {
        if (getBMI() < 18.5) {
            return "Underweight";
        } else if (getBMI() >= 18.5 && getBMI() < 25) {
            return "Normal weight";
        } else if (getBMI() >= 25 && getBMI() < 30) {
            return "Overweight";
        } else if (getBMI() >= 30) {
            return "Obese";
        } else {
            return "";
        }
    }

    /**
     * getter for TDEE
     * 
     * in case 1 @return calculation for case 1
     * in case 2 @return calculation for case 2
     * in case 3 @return calculation for case 3
     * in case 4 @return calculation for case 4
     * in case 5 @return calculation for case 5
     * 
     * @return activity
     */
    public double getTDEE() {
        switch (activity) {
            case 1:
                return getBMR() * 1.2;
            case 2:
                return getBMR() * 1.375;
            case 3:
                return getBMR() * 1.55;
            case 4:
                return getBMR() * 1.725;
            case 5:
                return getBMR() * 1.9;

        }
        return activity;
    }

}

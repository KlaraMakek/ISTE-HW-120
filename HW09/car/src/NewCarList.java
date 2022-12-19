
/**
 * A program to calculate car purchase information part 2
 * @author Klara Makek
 * @version 12.11.2022.
 * Course: ISTE-120
 * HW 09
 */
/************** JAVADOC ************************/
import java.util.ArrayList;

// new class
public class NewCarList {
    // array list constructor
    ArrayList<NewCar> list = new ArrayList<NewCar>();

    // method will accept a NewCar object and add it to the ArrayList
    public void add(NewCar car) {
        list.add(car);
    }

    // method will display, using toString(), the information about each object in
    // the ArrayList

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println(list.get(i).getFinalPrice());
        }
    }

    // method will do the same thing as display(), except that it will display only
    // the cars with a final price less than or equal to the parameter maxPrice
    public void select(double maxPrice) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFinalPrice() < maxPrice) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    // method will delete the NewCar stored in the ArrayList slot with the given
    // index
    public void remove(int index) {
        list.remove(index);
    }
}

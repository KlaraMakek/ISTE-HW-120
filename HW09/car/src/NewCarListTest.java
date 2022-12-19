/**
 * A program to calculate car purchase information part 2
 * @author Klara Makek
 * @version 12.11.2022.
 * Course: ISTE-120
 * HW 09
 */
/************** JAVADOC ************************/
public class NewCarListTest {
    public static void main(String[] args) {
        // hardcode the lists
        String[] year = { "2020", "2017", "2014", "2020", "2010", "2010", "2019", "2020" };
        String[] model = { "Rio", "Rio", "Civic", "Civic", "Cobalt", "Accord", "Forester", "Malibu" };
        String[] make = { "Kia", "Kia", "Honda", "Honda", "Chevrolet", "Honda", "Subaru", "Chevrolet" };
        int[] discount = { 1265, 0, 0, 1000, 0, 0, 0, 3533 };
        int[] sticker_price = { 17455, 10990, 13590, 21755, 6995, 10990, 22590, 241950 };
        int[] months = { 60, 48, 48, 60, 36, 48, 60, 60 };
        double sales_tax = 0.08;

        // constructor
        NewCarList list = new NewCarList();

        for (int i = 0; i < 5; i++) {
            list.add(new NewCar(year[i], make[i], model[i], sticker_price[i], discount[i], sales_tax));
        }

        System.out.println("List of cars: ");
        list.display();

        System.out.println("\nList of cars under $14500: ");
        list.select(14500);

        System.out.println("\nAdd 3 more cars and list: ");
        for (int i = 5; i < 8; i++) {
            list.add(new NewCar(year[i], make[i], model[i], sticker_price[i], discount[i], sales_tax));
        }
        list.display();

        System.out.println("\nDelete 2nd idem in the list: ");
        list.remove(2);
        list.display();
    }
}

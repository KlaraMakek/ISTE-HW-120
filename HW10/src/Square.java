import java.util.ArrayList;

/**
 *  Magic square
 * @author Klara Makek
 * @version 19.11.2022.
 * Course: ISTE-120
 * HW 10
 */
/************** JAVADOC ************************/
// * assesseMe desired to turn of and I didn't notice so im writing this again
// */
public class Square {
    private ArrayList<Integer> number;
    private int[][] square;

    public Square() {
        number = new ArrayList<Integer>();
        square = null;
    }

    public void add(int i) {
        number.add(i);
        if (isSquare())
            popSquare();
    }

    private void popSquare() {
        int wid = (int) Math.sqrt(number.size());
        square = new int[wid][wid];
        for (int i = 0; i < wid; i++) {
            for (int j = 0; j < wid; j++) {
                square[i][j] = number.get(i * wid + j);
            }
        }
    }

    // i hate this
    public boolean isSquare() {
        double is = Math.sqrt(number.size());
        return Math.abs(is - Math.floor(is)) < 0.00001;
    }

    public boolean isUnique() {
        ArrayList<Integer> alNum = new ArrayList<>();
        for (int i = 1; i <= number.size(); i++) {
            alNum.add(i);
        }
        return number.containsAll(alNum);
    }

    public boolean isMagic() {
        int rowsum = 0, colsum = 0, diagalSum = 0, diagalRsum = 0;
        for (int i = 0; i < square.length; i++) {
            rowsum = 0;
            colsum = 0;
            diagalSum += square[i][i];
            diagalRsum += square[square.length - 1 - i][i];

            for (int j = 0; j < square.length; j++) {
                diagalSum += square[i][j];
                diagalRsum += square[j][i];
            }
            if (rowsum != colsum) {
                return false;
            }

        }
        return rowsum == colsum && rowsum == diagalSum && rowsum == diagalRsum;

    }

    public int[][] getSquare() {
        return square;
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    @Override
    public String toString() {
        if (square == null) {
            return "null";
        }
        String out = "";
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                out += square[i][j] + " ";
            }
            out += "\n";
        }
        return out;
    }
}

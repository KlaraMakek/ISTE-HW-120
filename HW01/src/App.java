/**
* Class - drawing a tree using classes: rectangle, triangle and circle, and theirs attributes
* @author Klara Makek
* @version 05.09.2022.

//This homework was done prier downloading AssesMe extensions
*/

import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        // new canvas is made named "Tree"
        Canvas canvas = new Canvas("Tree", 800, 600);



                                    /* ***************** BOTTOM OF THE TREE *********************** */

        // first Rectangle for Tree pot

        Rectangle treePot = new Rectangle(350, 450, 80, 80, Color.BLACK, true);
        canvas.draw(treePot); // 'treePot' is drawn on canvas
        System.out.println("treePot: " + treePot);  // in terminal is printing 'treePot' and its attributes

        // second Rectangle for Tree trunk 

        Rectangle treeTrunk = new Rectangle(375, 420, 30, 30, Color.MAGENTA, true);
        canvas.draw(treeTrunk); // 'treeTrunk' is drawn on canvas
        System.err.println("treeTrunk:" + treeTrunk); // in terminal is printing 'treeTrunk' and its attributes



                                 /* ***************** LEAVES OF THE TREE *********************** */

        // FIRST and the biggest triangle of leaves

        Triangle leaves_1 = new Triangle(320, 330, 140, 90, Color.GREEN, true);
        canvas.draw(leaves_1); // 'leaves_1' is drawn on canvas
        System.err.println("leaves_1:" + leaves_1); // in terminal is printing 'leaves_1' and its attributes


        // SECOND and mid size triangle of leaves

        Triangle leaves_2 = new Triangle(325, 260, 125, 70, Color.GREEN, true);
        canvas.draw(leaves_2); // 'leaves_2' is drawn on canvas
        System.err.println("leaves_2:" + leaves_2); // in terminal is printing 'leaves_2' and its attributes


        // THIRD and the smallest size triangle of leaves

        Triangle leaves_3 = new Triangle(345, 210, 90, 50, Color.GREEN, true);
        canvas.draw(leaves_3); // 'leaves_3' is drawn on canvas
        System.err.println("leaves_3:" + leaves_3); // in terminal is printing 'leaves_3' and its attributes



                                /* ***************** RED DOT ON THE TREE *********************** */

        // red circle dot on the top of the tree

        Circle redBall = new Circle(375, 180, 15, Color.RED, true);
        canvas.draw(redBall); // redBall is drawn on canvas
        System.out.println("redBall: " + redBall); // in terminal is printing 'redBall' and its attributes
 
    }
}

import java.awt.Color;
import java.util.Scanner;

/*
 * Author : Aral Tasher, ataser2010@my.fit.edu
 * Course : CSE 2010, Section 01,Fall 2012
 * Project: lab4, AntiSnowflake
 */
public class Fractal {
    private static final float ONE_HALF_FLOAT = .5f;
    private static final double ONE_HALF = .5;
    private static final int CANVAS_SIZE = 700; //768 original size
    private static final double COLOR_CHANGE = .0001;
    private static final int CONSTANT_ANGLE = 135;
    // I created the angles here instead of regenerating in all of the
    // recursions
    private static double sin1 = Math.sin (Math.toRadians (CONSTANT_ANGLE));
    private static double sin2 = Math.sin (Math.toRadians (-CONSTANT_ANGLE));
    private static double cos1 = Math.cos (Math.toRadians (CONSTANT_ANGLE));
    private static double cos2 = Math.cos (Math.toRadians (-CONSTANT_ANGLE));
    private static double root2 = 1.0 / Math.sqrt (2.0);
    private static float colorCounter = 0.0f;

    // recursive method which, starting from a base segment, replaces each
    // segment
    // by 2 segments with a right angle and with a rotation of 45� alternatively
    // to the right and to the left.
    public static void heighwayDragon (final int n, final double x1,
                                       final double y1, final double x2, final double y2, final double x3,
                                       final double y3) {
        // Base case. This also includes changing the color of pen. Just to make
        // it look nicer
        if (n == 1) {
            StdDraw.setPenColor (purtyColor (colorCounter));
            StdDraw.line (x1, y1, x2, y2);
            StdDraw.line (x2, y2, x3, y3);
            colorCounter += COLOR_CHANGE;
        } else {
            // the four formulas find the new two points that would help to draw
            // the right angle lines
            final double xOneCoordinate = ( ( cos1 * ( x1 - x2) * root2) - ( sin1
                    * ( y1 - y2) * root2))
                    + x1;
            final double yOneCoordinate = ( sin1 * ( x1 - x2) * root2)
                    + ( cos1 * ( y1 - y2) * root2) + y1;
            final double xTwoCoordinate = ( ( cos2 * ( x2 - x3) * root2) - ( sin2
                    * ( y2 - y3) * root2))
                    + x2;
            final double yTwoCoordinate = ( sin2 * ( x2 - x3) * root2)
                    + ( cos2 * ( y2 - y3) * root2) + y2;

            heighwayDragon (n - 1, x1, y1, xOneCoordinate, yOneCoordinate, x2,
                    y2);
            heighwayDragon (n - 1, x2, y2, xTwoCoordinate, yTwoCoordinate, x3,
                    y3);

        }
    }

    public static void main (final String[] args) {
        final Scanner keyboard = new Scanner (System.in);
        final int n = keyboard.nextInt ();
        StdDraw.setCanvasSize (CANVAS_SIZE, CANVAS_SIZE);
        StdDraw.setScale (-1, 1);
        StdDraw.clear (StdDraw.BLACK);
        heighwayDragon (n, -ONE_HALF, ONE_HALF, 0, 0, ONE_HALF, ONE_HALF);

    }

    // Kasey Power showed me how to range colors.
    private static Color purtyColor (final float hue) {
        return Color.getHSBColor (hue, ONE_HALF_FLOAT, 1f);
    }

}

public class DesignSquares {
    public static void main(String[] args) {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5,0.5,0.5);
        double[] x0 = {0.5,1,0.5,0};
        double[] y0 = {1,0.5,0,0.5};

        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledPolygon(x0, y0);
        StdDraw.setPenColor(StdDraw.WHITE);
        double[] x1 = {0.75,1,0.75};
        double[] y1 = {.25,.25,0};
        StdDraw.filledPolygon(x1, y1);
        double[] x2 = {0.75,1,0.75};
        double[] y2 = {1,0.75,0.75};
        StdDraw.filledPolygon(x2, y2);
        double[] x3 = {0.25,0.25,0};
        double[] y3 = {1,0.75,0.75};
        StdDraw.filledPolygon(x3, y3);
        double[] x4 = {0.25,0.25,0};
        double[] y4 = {0,0.25,0.25};
        StdDraw.filledPolygon(x4, y4);
    }
}
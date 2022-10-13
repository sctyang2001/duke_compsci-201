public class WeightedAverage
{
    public static void main(String[] args)
    {
        // Exercise 1.4.17 WeightedAverage

        // the following code read the weight array -- don't modify
        double[] weights = StdArrayIO.readDouble1D();
        
        // assert weights.length == raw_exam_score[0].length
        double [][] raw_exam_score = StdArrayIO.readDouble2D();
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        System.out.println();
        int nRow = raw_exam_score.length;
        int nCol = raw_exam_score[0].length;
        for (int row = 0; row < nRow; row++){
            double sum_weighted_exam_score = 0.0;
            for (int col = 0; col < nCol; col++){
                double weighted_exam_score = (weights[col]) * (raw_exam_score[row][col]);
                sum_weighted_exam_score = sum_weighted_exam_score + weighted_exam_score;
            }
            System.out.println(sum_weighted_exam_score);
        }
        return;
    }
}
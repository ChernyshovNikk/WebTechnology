package handler;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Handler {
    public static double[][] GetSquareMatrix(double[] analyzeArray, int N)
    {
        double[][] matrix = new double[N][N];
        double temporary;

        for(int i=0; i<N; i++)
            matrix[0][i] = analyzeArray[i];

        for(int j=1; j<N; j++)
        {
            temporary = analyzeArray[0];
            for(int i=0; i<N-1; i++)
                analyzeArray[i] = analyzeArray[i + 1];
            analyzeArray[N-1] = temporary;

            for(int k=0; k<N; k++)
            {
                matrix[j][k] = analyzeArray[k];
            }
        }

        for(int i=0; i<N; i++)
        {
            for (int j=0; j<N; j++)
                System.out.print(matrix[i][j]+"  ");
            System.out.println();
        }
        return matrix;
    }
}

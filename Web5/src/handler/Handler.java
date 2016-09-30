package handler;

import java.util.Vector;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Handler {
    public static int MakeIncreasingArray(int[] analyzeArray, int arraySize)
    {
        int[] d = new int[arraySize];
        int[] p = new int[arraySize];

        for (int i=0; i<arraySize; i++) {
            d[i] = 1;
            p[i] = -1;
            for (int j=0; j<i; j++) {
                if (analyzeArray[j] < analyzeArray[i]) {
                    if (1 + d[j] > d[i]) {
                        d[i] = 1 + d[j];
                        p[i] = j;
                    }
                }
            }
        }

        int increasingArray = d[0], pos = 0;
        for (int i=0; i<arraySize; i++){
            if (d[i] > increasingArray) {
                increasingArray = d[i];
                pos = i;
            }
        }
        int countCanDelete = arraySize - increasingArray;
        System.out.println(countCanDelete);

        Vector<Integer> path = new Vector<Integer>();
        while (pos != -1) {
            path.addElement(pos);
            pos = p[pos];
        }

        for (int i=path.size()-1; i>=0; i--) {
            System.out.print(analyzeArray[path.get(i)] + " ");
        }

        return countCanDelete;
    }
}

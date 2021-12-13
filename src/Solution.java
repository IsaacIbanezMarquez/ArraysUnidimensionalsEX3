



import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // 3. Donat un array de 5 elements digues sí és creixent o decreixent. Ex: creixent {0,3, 5, 6, 9}, decreixent {34, 23, 19, 18, 3}



        //int [] a = {0, 3, 5, 6, 9};
        //int [] a = {1, 2, 3, 4, 5};

        int [] a = {34, 23, 23, 13, 3};

        boolean decreixent = true;
        boolean creixent = true;

        for(int i=0;i<(a.length-1);++i)
        {
            if (a[i] <= a[i+1]){
                decreixent = false;
            }
            if (a[i] >= a[i+1]){
                creixent = false;
            }

            if (!creixent && !decreixent) break;
        }

        if (decreixent)
            System.out.println("array DECREIXENT");
        else if (creixent)
            System.out.println("array CREIXENT");
        else
            System.out.println("array amb valors no ordenats");
    }

}

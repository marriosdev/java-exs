import java.util.ArrayList;
import java.util.List;

public class FindOutlier {

    public static void main(String args[]) {
        int[] list = {2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(find(list));
    }

    public static int find(int[] integers) {
        int countImpar = 0;
        int countPar = 0;
        int par = 0;
        int impar = 0;

        for (int i : integers) {
            if(i%2==0) {
                par = i;
                countPar++;
            }else{
                impar = i;
                countImpar++;
            }
        }
        if(countImpar > 1) {
            return par;
        }
        return impar;
    }
}

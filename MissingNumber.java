import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.text.AbstractDocument.Content;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        String numbers = scanner.nextLine();
        
        
        String[] listNumbers = numbers.split(" ");
        int[] listInput = new int[listNumbers.length];

        scanner.close();
        
        int countInput = Integer.parseInt(input);
        int count = (countInput-1)/2;

        if ((countInput-1) % 2.0 != 0) {
            count+=1;
        }

        int countAux = count;

        for(int i=0; i <= countAux; i++){
            if(count == 1 && Integer.parseInt(listNumbers[i]) == 1) {
                System.out.println(2);
                return;
            }
            if(count == 1 && Integer.parseInt(listNumbers[i]) == 2) {
                System.out.println(1);
                return;
            }
 
            if(i < count) {   
                listInput[i] = Integer.parseInt(listNumbers[i]);
            }
           
            if(count <= listNumbers.length) {
                listInput[count-1] = Integer.parseInt(listNumbers[count-1]);
            }
            count++;
        }

        Arrays.sort(listInput);
        
        for (int c = 0; c <= countInput ; c++) {

            if(listInput[c] != c+1) {
                System.out.println(c+1);
                break;
            }
        }
    }
}
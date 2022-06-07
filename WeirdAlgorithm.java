import java.util.Scanner; 

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long input = scanner.nextLong();
        System.out.print(input);
        while(true) {
            if(input == 1){
                break;
            }
            if(input % 2 == 0) {
                input = input / 2;
            }else{
                input = (input * 3) + 1;
            }
            System.out.print(" "+input);
        }
    }
}

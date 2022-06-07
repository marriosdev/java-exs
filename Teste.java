//package practice;
 
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
 
import static java.lang.Math.*;
 
public class Teste implements Closeable {
 
    private InputReader in = new InputReader(System.in);
    private PrintWriter out = new PrintWriter(System.out);
 
    public void solve() {
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
 
    @Override
    public void close() throws IOException {
        in.close();
        out.close();
    }
 
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int ni() {
            return Integer.parseInt(next());
        }
 
        public long nl() {
            return Long.parseLong(next());
        }
 
        public void close() throws IOException {
            reader.close();
        }
    }
 
    public static void main(String[] args) throws IOException {
        try (Teste instance = new Teste()) {
            instance.solve();
        }
    }
}
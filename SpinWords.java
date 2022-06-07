public class SpinWords {
    public static void main(String[] args) {
        spinWords("Hey fellow warriors");
        spinWords("Welcome");
    }

    public static String spinWords(String sentence) {
        String[] list = sentence.split(" ");
        String newString = "";

        for(String i: list)
        {
            if(i.length() > 4){
                StringBuilder reverse = new StringBuilder().append(i);
                newString += (reverse.reverse() + " ");
            }else{
                newString+= (i + " ");
            }
        }
        System.out.println(newString);
        return newString.trim();
      }
}

public class Order {

    public static void main(String[] args) {
        String stringS = "is2 Thi1s T4est 3a";  
        order(stringS);
    }

    public static String order(String words) {
        String[] listString = words.split(" ");
        String finalString = "";
        for (int i=0; listString.length >= i; i++) {
            for (String stringS : listString) {
                if(stringS.indexOf(""+i+"") != -1) {
                    finalString = finalString.concat(stringS+" ");
                }
            };
        }
        return finalString.trim();
    }
}

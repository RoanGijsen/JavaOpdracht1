
public class Opdracht1 {

   public static void main(String[] args) {

       String str1 = "dop";

       String str2 = "erwt";

       String str3 = "en";

       
       //manier 1
       String result = str1.concat(str2).concat(str3);

       System.out.println(result);
       
       //manier 2
       System.out.println(str1 + str2 + str3);

   }

}
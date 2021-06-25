import java.util.Scanner;
public class Ussu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        int n= input.nextInt();
        System.out.println("Üs olacak sayı:");
        int r= input.nextInt();
        int i,total=1;
        for(i=1; i<=r; i++) {
            total *= n;
        }
        System.out.println("Sonuç: "+total);
    }
}

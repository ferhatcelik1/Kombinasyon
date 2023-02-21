import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, faktor1 = 1, faktor2 = 1, faktor3 = 1;

        double con;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısı: ");
        n = inp.nextInt();
        System.out.print("Grup sayısı sayısı: ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            faktor1 = faktor1 * i;
        }
        for (int i = 1; i <= r; i++) {
            faktor2 = faktor2 * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            faktor3 = faktor3 * i;
        }
        con = faktor1 / (faktor2 * faktor3);

        System.out.print("(" + n + "," + r + ") kombinasyonu = " + con);


    }
}

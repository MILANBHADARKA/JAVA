
public class formatespecifier {

    public static void main(String[] args) {

        int a = 5;
        double b = 6.884456;
        float c =  2.8f;
        String d = "Milan";
        String e = "Bhadarka";

        System.out.printf("a = %d, b = %.2f, c = %.1f\n", a, b, c);
        System.out.printf("%-10s %10s", d , e);
    }
}

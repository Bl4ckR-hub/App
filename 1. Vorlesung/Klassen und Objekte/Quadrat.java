public class Quadrat {  //diese Klasse enthält nur Klassenmethoden
    static int quadrat(int n) {
        return n*n;
    }

    static void ausgabe(int n) {
        String s;
        for (int i = 1; i <= n; i++) {
            s = "Quadrat (" + i + ") = " + quadrat(i);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ausgabe(4);
    }
}
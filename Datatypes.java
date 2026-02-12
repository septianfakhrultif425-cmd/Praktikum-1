import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        // Menggunakan try-with-resources agar Scanner otomatis tertutup
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah test case (T): ");
            if (sc.hasNextInt()) {
                int t = sc.nextInt();

                for (int i = 0; i < t; i++) {
                    System.out.print("\nMasukkan angka ke-" + (i + 1) + ": ");
                    try {
                        long n = sc.nextLong();
                        System.out.println(n + " can be fitted in:");

                        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                            System.out.println("* byte");
                        }
                        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                            System.out.println("* short");
                        }
                        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                            System.out.println("* int");
                        }
                        System.out.println("* long");

                    } catch (Exception e) {
                        System.out.println(sc.next() + " can't be fitted anywhere.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Input awal tidak valid.");
        }
    }
}
import java.util.Scanner;
public class KalkulatorBMI {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat, tinggi, bmi;
        String ulang;

        do {
            System.out.println("=== KALKULATOR BMI ===");

            System.out.print("Masukkan berat badan (kg): ");
            berat = input.nextDouble();

            System.out.print("Masukkan tinggi badan (cm): ");
            tinggi = input.nextDouble();

            // Ubah cm ke meter
            tinggi = tinggi / 100;

            // Validasi input
            if (berat <= 0 || tinggi <= 0) {
                System.out.println("Input tidak boleh nol atau negatif!");
            } else {
                bmi = berat / (tinggi * tinggi);
                System.out.printf("BMI Anda: %.2f%n", bmi);

                if (bmi < 18.5) {
                    System.out.println("Kategori: Underweight");
                } else if (bmi < 25) {
                    System.out.println("Kategori: Normal");
                } else if (bmi < 30) {
                    System.out.println("Kategori: Overweight");
                } else {
                    System.out.println("Kategori: Obesity");
                }
            }

            System.out.print("\nApakah ingin menghitung lagi? (y/n): ");
            input.nextLine(); // bersihkan buffer
            ulang = input.nextLine();
            System.out.println();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan Kalkulator BMI!");
        input.close();
    }

}

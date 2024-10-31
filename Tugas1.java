import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTertinggi = 0, nilaiTerendah = 100, total = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] nilaiMhs = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        double rata2 = total / n;
        System.out.println("Rata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Semua nilai yang telah dimasukkan: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
    }
}
import java.util.Scanner; 
public class TugasKalkulator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan nilai A : ");
        int nilaiA = scan.nextInt();
        System.out.print("Masukkan nilai B : ");
        int nilaiB = scan.nextInt();

        int hasilTambah = penjumlahan(nilaiA, nilaiB);
        System.out.println("Nilai A + B = " + hasilTambah);

        int hasilKurang = pengurangan(nilaiA, nilaiB);
        System.out.println("Nilai A - B = " + hasilKurang);

        int hasilKali = perkalian(nilaiA, nilaiB);
        System.out.println("Nilai A x B = " + hasilKali);
    }

    public static int penjumlahan(int a, int b) {
        int hasilTambah = a+b;
        return hasilTambah;
    }

    public static int pengurangan(int a, int b) {
        int hasilKurang = a+b;
        return hasilKurang;
    }
    public static int perkalian(int a , int b) {
        int hasilKali = a*b;
        return hasilKali;
    
    }   
}
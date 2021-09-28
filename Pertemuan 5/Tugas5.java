import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap Anda = ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan IPK Anda = ");
        double IPK = scanner.nextDouble();
        
        System.out.print("Lama masa studi Anda = ");
        int lamaStudi = scanner.nextInt();

        if(IPK >= 3.51 && IPK <= 4 && lamaStudi <= 4) {
            System.out.print("Selamat " + namaLengkap + " lulus dengan PUJIAN TERTINGGI (SUMMA CUMLAUDE) dengan IPK " + IPK + " dengan lama studi " + lamaStudi + " tahun");
        
        } else if(IPK >= 3.51 && IPK <= 4) {
            System.out.print("Selamat " + namaLengkap + " lulus dengan PUJIAN (CUMLAUDE) dengan IPK " + IPK);
        
        } else if(IPK >= 3.01 && IPK < 3.51) {
            System.out.print("Selamat " + namaLengkap + " lulus SANGAT MEMUASKAN dengan IPK " + IPK);
        
        } else if(IPK >= 2.76 && IPK < 3.01) {
            System.out.print("Selamat " + namaLengkap + " lulus MEMUASKAN dengan IPK " + IPK);
        
        } else if(IPK >= 2.00 && IPK < 2.76) {
            System.out.print("Selamat " + namaLengkap + " lulus CUKUP MEMUASKAN dengan IPK " + IPK);
       
        } else if(IPK < 2.00) {
            System.out.print("Maaf " + namaLengkap + " TIDAK LULUS dengan IPK " + IPK);
            System.out.print("Tetap semangat, jangan putus asa!");
       
        } else if(IPK > 4 || IPK < 0) {
            System.out.print("IPK yang Anda input TIDAK VALID");
        }
    }
}
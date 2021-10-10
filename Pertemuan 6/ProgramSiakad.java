import java.util.Scanner;

public class ProgramSiakad {
    public static void main(String[] args) {
        System.out.println(".: Program Siakad :.");
        System.out.println("1. Tambah Data");
        System.out.println("2. Edit Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Program Siakad yang Anda pilih = ");
        int program = scanner.nextInt();
        if(program == 1) {
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mata kuliah");
            System.out.println("3. Kembali");
            int pilih = scanner.nextInt();
            if(pilih==1) {
               Scanner scan = new Scanner(System.in);
               System.out.println(":. Tambah Data Mahasiswa .:");
               System.out.println();
               System.out.print("Masukkan nama mahasiswa = ");
               String namaMahasiswa = scan.nextLine();
               System.out.println("Nama mahasiswa adalah " + namaMahasiswa);
            } else if(pilih==2) {
                Scanner scan = new Scanner(System.in);
                System.out.println(":. Tambah Data Mata Kuliah .:");
                System.out.println();
                System.out.println("Masukkan nama mata kuliah = ");
                String namaMatkul = scanner.nextLine();
                System.out.println("Nama mata kuliah " + namaMatkul);
            } else if(pilih==3) {
                System.out.println("Terima kasih");
            } else if(pilih>1 && pilih<5) {
                System.out.println("Fitur belum ada");
            } else if(pilih<1 && pilih >3) {
                System.out.println("Menu Tidak ada");
            }
        }

    }
}
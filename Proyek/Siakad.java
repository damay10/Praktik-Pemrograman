import java.util.Scanner; 
    public class Siakad {
        Mahasiswa[] mahasiswa = new Mahasiswa[1000];
        private int jumlahData = 0;

        public static void main(String[] args) {
            System.out.println();
            Siakad siakad = new Siakad();
            int menu = 0;
            while (menu!=5) { //menampilkan menu
                menu = tampilanMenu(); 
                if (menu == 1) {
                    siakad.lihatData();
                } else if (menu == 2) {
                    siakad.tambahData();
                } else if (menu == 3) {
                    siakad.cariData();
                } else if (menu == 4) {
                    siakad.ratarataIpk();
                }
            }
        }

        private static int tampilanMenu() {
            System.out.println();
            System.out.println("Selamat datang di Sistem Informasi Akademik Universitas Negeri Yogyakarta");
            System.out.println("Menu : ");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Rerata IPK");
            System.out.println("5. Keluar");
            System.out.print("Silahkan pilih menu = ");
            Scanner scanMenu = new Scanner (System.in);
            int menu = scanMenu.nextInt();
            return menu;
        }

        private void lihatData() {
            if (jumlahData == 0) {
                System.out.println();
                System.out.println("Belum ada data");
            } else {
                System.out.println();
                for (int i=1; i<jumlahData; i++) {
                    mahasiswa[i].getDetail();
                }
            }
        }

        private void tambahData() {
            Scanner scan = new Scanner (System.in);
            System.out.println();
            System.out.print("Masukkan NIM mahasiswa = ");
            String nim = scan.nextLine();
            System.out.print("Masukkan nama lengkap mahasiswa = ");
            String nama = scan.nextLine();
            System.out.print("Masukkan IPK mahasiswa dengan format dua angka dibelakang koma (contoh = 3.98) = ");
            double ipk = scan.nextDouble();
            System.out.print("Masukkan tinggi badan mahasiswa = ");
            double tinggi = scan.nextDouble();
            Mahasiswa inputMahasiswa = new Mahasiswa (nim, nama, ipk);
            inputMahasiswa.setTinggiBadan(tinggi);
            mahasiswa[jumlahData] = inputMahasiswa;
            jumlahData++; // ngasih tau jumlah data naik terus
            lihatData();
        }

        public void cariData() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan NIM Mahasiswa yang akan dicari = ");
            String nim = scan.nextLine();
        }
        
        public void ratarataIpk() {
            double totalIpk = 0.0;
            for (int i=0; i<jumlahData; i++) {
                totalIpk += mahasiswa[i].getIPK();
            }
            double ratarata = totalIpk / jumlahData;

            System.out.println("Rata-rata IPK mahasiswa = " + ratarata);
        }
    }

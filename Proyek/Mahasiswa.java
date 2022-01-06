public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;
    private double semester;

    public Mahasiswa(String nim, String nama, double ipk, String semester) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void setSemester() {
        this.semester = semester;
    }

    public double getSemester() {
        return this.semester;
    }

    public void getDetail() {
        System.out.printf("%10s %20s %5s %5s %10s", this.nim, this.nama.toUpperCase(), String.valueOf(this.ipk), this. semester.toUpperCase(), String.valueOf(this.tinggiBadan));
        System.out.println();
    }

    public void getHeader() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %5s %5s %10s", "NIM", "NAMA", "IPK", "SEMESTER", "TINGGI BADAN");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
    }

}
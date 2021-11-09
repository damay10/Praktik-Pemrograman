public class BelajarMethod {
    public static void main(String[] args) {
        cobacoba();
        menampilkanTeks();
        teksDenganParameter("Damay");
        String teks = tambahKata("Kalimat awal");
        System.out.println(teks);
        String teksDuaParameter = tambahKataDuaParameter("Kalimat awal");
    }
    public static void mmenampilkanTeks() {
        System.out.println("Halo");
        System.out.println("Selamat pagi");
        System.out.println("Saya sedang");
        System.out.println("mencoba");
    }
    public static void cobacoba() {
        System.out.println("Menampilkan teks yang lain");
    }
    public static void teksDenganParameter(String nama) {
        System.out.println("Nama anda adalah " + nama);
    }
    public static String tambahKata(String kataAwal) {
        String kalimat = "ini adalah kalimat tambahan" + kataAwal;
        return kalimat;
    }
    public static String tambahKataDUaParameter(String katapertama, String kalimat) {
        String kalimat = "ini adalah kalimat tambahan " + katapertama;
        return kalimat;
    }
}
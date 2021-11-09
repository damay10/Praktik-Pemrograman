public class BelajarArray {
    public static void main(String[] args) {
        String buah1 = "Mangga";
        String buah2 = "Apel";
        String [] binatang = {"Ayam", "Kambing", "Kuda"};
        for(int i=0; i<binatang.length; i++) {
            System.out.println(binatang[i]);
        }
        for(String item : binatang) {
            System.out.println(item);
        }
        int[][] multidimensi = {{1, 2, 3, 4}, {9, 8, 7, 6}};
        System.out.println(multidimensi[0][2]);
        System.out.println(multidimensi[1][2]);
        System.out.println(multidimensi[3][0]);
    }
}
import java.util.Scanner;
public class Siakad {
    public static void main(String[] args) {
        int menu = 0;
        while(menu!=5) {
            menu = tampilanMenu();
            if(menu==1) {

            }

        }
    }

    public static int tampilanMenu() {
    Scanner scan = new Scanner(System.in);
    System.out.println("..Menu..");
    int menu = scan.nextInt();
    return menu;
    }

    public static void lihatData() {
        System.out.println("Disini untuk lihat data");
    }
}
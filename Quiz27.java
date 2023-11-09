import java.util.Scanner;
import java.util.Random;

public class Quiz27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak Angka (1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == number);
                if (answer > number) {
                    System.out.println("Lebih Besar Dari Angka Random");
                } else if (answer < number) {
                    System.out.println("Lebih Kecil Dari Angka Random");
                }
            }while (!success);
            System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/y)? : ");
            menu = sc.nextLine().charAt(0);
        }while (menu == 'Y' || menu == 'y');
    }
}

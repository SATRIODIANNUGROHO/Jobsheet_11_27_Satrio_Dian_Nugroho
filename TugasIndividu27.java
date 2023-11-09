import java.util.Scanner;

public class TugasIndividu27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == (N-1) || j == 0 || j == (N-1)) {
                    System.out.print(N);
                }else if (j == 1 || j == (N-2)) {
                    System.out.print(" ");
                }else {
                    System.out.print(" ");
                } 
                
            }
            System.out.println();
        }
    }
}

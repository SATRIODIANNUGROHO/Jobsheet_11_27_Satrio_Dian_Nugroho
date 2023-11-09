import java.util.Scanner;

public class NestedLoop_2341760113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];

        double[] suhuKota = new double[5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota Ke - " + (i + 1));

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari Ke - " + (j + 1) + " : ");
                temps[i][j] = sc.nextDouble();

                suhuKota[i] += temps[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota Ke - " + (i+1) + " : " );

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < suhuKota.length; i++) {
            double rataSuhu = suhuKota[i] / temps[0].length;
            System.out.println("Rata-rata suhu Kota Ke - " + (i + 1) + " : " + rataSuhu);
        }
    }
}

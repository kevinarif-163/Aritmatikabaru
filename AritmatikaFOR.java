package Perulangan;
import java.util.Scanner;

public class AritmatikaFOR {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int batasAwal, batasAkhir, beda ;


        System.out.println("Masukan Batas Awal : ");
        batasAwal = input.nextInt();
        System.out.println("Masukan Batas Akhir : ");
        batasAkhir = input.nextInt();
        System.out.println("Masukan Beda : ");
        beda = input.nextInt();
        System.out.println("Deret Aritmatika : ");
        for (int i = batasAwal; i <=batasAkhir; i+=beda) {
            System.out.println(i+"");
        }
        input.close();



    }
}

package Perulangan;
import java.util.Scanner;

public class AritmatikaWhile {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int batasAwal, batasAkhir, beda;


        System.out.println("Masukan Batas Awal : ");
        batasAwal = input.nextInt();
        System.out.println("Masukan Batas Akhir : ");
        batasAkhir = input.nextInt();
        System.out.println("Masukan Beda : ");
        beda = input.nextInt();
        System.out.println("Deret Aritmatika : ");
        int i = batasAwal;
        while  (i<=batasAkhir){
            System.out.println(i +"");
            i +=beda;
        }
        input.close();
    }
}

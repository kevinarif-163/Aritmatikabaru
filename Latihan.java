package Perulangan;
import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
        
        // int nilaiAtas, nilaiBawah;
        int angka, temp=1;

        Scanner s= new Scanner(System.in);
        System.out.println("Masukan angka: ");
        angka=s.nextInt();

        for (int i = angka; i>1; i--) {
            System.out.println(i+"X");
            temp *= i;
        }

        // System.out.println();
        // System.out.println("Total Faktorial = " + temp);
        // System.out.println("Masukan Batas Atas: ");
        // nilaiAtas = s.nextInt();
        // System.out.println("Masukan Batas Bawah: ");
        // nilaiBawah = s.nextInt();
        // for (int i = nilaiBawah; i <=nilaiAtas ; i++) {
        //     if(i % 6 ==0){
        //         if (i %10 ==0) {
        //             System.out.println("ERROR..");
        //         } else {
        //             System.out.println(i+", ");
        //         }
        //     }
           
        // }

        // int j = 100;
        // while (j <=100) {
        //     if (j%6 == 0) {
        //         if (j%10 ==0) {
        //             System.out.println("ERROR..");
        //         } else {
        //             System.out.println(j+", ");
        //         }
        //     }
        // }

        // boolean siswa=true;


        // int i = 50;
        // while(i >=50){
        //     System.out.print("Selamat Menjadi Siswa");
        // }

        

        
    }
}

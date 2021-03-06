import java.util.Scanner;

class SayiKacBasamakHesaplama{

public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scan.nextInt();
        int basamak = 0;

        while(sayi>0) {
        sayi = sayi/10;
        basamak++;
        }
        System.out.print("Basamak sayisi: " + basamak);
        }

     }

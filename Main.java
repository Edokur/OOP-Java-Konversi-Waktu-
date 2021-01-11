package com.company;
//Edo Kurniawan
//1900018202
import javax.crypto.spec.OAEPParameterSpec;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int menu;

        waktu wk = new waktu();
        OOP_Konstruktor kons = new OOP_Konstruktor(3900);
        Hitung inhe = new Hitung();
        final_abstract abs = new final_abstract();

        do {
            System.out.println("============Menu============");
            System.out.println("1. OOP Konstruktor");
            System.out.println("2. OOP Inheritance");
            System.out.println("3. OOP Abstract Class");
            System.out.println("4. OOP Interface");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilhan : ");
            menu = input.nextInt();

            System.out.println();

            System.out.println("Program Konversi Waktu");
            switch (menu) {
                case 1:
                    System.out.println("Detik Yang Dimasukkan : " + kons.n);
                    if (kons.n >= 3600) {
                        kons.j = kons.n / 3600;
                        kons.n = kons.n % 3600;
                        kons.m = kons.n / 60;
                        kons.n = kons.n % 60;
                        kons.d = kons.n;
                    } else if (kons.n < 3600 && kons.n >= 60) {
                        kons.j = 0;
                        kons.m = kons.n / 60;
                        kons.n = kons.n % 60;
                        kons.d = kons.n;
                    } else {
                        kons.j = 0;
                        kons.m = 0;
                        kons.d = kons.n;
                    }
                    System.out.println("Output :");
                    System.out.println("Maka Hasil Konversi nya Yaitu : " + kons.j + " jam " + kons.m + " Menit " + kons.d + " Detik");
                    break;
                case 2:
                    inhe.setN(27583);
                    System.out.print("Detik Yang Dimasukkan : " + inhe.getN());

                    System.out.println("Output : ");
                    inhe.hasil();

                    break;
                case 3:
                    System.out.println("Masukkan Jumlah Waktu (detik) : ");
                    abs.n = input.nextInt();

                    System.out.println("Output : ");
                    abs.waktu();
                    break;
                case 4:
                    System.out.print("Masukkan Jumlah Waktu (detik) : ");
                    wk.n = input.nextInt();

                    System.out.println("Output : ");
                    wk.Konversi();
                    break;
                default:
                    try {
                        if (menu > 4) {
                            throw new Exception("Terima Kasih Sudah Memakai Program Saya");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
            }

        }while(menu != 5);
        System.out.println("===========================");
        System.out.println("=======Edo Kurniawan=======");
        System.out.println("========1900018202=========");
        System.out.println("===========================");
    }
}

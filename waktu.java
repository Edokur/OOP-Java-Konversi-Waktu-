package com.company;

public class waktu implements Proses_Konversi{
    public int n;
    int j;
    int m;
    int d;

    public waktu() {
        this.n = n;
    }

    @Override
    public void Konversi() {
        if (n >= 3600){
            j = n/3600;
            n = n%3600;
            m = n/60;
            n = n%60;
            d = n;
        } else if (n < 3600 && n >= 60) {
            j = 0;
            m = n/60;
            n = n%60;

            d = n;
        } else {
            j = 0;
            m = 0;
            d = n;
        }
        System.out.println("Maka Hasil Konversi nya Yaitu : " + j +" jam " + m +" Menit " + d +" Detik");
    }
}

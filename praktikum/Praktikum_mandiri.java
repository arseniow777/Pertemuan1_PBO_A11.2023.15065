package praktikum;

public class Praktikum_mandiri {
    // 1
    public static void main(String args[]){
        System.out.println("Halo, nama saya adalah Arsenio Farrell Winoto");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program Java\n");

    // 2
    // a. Keliling Lingkaran
    double phi = 22.0/7.0;
    double diameterLingkaran = 10;
    double kelilingLingkaran = phi*diameterLingkaran;
    System.out.println("Keliling lingkaran dengan diameter 10 adalah : " + kelilingLingkaran +"\n");
    
    // b. Luas segitiga siku-siku
    float alas = 6.0f;
    float tinggi = 8.0f;
    float luas_Segitiga = 0.5f*alas*tinggi;
    System.out.println("Luas segitiga siku-siku dengan alas 6 dan tinggi 8 adalah : " + luas_Segitiga +"\n");

    // c. Volume tabung
    double diameterTabung = 5;
    double jariJariTabung = 0.5*diameterTabung;
    double tinggiTabung = 10;
    double volumeTabung = phi*jariJariTabung*jariJariTabung*tinggiTabung;
    System.out.println("Volume tabung dengan diameter 5 dan tinggi 10 adalah : " + volumeTabung);

    }
}

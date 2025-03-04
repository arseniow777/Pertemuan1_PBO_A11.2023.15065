package tugas2;

public class Dua {
    public static void main(String args[]){
        // 1. Luas dan Keliling Persegi
        int sisi = 4;
        int luasPersegi = sisi*sisi;
        int kelilingPersegi = 4*sisi;
        System.out.println("Persegi dengan sisi = 4");
        System.out.println("Luas persegi : " + luasPersegi);
        System.out.println("Keliling persegi: " + kelilingPersegi +"\n");
        
        // 2. Luas dan Keliling Segitiga
        double alas = 4.0;
        double tinggi = 12.0;
        double sisiMiring = 12.65; //setiap sisi miring ukurannya diasumsikan sama yaitu 12.65
        double luasSegitiga = 0.5*alas*tinggi;
        double kelilingSegitiga = 3*sisiMiring; //rumus adalah jumlah semua sisi
        System.out.println("Segitiga dengan alas = 4, tinggi = 12, dan sisi miring = 12.65");
        System.out.println("Luas segitiga : " + luasSegitiga);
        System.out.println("Keliling segitiga: " + kelilingSegitiga +"\n");

        // 3. Luas dan Keliling Lingkaran
        double phi = 22.0/7.0;
        double diameterLingkaran = 28;
        double jariJariLingkaran = 0.5*diameterLingkaran;
        double kelilingLingkaran = phi*diameterLingkaran;
        double luasLingkaran = phi*jariJariLingkaran*jariJariLingkaran;
        System.out.println("Lingkaran dengan diameter 28");
        System.out.println("Luas lingkaran : " + luasLingkaran);
        System.out.println("Keliling lingkaran : " + kelilingLingkaran +"\n");

        // 4. Luas dan Keliling Kubus
        int sisiKubus= 7;
        int luasPermukaanKubus = 6*sisiKubus*sisiKubus;
        int volumeKubus = sisiKubus*sisiKubus*sisiKubus;
        int kelilingKubus = 12*sisiKubus;
        System.out.println("Kubus dengan sisi 7");
        System.out.println("Luas permukaan kubus : " + luasPermukaanKubus);
        System.out.println("Volume kubus : " + volumeKubus);
        System.out.println("keliling kubus : " + kelilingKubus);
    


    }
}

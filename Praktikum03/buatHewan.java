public class buatHewan{
    public static void main(String[] args) {
        hewan kucing = new hewan();
        hewan kelinci = new hewan();

        kucing.jenis = "Anggora";
        kelinci.jenis = "Australia";
        kucing.kaki = 4;
        kucing.warna = "Putih";
        kucing.habitat = "Darat";

        kucing.suara("mbeeeeee");

        String makananKucing = kucing.makanan("Rumput");

        System.out.println( "Jenis kucing " + kucing.jenis + "\n Jenis kelinci : " + kelinci.jenis +
                            "\n Banyak kaki kucing : " + kucing.kaki + "\n warna kucing : " + kucing.warna + 
                            "\n habitat kucing : " + kucing.habitat + "makanan kucing : " + makananKucing);

        System.out.println();
    }
}
public class main {
    
    public static void main(String[] args) {
        gaji s = new gaji("Wahyu ", "KUBAR ", 3, 5000.00);
        
        System.out.println("Menyusun Gaji ");
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("");
        
        System.out.println("Menyusun Pegawai ");
        Pegawai e = new Pegawai("Ini Nama ", "Samarinda ", 2);
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();

        

        
    }
}

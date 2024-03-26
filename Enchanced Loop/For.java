public class For {
    public static void main(String[] args) {
        // Contoh penggunaan enhanced for loop untuk mencetak setiap mahasiswa dalam array

        // Inisialisasi variabel "Mahasiswa" dengan tipe data String
        String[] mahasiswa = {"Ali", "Budi", "Cici", "Dini"};
        
        // Menjalankan enhanced for loop
        for (String nama : mahasiswa) {
            System.out.println("Nama Mahasiswa: " + nama);
        }
    }
}
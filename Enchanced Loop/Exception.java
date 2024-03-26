public class Exception {
    public static void main(String[] args) {
        // Contoh kasus di mana enhanced for loop tidak cocok
        // Misalnya, terdapat array mahasiswa beserta indeksnya
        
        String[] mahasiswa = {"Ali", "Budi", "Cici", "Dini"};
        // Pada kasus ini, kita ingin mencetak nama mahasiswa beserta indeksnya
        
        // Enhanced for loop tidak dapat memberikan akses langsung ke indeks, sehingga loop biasa lebih cocok digunakan dalam kasus ini
        
        // Menggunakan for loop biasa
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + i + ": " + mahasiswa[i]);
        }
    }
}

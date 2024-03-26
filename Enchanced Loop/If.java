public class If {
    public static void main(String[] args) {
        // Contoh penggunaan enhanced if loop untuk melakukan operasi hitungan

        // Inisialisasi variabel bilangan bulat "n1", "n2", dan "res"
        int n1 = 15, n2 = 10, res;

        
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Menjalankan enhanced if dengan menggunakan "ternary operation" 
        // Langkah pertama, apabila n1>n2, maka nilai "res" akan menjadi n1+n2, jika sebaliknya (n1<n2), maka nilai "res" akan menjadi n1-n2
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
 
        // Print output yang diinginkan
        System.out.println("Result = " + res);
    }
}
import java.util.Scanner;
/* menunjukkan program dapat menginput*/

public class BacaData {
// Program utama dgn class(BacaData)

	public static void main(String[] args) 
	{
	// deklarasi variabel
	int a;
	
	Scanner masukan; // menunjukkan program dapat menginput
	
	/* Program */
	System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
	// menampilkan out yaitu Contoh membaca dan menulis, ketik nilai integer: (enter)
	
	masukan = new Scanner(System.in);
	// memasukkan variabel Scanner new masukan
	
	// karakter a sbgai(int) = masukan.dari selanjutkanyint()
	a = masukan.nextInt(); 
	/* coba ketik : masukan.nextInt(); ; Apa akibatnya ? */

	//a : masukan.nextInt(); jika saya menggunakan tanda titik : (bukan =) maka terjadi error,
	// karena maksud inputan dari nilai yg dibaca dgn tujuan a ini tdk diketahui), contoh output errornya ada di ss ini //
	
	System.out.print ("Nilai yang dibaca : "+ a);
	// menampilkan output Nilai yang dibaca : + a(nilai yang anda input)
	}
}
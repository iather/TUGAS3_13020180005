public class Oper1 { 
// Program utama untuk pembuatan class (Oper1)

	public static void main(String[] args) {   
		// mendeklarasikan variabel pada tipe data
		
		int n = 10; /* 1010 */ 
 
		int x = 1; 
 
		int y = 2;  

		
  		System.out.println ("n = "+ n); 
		// Menampilkan nilai n
  		System.out.println ("x = "+ x); 
		// Menampilkan nilai x
  		System.out.println ("y = "+ y); 
		// Menampilkan nilai y
  		System.out.println ("n & 8 = "+ (n & 8)); 
		// Menampilkan nilai dari logika and(&) diantara salah satu nilai yang di ambil
  		System.out.println ("x & ~ 8 = "+ (x & ~8)); 
		// Menampilkan nilai dari logika negasi(-) diantara salah satu nilai dan nilai yang bukan 8 kemudian di ambil ang x=1
  		System.out.println ("y << 2 = "+ (y << 2));  
		// Menampilkan nilai dari logika penggeseran bit ke kiri(<<) sebanyak 2 kali penggeseran
  		System.out.println ("y >> 3 = "+ (y >>3)); 
		// Menampilkan nilai dari logika penggeseran
 
	} 
 
}
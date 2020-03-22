public class Oper2 { 
// Program utama untuk pembuatan class (Oper2)
 
	public static void main(String[] args) {   
		// Mendeklarasikan variabel dgn tipe data
		char i, j; 
		i = 3;     
		j = 4;            
		
		System.out.println("i = "+ (int) i);    
		// Menampilkan nilai dari bilangi i yang tipe datanya int
		System.out.println("j = "+ j);   
		// Menampilkan nilai dari bilangan j
		System.out.println("i & j = "+ (i & j));   
		// Menampilkan nilai dari logika and(&) diantara salah satu nilai yang di ambil
		System.out.println("i | j = "+ (i | j));   
		// Menampilkan nilai dari logika bitwise inclusive or (|), membandingkan 2 bit dan menghasilkan nilai 0 hanya jika kedua bit bernilai 0. diantara salah satu nilai yang di ambil
		System.out.println("i ^ j = "+ (i ^ j)); 
		// Menampilkan nilai dari logika bitwise exlusive or (^), membandingkan 2 bit dan menghasilkan nilai 1 hanya jika kedua bit berbeda nilainya, diantara salah satu nilai yang di ambil
		System.out.println(Math.pow(i, j));
		// Menampilkan dari method pow(a,b) utk pemangkatan
		System.out.println("  ~i  = "+ ~i); 
		// Menampilkan negasi nilai i
	}   
 
} 
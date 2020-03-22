public class Ekspresi1 { 
 // Program utama untuk pembuatan class (Ekspresi1)
 
	public static void main(String[] args) {  
		// Mendeklarasikan variabel dgn tipe data
		int x = 1; 
		int y = 2; 
		float fx; 
		float fy; 
 
		// Merupakan deskripsi tipe data dan pemberian nilai setiap tipe data
		System.out.print ("x/y (format integer) = "+ x/y);    
		// Menampilkan hasil pembagian dari nilai x dan y dalam format integer namun format tetap menampilkan nilai int x/y
		System.out.print ("\nx/y (format float) = "+ x/y);  
		// Menampilkan hasil pembagian dari nilai x dan y dalam format float namun format tetap menampilkan nilai int x/y
		fx=x;   
		fy=y; 
		
 		System.out.print ("\nx/y (format integer) = "+ fx/fy);    
		System.out.print ("\nx/y (format float)   = "+ fx/fy);   
		// Menampilkan hasil pembagian dari nilai x dan y dalam format int dan float dgn hasil yang berubah dalam nilai float x/y
 
 		System.out.print ("\nfloat(x)/float(y) (format integer) = "+ (float)x/(float)y);    
		System.out.print ("\nfloat(x)/float(y) (format float)   = "+ (float)x/(float)y); 
		// Menampilkan hasil pembagian dari nilai x dan y dalam format int dan float dgn hasil yang berubah dalam nilai float x/y
 		x = 10; 
		y = 3; 
 
		System.out.print ("\nx/y (format integer) = "+ x/y);    
		System.out.print ("\nx/y (format float)   = "+ x/y);
		// Menampilkan hasil pembagian dari nilai x dan y dlm format integer dan float dengan hasil yang beruba menjadi nilai x=10 dan y=3
	} 
 
} 

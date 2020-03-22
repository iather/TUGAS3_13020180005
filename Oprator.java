public class Oprator{ 
 
	public static void main(String[] args) {   
		// mendeklarasikan variabel dgn tipe data
   		boolean Bool1, Bool2, TF; 
		int i,j, hsl ;    
		float x,y,res;   
		
		System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output"); 
		// menampilkan kata Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output
		
    	Bool1 = true; Bool2 = false;     
		TF = Bool1 && Bool2 ;     
		TF = Bool1 || Bool2 ;      
		TF = ! Bool1 ;      
		TF = Bool1  ^Bool2;    
		// Operasi Numerik //
		i = 5; j = 2 ;       
		hsl = i+j; // penjumlahan
		hsl = i - j; // pengurangan
		hsl = i / j; // pembagian
		hsl = i * j; // perkalian    
		hsl = i / j; // pembagian bulat
		hsl = i%j ;  // modulus (hasil sisa)
		// Operasi numerik //
		x = 5 ; 
		y = 5 ;       
		res = x + y; // penjumlahan
		res = x - y; // pengurangan
		res = x / y; // pembagian
		res = x * y; // perkalian
		TF = (i==j); // perbandingan sama dengan
		TF = (i!=j); // perbandingan tidak sama dengan
		TF = (i < j); // lebih kecil
		TF = (i > j); // lebih besar
		TF = (i <= j); // kurang dari atau sama dengan
		TF = (i >= j); // lebih dari atau sama dengan
		TF = (x != y); // logical negation (unary), memberikan nilai kebalikan (negasi dari operand
		TF = (x < y); // lebih kecil
		TF = (x > y); // lebih besar
		TF = (x <= y); // kurang dari atau sama dengan
		TF = (x >= y); // lebih dari atau sama dengan
		
		System.out.println("Nilai hs1 = " +hsl);
		// Menampilkan hasul nilasi dari hsl
		System.out.println("Nilai res = " + res);
		// Menampilkan hasil nilai dari res
		System.out.println("Nilai tf = " + TF);
		// Menampilkan hasil nilai dari TF
	}
 
} 
  
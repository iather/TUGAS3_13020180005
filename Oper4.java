public class Oper4 { 
// Program utama untuk pembuatan class (Oper4)
 
	public static void main(String[] args) {
		// Mendeklarasikan variabe dgn tipe data
  		int i = 0; 
		int j = 0; 
 
  		char c = 8; char d = 10;   
		int e = (((int)c > (int)d) ? c: d);    
		// Menampilkan nilai e dari dari proses pernyataan nilainya c > dari d, yg salah akan diinput
		int k = ((i>j) ? i: j);  
		// Menampilkan nilai k dari proses  pernyataan nilainya i > dari j, yg salah akan diinput
 
  		System.out.print  ("Nilai e = "+ e);  
		// Menampilkan nilai e + dari inputan e
		System.out.print  ("\nNilai k = "+ k); 
		// Menampilkan nilai k + dari imputan k
		i = 2;   
		j = 3; 
		// inputan variabel
 
  		k = ((i++>j++) ? i: j) ; 
		// Menampilkan nilai k dari proes pernyataan nilai i > dari j, yg salah akan diinput + ditambah 1
 		System.out.print  ("\nNilai k = "+ k);   
	} 

} 
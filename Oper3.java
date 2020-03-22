public class Oper3 { 
// Program utama untuk pembuatan class (Oper3)
 
	public static void main(String[] args) {      
		if (true && true){ System.out.println(true && true); } 
		// Menampilkan nilai dari logika and(&) diantaranya smua nilai yg di ambil harus bernilai True(benar)
		if (true & true) { System.out.println(true & false); }   
		// Menampilkan nilai dari logika and(&) diantaranya smua nilai yg di ambil harus bernilai True(benar)
		/* jika salah satu bernilai salah maka akan salah(false) */
		if (true)   { System.out.println(true); } 
		if (true || true){ System.out.println(true); } 
		if (true|false)  { System.out.println(true|false); } 
		// Menampilkan nilai dari logika or(|) diantaranya salah satu nilai yg di ambil bernilai benar(True)
		// jika salah satu bernilai false(salah) maka akan juga akan true(benar)
	} 
 
} 
 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import javax.swing.*; //
// contoh menggunakan import java.io. //

public class Bacakar {

	public static void main(String[] args) throws IOException
	{
	
	// mendeklrasikan variabel dgn karakter
	char cc;
	int bil;
	
	// Pengimporan(pemanggilan) karakter dari java.io
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader dataIn = new BufferedReader(isr);
	// atau
	BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
	
	/* Algoritma */
	// Algoritma pengimputan tiap kata
	System.out.print ("hello\n");
	System.out.print("baca 1 karakter : ");
	
	//perintah baca karakter cc
	cc =dataIn.readLine().charAt(0);
	// menampilkan baca 1 bilangan
	System.out.print("baca 1 bilangan : ");
	
	//perintah baca bil
	bil =Integer.parseInt(datAIn.readLine());
	
	/*String kar = JOptionPane.showInputDialog("Karakter 1 : ");
	System.out.println(kar);*/
	//JOptionPane.showMessageDialog(null, "hello");
	System.out.print (cc +"\n" +bil+"\n");
	System.out.print ("bye \n");
	// Output dari karakter cc + bil+
	// kemudian menampilkan kata terakhir bye
	// note(\n(enter))
	}
}
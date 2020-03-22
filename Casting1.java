/*Casting menggunakan tipe data primitif*/
public class Casting1 {
	// program pertama dengan class Casting1
	public static void main(String[] args) 
	{
	// mendeklarasikan variabel 
	int a=5,b=6;
	float d=2.f,e=3.2f;
	char g='5';
	double k=3.14;
	
	// Program yang ingin di tampilkan
	System.out.println((float)a); // int <-- float
	System.out.println((double)b); // int <-- double
	System.out.println((int)d); // float <-- int
	System.out.println((double)e); // float <-- double
	System.out.println((int)g); // char <-- int (ASCII)
	System.out.println((float)g); // char <-- float (ASCII)
	System.out.println((double)g); // char <-- double (ASCII)
	System.out.println((int)k); // double <-- int
	System.out.println((float)k); // double <-- float
	}
}
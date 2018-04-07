import java.util.Random;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class GraOrzelReszka{
	private static String rzuc(){
		Random r = new Random();
		if(r.nextBoolean()) return "Reszka";
		return new String("Orzeł".getBytes(), Charset.forName("UTF-8"));
	}
	public static void main(String[] args){
		PrintStream p = System.out;
		p.println(rzuc());
		
		p.println(Integer.toBinaryString(1234));
		
		int i = 0;
		while(i < 10){
			p.println(rzuc());
			i++;
		}
	}
}
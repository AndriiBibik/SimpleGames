import java.util.Random;
import java.util.Arrays;

public class Yatzee {
	public static void main(String[] args) {
		byte[] dices = new byte[5];
		Random r = new Random();
		boolean isYatzee = false;
		int count = 0;
		while(!isYatzee) {
			for(int i = 0; i < dices.length; i++) {
				dices[i] = (byte)(r.nextInt(6) + 1);
			}
			isYatzee = isYatzee(dices);
			count++;
		}
		System.out.println(Arrays.toString(dices));
		System.out.println(count + " Yatzee!");
	}
	public static boolean isYatzee(byte[] dices) {
		for (int i = 1; i < dices.length; i++) {
			if (dices[i-1] != dices[i])
				return false;
		}
		return true;
	}
}
		
			
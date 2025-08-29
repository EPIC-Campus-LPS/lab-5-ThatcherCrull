package pack;
import java.util.Arrays;
import java.util.Scanner;
public class Part1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		String a = scan.nextLine();
		System.out.print("Input: ");
		String b = scan.nextLine();
		String noSpacesa = new String(a);
		noSpacesa = noSpacesa.replaceAll(" ",null);
		String noSpacesb = new String(b);
		noSpacesb = noSpacesb.replaceAll(" ",null);
		char[] ac = noSpacesa.toCharArray();
		char[] bc = noSpacesb.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		
		if (Arrays.equals(ac, bc)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		scan.close();
	}

}

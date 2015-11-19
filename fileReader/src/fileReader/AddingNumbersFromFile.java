package fileReader;
import java.util.*;
import java.io.*;

public class AddingNumbersFromFile{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter file directory: ");
		String dir = s.nextLine();
		FileReader f = new FileReader(dir);
		BufferedReader r = new BufferedReader(f);
		String result = "";
		String read = r.readLine();
		Stack<Integer> num1 = new Stack<Integer>();
		Stack<Integer> num2 = new Stack<Integer>();
		String print = "";
		
		String num = "";
		int ans = 0;
		
		while(read != null)
		{
			result += read;
			read = r.readLine();
		}
		for(int i = 0; i<result.length();i++)
		{
			if(isNumeric(String.valueOf(result.charAt(i))) == true)
			{
				while(isNumeric(String.valueOf(result.charAt(i))) == true)
				{
					num += "" + result.charAt(i);
					i++;
				}
				ans += Integer.parseInt(num);
				num1.push(Integer.parseInt(num));
				num = "";
			}
		}
		for(int temp : num1)
		{
			print += temp + " + ";
		}
		if(print.length() >2)
		{
			System.out.println("Output: " + print.substring(0, print.length() - 3) + " = " + ans);
		}
		else{
			System.out.println("Output: 0");
		}
	}
	public static boolean isNumeric(String s) {  
	    return s.matches("[-+]?\\d*\\.?\\d+");  
	}

}

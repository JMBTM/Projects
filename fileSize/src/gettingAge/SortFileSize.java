package gettingAge;
import java.io.*;
import java.util.*;

public class SortFileSize {
		
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			Stack<String> fileList = new Stack<String>();
			Stack<String> fileList1 = new Stack<String>();
			Stack<Long> fileSize = new Stack<Long>();
			Stack<Long> fileSize1 = new Stack<Long>();
			long fileSize2;
			String fileList2;
			
			System.out.println("Enter file directory: ");
			String dir = s.nextLine();
			Stack<String> list = new Stack<String>();
			File f = new File(dir);
			File[] fl = f.listFiles();
			for(File f2 : fl)
			{
				if(f2.isFile())
				{
					fileList.push(f2.getName() + " - Size: " + f2.length() + " bytes");
					fileSize.push(f2.length());
				}
			}
			while(!fileSize.isEmpty()){
				
				fileSize2 = fileSize.pop();
				fileList2 = fileList.pop();
				while(!fileSize1.isEmpty() && fileSize2 < fileSize1.peek())
				{
					fileSize.push(fileSize1.pop());
					fileList.push(fileList1.pop());
				}
				fileSize1.push(fileSize2);
				fileList1.push(fileList2);
			}
			for(String x : fileList1)
			{
				System.out.println(x);
			}
		}
	}
	






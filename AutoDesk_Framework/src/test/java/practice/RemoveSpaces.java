package practice;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter string");
		  String str= sc.nextLine();

			
					char[] ch=str.toCharArray();
					
					String nstr=" ";
					
					for(int i=0;i<ch.length;i++)
					{
						if(ch[i]!=' ')
							nstr=nstr+ch[i];
					}
					
				
			System.out.println(nstr);
	}

}
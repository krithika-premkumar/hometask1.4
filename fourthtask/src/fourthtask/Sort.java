package fourthtask;

import java.lang.reflect.Array;

public class Sort {
	
public static void main(String[]args)
{
	StringBuilder text = new StringBuilder("To be or not to be, that is the question;"
			+"Whether `tis nobler in the mind to suffer" 
			+" the slings and arrows of outrageous fortune,"
			+" or to take arms against a sea of troubles,"
			+" and by opposing end them?");
	for(int i=0;i<text.length();i++)
	{
		if((text.charAt(i)>=97 && text.charAt(i)<= 122)||(text.charAt(i)>=65 && text.charAt(i)<= 90) )
		{
			
		}
		else if(text.charAt(i)== ' ')
		{
			
		}
		else if(text.charAt(i)== ';')
		{
		   text.setCharAt(i, ' ');	
		}
		else
		{
			text.deleteCharAt(i);
		}
	}
	String nama = new String(text);
String[]newtext = nama.split(" ");
	String temp;
	
	for (int j = 0; j < newtext.length; j++) {
	   	   for (int i = 0; i < newtext.length-1; i++) {
			// comparing adjacent strings
			if (newtext[i].compareTo(newtext[i+1]) > 0) {
				temp = newtext[i+1];
				newtext[i+1] = newtext[i];
				newtext[i] = temp;
			}
		   }
		}

	for(int i =0;i<Array.getLength(newtext);i++)
	{
		System.out.println(newtext[i]);
	}
}

}

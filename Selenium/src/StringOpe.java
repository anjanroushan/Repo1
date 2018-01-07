public class StringOpe {
public static void main(String args[]){
	String str= "Nikhil";
	char[]chr= str.toCharArray();
	for(int i=chr.length-1;i>=0;i--)
	{
		System.out.println(chr[i]);
	}
}
}

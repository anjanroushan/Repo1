import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class Test {
public static void main(String args[])
{
	List<Book> list = new LinkedList<Book>();
	
	Book b1 = new Book(101,"Let Us C","Yashwant","BPB",8);
	Book b2 = new Book(102,"Communications","Forouzan","Graw",4);
	Book b3 = new Book(103,"System","Galvin","Wiley",5);
	
	list.add(b1);
	list.add(b2);
	list.add(b3);
	
	Iterator<Book> itr = list.iterator();
	while(itr.hasNext())
	{
		//System.out.println(itr.next());
	//	Book b=(Book)itr.next();
		Book b =itr.next();
		System.out.println(b.id);
		
	}
	/*for(Book b:list)
	{
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+ " "+b.quantity);
	}*/
}
}

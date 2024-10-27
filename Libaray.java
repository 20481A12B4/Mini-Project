package project_libaray;

import java.util.*;
public class Libaray 
{
	private int lbid;
	private String location;
	
	Book b;
	
	ArrayList<Book> book=new ArrayList<Book>();
	
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book is added sucessfully.....");
	}
	
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.out.println("Books are not added into ArrayList");
		}
		else
		{
			for(Book b :book)
			{
				b.display();
			}
		}
	}
	
	public void searchBookBasedOnId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not addded into arraylist");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("Book found........");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new IdOutOfBoundsException();
		}
	}
	public void searchBookBasedOnAuthor(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not addded into arraylist");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor().equals(author))
				{
					System.out.println("Book found........");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new IdOutOfBoundsException();
		}
	}
	public void updateBookCostBasedOnTitle(String title)
	{
		boolean isModify=false;
		if(book.isEmpty())
		{
			System.out.println("Book is not added in ArrayList");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getTitle().equals(title))
				{
					b.setCost(1000);
					System.out.println("Update sucessfully...");
					isModify=true;
				}
			}
		}
		if(isModify!=true)
		{
			throw new TitleOutOfBoundsException();
		}
	}
	public void removeBookBasedOnId(int id)
	{
		boolean isRemove=false;
		Iterator<Book> i=book.iterator();
		if(book.isEmpty())
		{
			System.out.println("Book are not added into collection");
		}
		else
		{
			while(i.hasNext())
			{
				Book b=i.next();
				if(b.getId()==id)
				{
					i.remove();
					System.out.println("Remove Book sucessfully...");
					isRemove=true;
				}
			}
		}
		if(isRemove==false)
		{
			throw new IdOutOfBoundsException();
		}
	}
}

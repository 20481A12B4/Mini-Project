package project_libaray;

class BookTitleException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+":Title should be in Java || Sql || Python ";
	}
}
class BookIdException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": Book id must be even ";
	}
}
class BookCostException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": Book Cost Between 300 to 2000";
	}
}
class BookNoOfPagesException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": No Of Pages is Between 300 to 3000";
	}
}
class BookAuthorException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": Author is James || Scott || Aleans";
	}
}
public class Book 
{
	private String title;
	private int id;
	private int cost;
	private int noOfPages;
	private String author;
	
	public Book() {}
	
	public Book(String title,int id,int cost,int noOfPages,String author)
	{
		if(validateTitle(title))
		{
			this.title=title;
		}
		else
		{
			throw new BookTitleException();
		}
		if(validateId(id))
		{
			this.id=id;
		}
		else
		{
			throw new BookIdException();
		}
		if(validateCost(cost))
		{
			this.cost=cost;
		}
		else
		{
			throw new BookCostException();
		}
		if(validateNoOfPages(noOfPages))
		{
			this.noOfPages=noOfPages;
		}
		else
		{
			throw new BookNoOfPagesException();
		}
		if(validateAuthor(author))
		{
			this.author=author;
		}
		else
		{
			throw new BookAuthorException();
		}
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCost() {
		return cost;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public boolean validateTitle(String title)
	{
		if(title.equals("Java") || title.equals("Sql") || title.equals("Python"))
			return true;
		return false;
	}
	public boolean validateId(int id)
	{
		if(id%2==0)
			return true;
		return false;
	}
	public boolean validateCost(int cost)
	{
		if(cost >=300 && cost<=2000)
			return true;
		return false;
	}
	public boolean validateNoOfPages(int noOfPages)
	{
		if(noOfPages>= 300 && noOfPages<=3000)
			return true;
		return false;
	}
	public boolean validateAuthor(String author)
	{
		if(author.equals("James") || author.equals("Scott") || author.equals("Alean"))
			return true;
		return false;
	}
	public void display()
	{
		System.out.println("BookTitle: "+getTitle());
		System.out.println("BookId :"+getId());
		System.out.println("BooCost :"+getCost());
		System.out.println("BookNoOfPages :"+getNoOfPages());
		System.out.println("BookAuthor :"+getAuthor());
	}
	
	
	@Override
	public String toString() {
		return "Book \n title=" + title + "\n id=" + id + "\n cost=" + cost + "\n noOfPages=" + noOfPages + "\n author="
				+ author + "\n ";
	}
	
	
	
}

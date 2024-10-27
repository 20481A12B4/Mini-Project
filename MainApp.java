package project_libaray;

import java.util.*;
public class MainApp 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Libaray l=new Libaray();
		boolean isStart=true;
		String title;
		int id;
		int cost;
		int noOfPages;
		String author;
		while(isStart)
		{
			System.out.println("Enter the choice \n 1.AddBook  \n 2.DisplayBook \n 3.SearchBookBaseOnId \n 4.SearchBookBasedOnAuthor \n 5.UpdateBookCostBasedOnBookTitle \n 6.RemoveBookBAsedOnId \n 7.Exit");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					while(true)
					{
						try
						{
							System.out.println("Enter Book Title");
							title=sc.next();
							System.out.println("Enter Book Id");
							id=sc.nextInt();
							System.out.println("Enter the Cost Of Book");
							cost=sc.nextInt();
							System.out.println("Enter the No Of Pages in Book");
							noOfPages=sc.nextInt();
							System.out.println("Enter the Author name");
							author=sc.next();
							l.addBook(new Book(title, id, cost, noOfPages, author));
							break;
						}
						catch(BookTitleException e)
						{
							System.out.println("Enter the valid Title");
							title=sc.next();
						}
						catch(BookIdException e1)
						{
							System.out.println("Enter the valid Id ");
							id=sc.nextInt();
						}
						catch(BookCostException e2)
						{
							System.out.println("Enter the valid Cost");
							cost=sc.nextInt();
						}
						catch(BookNoOfPagesException e3)
						{
							System.out.println("Enter the valid No Of Pages");
							noOfPages=sc.nextInt();
						}
						catch(BookAuthorException e4)
						{
							System.out.println("Enter the valid Author name");
							author=sc.next();
						}
					}
					
				}
				break;
				case 2:
				{
					l.displayBook();
				}
				break;
				
				case 3:
				{
					System.out.println("Enter the Book ID");
					 id=sc.nextInt();
					l.searchBookBasedOnId(id);
				}
				break;
				
				case 4:
				{
					System.out.println("Enter the Book Author name");
					author=sc.next();
					l.searchBookBasedOnAuthor(author);
				}
				break;
				
				case 5:
				{
					System.out.println("Enter the Title of the Book");
					title=sc.next();
					l.updateBookCostBasedOnTitle(title);
				}
				break;
				
				case 6:
				{
					System.out.println("Enter the Book ID");
					id=sc.nextInt();
					l.removeBookBasedOnId(id);
				} break;
				
				case 7:
				{
					System.out.println("Thank You...........");
					isStart=false;
				}
				break;
				
				default:System.out.println("Enter the valid Choice.........");
			}
		}
	}
}

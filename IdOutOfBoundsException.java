package project_libaray;

public class IdOutOfBoundsException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": Id is even";
	}
}

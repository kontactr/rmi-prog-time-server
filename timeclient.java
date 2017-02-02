
import java.rmi.registry.*;
import java.util.*;
public class timeclient
{
	public static void main(String args[])throws Exception
	{
	Scanner s1 = new Scanner(System.in);
	Registry registry = LocateRegistry.getRegistry();
	timeinter ti = (timeinter)registry.lookup("timeinter");
	System.out.println(ti.interest(s1.nextInt(),s1.nextInt(),s1.nextInt()));
	
	
	}
}
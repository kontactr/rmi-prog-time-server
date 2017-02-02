
import java.rmi.registry.*;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class timeser implements timeinter
{
	public int interest(int p,int r,int n )
	{
		//System.out.println(new Date().toString());
		return (p*r*n / 100);
	}
	
	public static void main(String args[])throws Exception
	{
		timeser ts = new timeser();
		timeinter ti = (timeinter) UnicastRemoteObject.exportObject(ts,0);
		Registry registry = LocateRegistry.getRegistry();
        registry.bind("timeinter", ti);
		
	}
	
}
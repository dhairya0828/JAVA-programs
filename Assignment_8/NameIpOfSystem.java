import java.net.*;

class NameIpOfSystem{
	
	public static void main(String[] args) throws Exception{
		
		InetAddress local = InetAddress.getLocalHost();

		System.out.println("Name of System : " + local.getHostName());
		System.out.println("Ip of System : " + local.getHostAddress());
	}	
}
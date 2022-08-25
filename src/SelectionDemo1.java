
public class SelectionDemo1 {

	public static void main(String[] args) 
	{
	
		int n = 5;
		//string d = "abc";
		
		//if(n==1)
		//	System.out.println("One");

		//else if(n==2)
		//	System.out.println("Two");
		
		//else if(n==3)
		//	System.out.println("Three");
		
		switch(n)
		//switch(d)
		{
		case 1:
		//case "abc":
			System.out.println("one");
			break;
		case 2:
		//case "pqr":
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
		    System.out.println("Four");
			break;
		case 5: 
			System.out.println("Five");
			break;
		default:
			System.out.println("NO Match");
		}
	}

}

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String vc= args[1];
		int a= Integer.parseInt(args[0]);
		int b;
		int i=1;
		
		if( vc.charAt(0) == 'v' ){
		
		while(i<=a){
			System.out.print( i);	
		if(i%2==0){
			b = i/2;
		}else{
			b= (i*3)+1;
		}
		System.out.print(" " + b );
		int count = 2;
		while(b!=1){
			if(b%2==0){
				b = b/2;
			}else{
				b= (b*3)+1;
			}
		System.out.print(" " + b);
			count++;
		}

	//	}
		System.out.println(" ("+count+")");
		i++;

		}

		System.out.println("Every one of the first "+ a+ " hailstone sequences reached 1.");
	}else{
		System.out.println("Every one of the first "+ a+ " hailstone sequences reached 1.");
	}

	}
}

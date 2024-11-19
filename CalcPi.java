// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		double pi= Math.PI;
		int input= Integer.parseInt(args[0]);;
		int i= 1;
		double pii= 1-1/3;
		while(i<input){
			double div= 3+2*i;
			 if(i%2 == 1){
				pii=pii + 1/div;
			}else if(i%2!=0){
				pii=pii- 1/div;
			}
			i++;
		}
		double piii= 4/pii;

		System.out.println("pi according to Java:" + pi);
		System.out.println("pi, approximated:" + piii);


	}
}

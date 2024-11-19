// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String cheer= args[0];
            int num= Integer.parseInt(args[1]);
            int i= 0;
            String l= "AEFHILMNORSXaefhilmnorsx";

            while(i<cheer.length()){
                char c= cheer.charAt(i);
                if(l.indexOf(c) != -1) {

                System.out.println("Give me an  " + Character.toUpperCase(cheer.charAt(i)) + ": " + Character.toUpperCase(cheer.charAt(i)) + "!");

            }else {
                System.out.println("Give me a  " + Character.toUpperCase(cheer.charAt(i)) + ": " + Character.toUpperCase(cheer.charAt(i)) + "!"); 
            }
            i++;
        }

        for (int j= 0; j<num; j++){
                System.out.println(cheer.toUpperCase() + "!!!");
        }


        }
}

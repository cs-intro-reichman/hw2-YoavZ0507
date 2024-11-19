public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int mintoadd= Integer.parseInt(args[1]);

        int totmin= (hours*60)+ minutes +mintoadd ;
        int tothours= totmin/60;
        int newhours= tothours%24;
        int newmin= totmin-(tothours*60);

        if(newmin<10 & newhours<10){
            System.out.println("0"+ newhours+":0"+newmin);
        } else if( newmin<10 & newhours>10 ) {
            System.out.println( newhours+":0"+newmin);
        }else if( newmin>10 & newhours<10 ){
            System.out.println("0"+ newhours+":"+newmin);  
        } else{
         
        System.out.println(newhours+":"+newmin);
        }
    }
}

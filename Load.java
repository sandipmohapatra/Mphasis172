package Thursday;
import java.util.*;
class Load { 
    public static void main( String[] args ) { 
        List<List<Integer>> array = new ArrayList<List<Integer>>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        System.out.println("Enter m:");
        int m = input.nextInt();
        System.out.println("Enter the values:");
        for( int i = 0 ; i < n ; i++ ) { 
            // add row:
            List<Integer> list = new ArrayList<Integer>();
            array.add( list );
              for( int j = 0 ; j < m ; j++ ) { 
               list.add( input.nextInt() );    
                   }        }
        System.out.println("Result:");
        System.out.println( array );   
    }}



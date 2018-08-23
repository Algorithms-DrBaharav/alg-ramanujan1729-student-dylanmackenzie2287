import java.lang.*;
/**
 *
 * @author YourNameHere
 * 
 * 
 *  See README file for description
 * 
 */

 

class Main1729{
    
    
    public static void main(String[] args) {
        double num = 1729;
        for(int i =0; i< Math.cbrt(num); i++)
            for(int y =1; y<i; y++)
                if((i*i*i + y*y*y)== 1729)
                    System.out.println(i + " and " + y);
            
    }

}
// Your work here. Just carete one class and one main function.

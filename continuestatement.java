public class Example {
    public static void main(String args[])  //main method
    {    //initialising variable 
        // printing numbers from 0 to 14 using for loop
        for (int n = 0; n < 15; n++) {
            // If the number is 8
            // continue keyword will skip the number 8 and continue the loop
            if (n == 8)
                continue;
 
            System.out.print(n + " ");
        }
    }
}
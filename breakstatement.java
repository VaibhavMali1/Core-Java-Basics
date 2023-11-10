public class example {
    public static void main(String[] args)
    {
        // for loop that will print numbers from 0 to 14
        for (int i = 0; i < 15; i++) {
            
            if (i == 8) //specifying the condition
                break; //loop is terminated by using the break keyword
            System.out.println("i= " + i);
        }
        System.out.println("loop terminated");
    }
}
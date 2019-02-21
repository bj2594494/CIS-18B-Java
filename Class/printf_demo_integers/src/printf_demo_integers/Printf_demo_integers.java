package printf_demo_integers;

import java.util.Scanner;

public class Printf_demo_integers {
    
    public static void main(String[] args) {
        Scanner kb = new java.util.Scanner(System.in);
        
        System.out.print("Hello, please enter an integer: ");
        int my_value = kb.nextInt();
        
        System.out.printf("You entered '%10d'\n",my_value);//right justified
        System.out.printf("You entered '%-10d'\n",my_value);//left justified
    }
    
}

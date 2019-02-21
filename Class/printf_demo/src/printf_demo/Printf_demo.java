package printf_demo;
//alvin alexander printf cheatsheet
//format specifiers:
    //%(format type)
public class Printf_demo {

    public static void main(String[] args) {
        System.out.printf("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
        System.err.printf("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
        String result = String.format("the %s jumped over the %s, %d times\n", "cow", "moon", 2);
        
        System.out.println(result);
    }
    
}

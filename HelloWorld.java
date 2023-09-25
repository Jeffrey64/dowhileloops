
/**
 * Write a description of class whileloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i += 1;
        }
        int k = 15;
        while (k > 5) {
            System.out.println("k is " + k + " and is greater than 5");
            k -= 1;
        }   
        while (a < 10 & b <= 20) {
            System.out.println("a is " + a + " but is less than 10"); 
            a += 1;
            System.out.println("b is " + b + " and is less than or equal to 20");
            b += 1;
        }
    }
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

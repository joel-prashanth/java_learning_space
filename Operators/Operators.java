package Operators;

public class Operators{
    public static void main(String[] args){

        System.out.println("Joel" + "Prashanth"); /*Concatenation */
        System.out.println(2+2); /*Addition */
        System.out.println(8-6); /*Subtraction */
        System.out.println(2*5); /*Multiplication */
        System.out.println(3%2); /*Remainder */

        int x = 10; /*Assignment */
        System.out.println(x);

        x += 10; /*Add and assign */
        x++; /*Increment */
        x--; /*Decrement */
        x -= 10; /*Subtract and assign */
        x /=2; /*Divide and assign */
        x %= 2; /*Modulus and assign */


        int y = 5;
        int z = 6;

        System.out.println(y == z);
        System.out.println(y != z);
        System.out.println(y > z);
        System.out.println(y < z);
        System.out.println(y >= z);
        System.out.println(y <= z);

        int i = 7;
        int j = 9;

        System.out.println((i > 0) && (j > 0));
        System.out.println((i < 0 ) || (j > 0));
        System.out.println(!(i > 0));

    }
}
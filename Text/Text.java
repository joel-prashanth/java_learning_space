package Text;

public class Text {
    public static void main(String[] args){
        String language = "Java";
        char firstLetter = language.charAt(0); /*Char index */
        System.out.println(firstLetter);

        System.out.println(language.length()); /*Length of a string */

        String fruit = "Banana";

        String partFrom1to4 = fruit.substring(1, 4); /* String slcicing */
        System.out.println(partFrom1to4);

        // B is capital
        String fruit1 = "Banana";

        // b is small
        String fruit2 = "banana";
        
        // B is capital
        String fruit3 = "Banana";

        boolean result = fruit1.equals(fruit2); /*Compare strings in the same order */
        boolean result2 = fruit2.equals(fruit3);
        System.out.println(result2);
        System.out.println(result);

        String name = "jOeL";
        System.out.println(name.toLowerCase()); /*Lower Case */
        System.out.println(name.toUpperCase()); /*Upper Case */

        System.out.println(name.contains("oel")); /*contains a sequence check */

        System.out.println(name.replace('O', 'i')); /*Replace old char with new char */

    }
    
}

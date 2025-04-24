package ForLoops;

public class ForLoops {
    public static void main(String[] args){

        String name = "Why the heck is this sentence being checked for number of vowels in this sentence?";
        name.toLowerCase();
        int i;
        int count = 0;

        for (i=0; i<name.length(); i++){
            if(name.charAt(i) == 'a'|| name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
               
                count++;
            }
        }
        System.out.println(count);



  
    }
    
}

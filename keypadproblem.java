//keypad problem
package BackTracking;

public class solution {
    final static char keypad[][]={ //here we have written final becoz values kabhi change nhi hogi
        {}, //0 index
        {}, //1 index
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };
    public static void letterCombination(String givenString) {
        int len=givenString.length();
        if(len==0) {
            System.out.println("");
            return;
        }
        recursive_function(0,len,"",givenString);
    }
    public static void recursive_function(int pos, int len, String outputString, String givenString) {
        if(pos==len) {
            System.out.println(outputString);
        }
        else {
            char letters[]=keypad[givenString.charAt(pos)-'0'];  //ascii value of
            for(int i=0;i<letters.length;i++) {
                recursive_function(pos+1,len,outputString+letters[i],givenString);
            }
        }
    }
    public static void main(String[] args) {
        letterCombination("23");
    }
}

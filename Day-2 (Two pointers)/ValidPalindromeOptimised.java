public class ValidPalindromeOptimised {
    public static void main(String[] args) {
        String name = "abc";

        System.out.println(checkPali(name));
    }

    static boolean checkPali(String s){
        int st = 0;
        int end = s.length()-1;
        
        while(st<end){
            
            // here when you encounter unique char then the all string except left+1 ->  end or left -> end-1  must be PALINDROME ,

            
            // Hence it (Q). can be palindrome after deleting at most one character from it.

            if(s.charAt(st) != s.charAt(end)){
                return compare(st+1, end, s) || compare(st, end-1, s);
            }
            st++;
            end--;
        }

        return true;
    }


    static boolean compare(int st , int end , String s){
        while(st<end){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }

            st++;
            end--;
        }
        return true;
    }
}

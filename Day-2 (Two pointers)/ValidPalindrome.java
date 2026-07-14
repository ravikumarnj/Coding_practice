class ValidPalindrome{
    public static void main(String[] args) {
        String name = "abca";

        System.out.println(checkPali(name));
    }

    public static boolean checkPali(String str){
         int st =0;
        int end = str.length()-1;

        while(st<end){
            
            int lpt = 1;
            int rpt = 1;

            if(str.charAt(st) != str.charAt(end)){
                int innerLeft = 0;
                int innerRight = str.length()-1;

                while(innerLeft<innerRight){
                    if(innerLeft == st ){
                        innerLeft++;
                        continue;
                    }
                    if(str.charAt(innerLeft)!= str.charAt(innerRight)){
                        lpt = 0;
                        break;
                    }
                    innerLeft++;
                    innerRight--;
                }

                int outerLeft = 0;
                int outerRight = str.length()-1;

                while(outerLeft<=outerRight){
                    if(outerRight == end ){
                        outerRight--;
                        continue;
                    }

                     if(str.charAt(outerLeft)!= str.charAt(outerRight)){
                        rpt = 0;
                        break;
                    }
                    outerLeft++;
                    outerRight--;

                }
                return (lpt == 1 || rpt == 1)?true:false;

            }
            st++;
            end--;
        }

        return true;
    }
}
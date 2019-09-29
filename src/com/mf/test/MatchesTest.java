package com.mf.test;

public class MatchesTest
{
    /**
     * Assuming that intermediate string patterns stated in the problem are not required.
     * Hence this implementation will not be able to generate those intermediate string patterns.
     * If intermediate string patterns are required to print, then use method 'myFunction2(String str)'.
     *
     * @param str input string
     * @return incrementally reverses input string for each character in the string.
     */
    public static String myFunction(String str)
    {
        if(str == null || str.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0,j=str.length()-1; i< (str.length()+1)/2 ; i++,j--){

            if(i==j)
            {
                sb.append(str.charAt(i));
                break;
            }
            sb.append(str.charAt(j));
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Assuming that intermediate string patterns stated in the problem are important and required to generate.
     * Hence this implementation will generate all the intermediate string patterns and finally the desired output string.
     * Also look at method 'myFunction(String str)'. It is more optimised but does't generate the intermediate string patterns.
     *
     * @param str input string
     * @return incrementally reverses input string for each character in the string.
     */
    public static String myFunction2(String str)
    {
        if(str == null || str.isEmpty()){
            return "";
        }

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        StringBuilder reverse = new StringBuilder();

        for(int i=0; i < str.length()-1 ; i++)
        {
            System.out.println(reverse.toString()+sb);
            reverse.append(sb.charAt(0));
            sb.delete(0,1);
            sb.reverse();
        }
        reverse.append(sb.charAt(0));
        return reverse.toString();
    }


}

public class Main
{
    public static void main(String args[])
    {
        String input = "akshay dongare";
        String output = "";
        int len = input.length(),flag = 0;
        System.out.println("Input String : " + input);
        for(int rk=0;rk<len;rk+=2)
        {
            output += input.charAt(rk);
        }
        for(int rk=1;rk<len;rk+=2)
        {
            output += input.charAt(rk);
        }
        System.out.println("Ciphered Text : "+output);
    }
}
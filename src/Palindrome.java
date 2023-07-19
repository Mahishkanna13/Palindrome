import java.util.Scanner;

public class Palindrome {
    public static boolean Check(String Letter,int start,int end)
    {
        if(start>end)
        {
            return true;
        }
        if(Letter.charAt(start)!=Letter.charAt(end))
        {
            return false;
        }
        return Check(Letter,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Letter=scanner.nextLine();
        int start=0;
        int end=Letter.length()-1;
        if(Check(Letter,start,end))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}

import java.util.*;

public class frequency {

    public static void main(String args[])
    {
        String str;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        System.out.println("Enter the character");
        char ch=sc.nextLine().charAt(0);
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
            System.out.println("Frequency count of "+ch+" is" +count);
    }
    
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class flie_handling 
{
    public static void main(String args[])
    {
       try
       {

            FileReader fr = new FileReader("file1.txt");
            FileWriter fw = new FileWriter("file2.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str=br.readLine()) !=null)
            {
                System.out.println(str);
                fw.write(str);
            }
            fw.close();
            fr.close();

        }
        catch(IOException e)
        {
            System.out.println("Exception Occured");
        }
    }

}
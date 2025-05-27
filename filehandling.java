import java.io.*;

public class filehandling 
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin=new FileInputStream("file123");
            FileOutputStream fout=new FileOutputStream("file321");
            int i;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
                fout.write(i);
            }
            fin.close();
            fout.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("YOU ARE GAY");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

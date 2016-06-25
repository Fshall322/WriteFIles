/**
 * Created by Frank Hall on 6/25/2016.
 */
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class WriteFile
{
    public static void main(String[] args)
    {
        String name = "Bugs Bunny";
        Path outfile = Paths.get("D:\\Java\\CurrentWork\\testFile.txt");
        byte[] data = name.getBytes(); //Data from a file must be sate to an array with data type byte
        OutputStream output = null;

        try
        {
            output = new BufferedOutputStream(Files.newOutputStream(outfile, CREATE));
            output.write(data);
            output.flush();
            output.close();

        }
        catch(Exception e)
        {
            System.out.println("Message: "+e);
        }
    }
}

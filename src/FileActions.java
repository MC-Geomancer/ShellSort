import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class FileActions
{
    int[] ArrayData;

    public void ReadFile(String FileToSort,int size) throws IOException {
        ArrayData = new int[size];
        Path file = Paths.get(FileToSort);
        Scanner scanner = new Scanner(file);
        for(int i = 0;scanner.hasNextInt();i++)
        {
            if(scanner.hasNextInt())
             ArrayData[i] = scanner.nextInt();

            else
            {
                scanner.next();
            }
        }
    }
    public void WriteFile(String SortedFile) throws IOException {
        File file = new File(SortedFile);
        if(!file.exists())
            file.createNewFile();
        PrintWriter pw = new PrintWriter(SortedFile+"(Sorted).txt");
        for(int i = 0;i!=ArrayData.length;i++)
        pw.print(ArrayData[i]+", ");
        pw.close();
    }
}

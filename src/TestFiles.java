import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TestFiles
{
    PrintWriter pw;
    String[] TestFileName =  {"ShortUnsorted.txt","MidUnsorted.txt","LongUnsorted.txt","ShortReversedSorted.txt", "MidReversedSorted.txt","LongReversedSorted.txt","ShortHalfSorted.txt","MidHalfSorted.txt", "LongHalfSorted.txt","ShortSorted.txt","MidSorted.txt","LongSorted.txt"};
    Random random = new Random();

    File ShortUnsorted;
    File MidUnsorted;
    File LongUnsorted;
    File ShortReversedSorted;
    File MidReversedSorted;
    File LongReversedSorted;
    File ShortHalfSorted;
    File MidHalfSorted;
    File LongHalfSorted;
    File ShortSorted;
    File MidSorted;
    File LongSorted;

    public void ShortUnsorted()
    {
        ShortUnsorted = new File(TestFileName[0]);
        try {
            if(!ShortUnsorted.exists())
                ShortUnsorted.createNewFile();
            pw = new PrintWriter(ShortUnsorted);
            for(int i = 0;i<100;i++)
                pw.print(random.nextInt(99)+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[0]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void MidUnsorted()
    {
        MidUnsorted = new File(TestFileName[1]);
        try {
            if(!MidUnsorted.exists())
                MidUnsorted.createNewFile();
            pw = new PrintWriter(MidUnsorted);
            for(int i = 0;i<10000;i++)
                pw.print(random.nextInt(9999)+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[1]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void LongUnsorted()
    {
        LongUnsorted = new File(TestFileName[2]);
        try {
            if(!LongUnsorted.exists())
                LongUnsorted.createNewFile();
            pw = new PrintWriter(LongUnsorted);
            for(int i = 0;i<1000000;i++)
                pw.print(random.nextInt(999999)+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[2]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void ShortReversedSorted()
    {
        ShortReversedSorted = new File(TestFileName[3]);
        try {
            if(!ShortReversedSorted.exists())
                ShortReversedSorted.createNewFile();
            pw = new PrintWriter(ShortReversedSorted);
            for(int i = 99;i>0;i--)
                pw.print(i+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[3]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void MidReversedSorted()
    {
        MidReversedSorted = new File(TestFileName[4]);
        try {
            if(!MidReversedSorted.exists())
                MidReversedSorted.createNewFile();
            pw = new PrintWriter(MidReversedSorted);
            for(int i = 9999;i>0;i--)
                pw.print(i+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[4]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void LongReversedSorted()
    {
        LongReversedSorted = new File(TestFileName[5]);
        try {
            if(!LongReversedSorted.exists())
                LongReversedSorted.createNewFile();
            pw = new PrintWriter(LongReversedSorted);
            for(int i = 999999;i>0;i--)
                pw.print(i+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[5]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void ShortHalfSorted()
    {
        ShortHalfSorted = new File(TestFileName[6]);
        try {
            if(!ShortHalfSorted.exists())
                ShortHalfSorted.createNewFile();
            pw = new PrintWriter(ShortHalfSorted);
            for(int i = 0;i<100;i++)
            {
                if(i>49)
                    pw.print(i + " ");
                else
                {
                    pw.print(random.nextInt(99) + " ");
                }
            }
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[6]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void MidHalfSorted()
    {
        MidHalfSorted = new File(TestFileName[7]);
        try {
            if(!MidHalfSorted.exists())
                MidHalfSorted.createNewFile();
            pw = new PrintWriter(MidHalfSorted);
            for(int i = 0;i<10000;i++)
            {
                if(i>4999)
                    pw.print(i + " ");
                else
                {
                    pw.print(random.nextInt(9999) + " ");
                }
            }
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[7]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void LongHalfSorted()
    {
        LongHalfSorted = new File(TestFileName[8]);
        try {
            if(!LongHalfSorted.exists())
                LongHalfSorted.createNewFile();
            pw = new PrintWriter(LongHalfSorted);
            for(int i = 0;i<1000000;i++)
            {
                if(i>499999)
                    pw.print(i + " ");
                else
                {
                    pw.print(random.nextInt(999999) + " ");
                }
            }
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[8]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void ShortSorted()
    {
        ShortSorted = new File(TestFileName[9]);
        try {
            if(!ShortSorted.exists())
                ShortSorted.createNewFile();
            pw = new PrintWriter(ShortSorted);
            for(int i = 0;i<100;i++)
                pw.print(i+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[9]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void MidSorted()
    {
        MidSorted = new File(TestFileName[10]);
        try {
            if(!MidSorted.exists())
                MidSorted.createNewFile();
            pw = new PrintWriter(MidSorted);
            for(int i = 0;i<10000;i++)
                pw.print(i+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[10]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    public void LongSorted()
    {
        LongSorted = new File(TestFileName[11]);
        try {
            if(!LongSorted.exists())
                LongSorted.createNewFile();
            pw = new PrintWriter(LongSorted);
            for(int i = 0;i<1000000;i++)
                pw.print(i+" ");
            pw.close();
            System.out.printf("File %s created successfully!\n",TestFileName[11]);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

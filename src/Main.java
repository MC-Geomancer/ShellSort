import java.io.IOException;

public class Main
{
    public static void main(String[] args)throws IOException
    {
        ManageFiles manageFiles = new ManageFiles();
        FileActions fileActions = new FileActions();
        TimeCounter timeCounter = new TimeCounter();
        TestFiles testFiles = new TestFiles();
        manageFiles.CreateNewFiles();
        for(int i = 0;i < 12 ;)
            for(int size = 100;size<=1000000;i++,size*=100) {
                fileActions.ReadFile(testFiles.TestFileName[i], size);
                timeCounter.setSortStart(i);
                ShellSort.ShellSort(fileActions.ArrayData, fileActions.ArrayData.length);
                timeCounter.setSortFinish(i);
                fileActions.WriteFile(testFiles.TestFileName[i]);
            }



       // manageFiles.DeleteFiles();
    }
    static class ManageFiles
    {
        TestFiles testFiles = new TestFiles();
        public void CreateNewFiles() {
            testFiles.ShortSorted();
            testFiles.MidSorted();
            testFiles.LongSorted();
            testFiles.ShortUnsorted();
            testFiles.MidUnsorted();
            testFiles.LongUnsorted();
            testFiles.ShortReversedSorted();
            testFiles.MidReversedSorted();
            testFiles.LongReversedSorted();
            testFiles.ShortHalfSorted();
            testFiles.MidHalfSorted();
            testFiles.LongHalfSorted();
        }
        public void DeleteFiles()
        {
            testFiles.ShortSorted.deleteOnExit();
            testFiles.MidSorted.delete();
            testFiles.LongSorted.delete();
            testFiles.ShortUnsorted.delete();
            testFiles.MidUnsorted.delete();
            testFiles.LongUnsorted.delete();
            testFiles.ShortReversedSorted.delete();
            testFiles.MidReversedSorted.delete();
            testFiles.LongReversedSorted.delete();
            testFiles.ShortHalfSorted.delete();
            testFiles.MidHalfSorted.delete();
            testFiles.LongHalfSorted.delete();


        }
    }
}


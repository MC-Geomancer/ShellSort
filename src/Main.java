import java.io.File;
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
        ResultsTable resultsTable = new ResultsTable();
        resultsTable.ResultTable(testFiles.TestFileName);
        for(int i = 0;i < 12 ;)
            for(int size = 100;size<=1000000;i++,size*=100) {
                fileActions.ReadFile(testFiles.TestFileName[i], size);
                timeCounter.setSortStart(i);
                ShellSort.ShellSort(fileActions.ArrayData, fileActions.ArrayData.length);
                timeCounter.setSortFinish(i);
                fileActions.WriteFile(testFiles.TestFileName[i],"ShellSort");
            }
        resultsTable.ShowResult(timeCounter.SortResult,"ShellSort");

        for(int i = 0;i < 12 ;)
            for(int size = 100;size<=1000000;i++,size*=100) {
                fileActions.ReadFile(testFiles.TestFileName[i], size);
                timeCounter.setSortStart(i);
                SortsForCompare.quickSort(fileActions.ArrayData,0,size-1);
                timeCounter.setSortFinish(i);
                fileActions.WriteFile(testFiles.TestFileName[i],"QuickSort");
            }
        resultsTable.ShowResult(timeCounter.SortResult,"QuickSort");
        for(int i = 0;i < 12 ;)
            for(int size = 100;size<=1000000;i++,size*=100) {
                fileActions.ReadFile(testFiles.TestFileName[i], size);
                timeCounter.setSortStart(i);
                SortsForCompare.InsertionSort(fileActions.ArrayData);
                timeCounter.setSortFinish(i);
                fileActions.WriteFile(testFiles.TestFileName[i],"InsertionSort");
            }
        resultsTable.ShowResult(timeCounter.SortResult,"Insertion");

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




public class ResultsTable
{
    public void ResultTable(String[] TestFileName)
    {
        System.out.printf("\n\t\t\t%s\t%s\t   %s\t   %s\t%s\t%s\t  %s\t  %s\t  %s\t%s\t  %s\t  %s\n",TestFileName);
    }
    public void ShowResult(long[] SortResult,String TypeOfSorting)
    {
        float[] FloatSortResult = new float[12];
        for(int i = 0;i<12;i++)
            FloatSortResult[i] = (float)SortResult[i]/1000000000;
        System.out.printf(TypeOfSorting+"\t\t%f\t\t\t%f\t\t%f\t\t\t\t%f\t\t\t\t%f\t\t\t\t%f\t\t\t\t%f\t\t\t\t%f\t\t\t %f\t\t\t\t%f\t\t%f\t\t%f\n",FloatSortResult[0],FloatSortResult[1],FloatSortResult[2],FloatSortResult[3],FloatSortResult[4],FloatSortResult[5],FloatSortResult[6],FloatSortResult[7],FloatSortResult[8],FloatSortResult[9],FloatSortResult[10],FloatSortResult[11]);
    }
}

public class TimeCounter
{
    long[] SortStart = new long[12];;
    long[] SortFinish = new long[12];;
    long[] SortResult = new long[12];

    public void setSortStart(int i)
    {
        SortStart[i] = System.nanoTime();
    }

    public void setSortFinish(int i)
    {

        SortFinish[i] = System.nanoTime();
        SortResult[i] = SortFinish[i] - SortStart[i];
    }
}

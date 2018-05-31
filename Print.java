public class Print
{
    private String textToPrint;
    private int delay;
    
    public Print(int time, String text)
    {
       delay = time;
       textToPrint = text;
    }
    
    public Print()
    {
        delay = 0;
        textToPrint = "";
    }
    
    public void printText() throws InterruptedException
    {
        if(delay >= 0)
        { 
            Thread.sleep(delay);
            System.out.println(textToPrint);
        }
        else
        {
            throw new InterruptedException("Please use a valid amount of time (Positive number)");
        }
    }
    
    public void printLetterByLetter() throws InterruptedException
    {
        String printing = "";
        if(delay >= 0)
        { 
            for(int i = 0; i < textToPrint.length(); i++)
            {
                printing = textToPrint.substring(i, i + 1);
                System.out.print(printing);
                Thread.sleep(delay);
            }
        }
        else
        {
            throw new InterruptedException("Please use a valid amount of time (Positive number)");
        }
    }
}

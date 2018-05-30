

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPrint
{
    public void testLetterByLetter() throws InterruptedException
    {
        Print p = new Print(1000, "Hi my name is Jonathan");
        p.printLetterByLetter();
    }
}

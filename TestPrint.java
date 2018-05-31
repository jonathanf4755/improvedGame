

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPrint
{
    public void testLetterByLetter() throws InterruptedException
    {
        String enemyName = "Powerful Beast";
        String descOfFoe = "He is a powerful beast";
        Print p = new Print(100, "Hi my name is Jonathan\n");
        p.printLetterByLetter();
        p = new Print(100, "You encounter a\n" + enemyName + "\n" + descOfFoe + "\n");
        p.printLetterByLetter();
    }
}

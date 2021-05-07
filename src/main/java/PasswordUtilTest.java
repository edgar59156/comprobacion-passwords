import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters(){

    }

@Test
    public void strong_when_has_letters_numbers_and_symbols()
{
    assertEquals(STRONG,PasswordUtil.assesPassword("abcd123!"));
}

}
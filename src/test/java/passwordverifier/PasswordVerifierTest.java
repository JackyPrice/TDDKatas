package passwordverifier;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordVerifierTest {

    private PasswordVerifier passwordVerifier;

    @Before
    public void setUp(){
        passwordVerifier = new PasswordVerifier();
    }

    @Test
    public void whenPasswordLengthIsLessThanEight_thenReturnFalse(){
        boolean actual = passwordVerifier.verify("test");
        assertFalse(actual);
    }

    @Test
    public void whenPasswordIsNull_thenReturnFalse(){
        boolean actual = passwordVerifier.verify(null);
        assertFalse(actual);
    }

    @Test
    public void whenPasswordIsEmpty_thenReturnFalse(){
        boolean actual = passwordVerifier.verify("");
        assertFalse(actual);
    }

    @Test
    public void whenPasswordContainsOneOrMoreUpperCaseCharactersAndPasswordLengthIsGreaterThanEight_thenReturnTrue(){
        boolean actual = passwordVerifier.verify("passWord1");
        assertTrue(actual);
    }
}

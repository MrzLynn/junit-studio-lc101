package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsNotPresent (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("  "));
    }

    @Test
    public void semicolonPresent(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(";"));
    }

    @Test
    public void hasOneLeftBracket (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void hasOneRightBracket (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void hasComma (){
        assertFalse(BalancedBrackets.hasBalancedBrackets(","));
    }
    @Test
    public void hasOneLeftParenthesis (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("("));
    }
    @Test
    public void hasOneRightParenthesis (){
        assertFalse(BalancedBrackets.hasBalancedBrackets(")"));
    }
    @Test
    public void hasOneBothParenthesis (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("()"));
    }
    @Test
    public void hasOneLeftCurlyBoy (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{"));
    }
    @Test
    public void hasOneRightCurlyBoy (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("}"));
    }
    @Test
    public void hasOneBothCurlyBoys (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }
}

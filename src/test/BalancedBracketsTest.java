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
    public void bracketsPresentReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsIncludedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsBeforeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void bracketsNotPresent (){
        assertTrue(BalancedBrackets.hasBalancedBrackets("  "));
    }
    @Test
    public void twoSetsOfBrackets (){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void hasBackwardBrackets (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void hasWrongOrderedBrackets (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
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

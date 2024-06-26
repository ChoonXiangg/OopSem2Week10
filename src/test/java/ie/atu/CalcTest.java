package ie.atu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calculator newCalc;
    @BeforeEach
    void beforeEach(){
        newCalc=new Calculator();
    }
    @Test
    void testAdd(){
        assertEquals(10,newCalc.add(4,6));
    }
    @Test
    void testSubtract(){
        assertEquals(1,newCalc.subtract(2,1));
    }
    @Test
    void testDivide() {
        assertEquals(2,newCalc.divide(2,1));
    }
    @Test
    void testMultiply(){
        assertEquals(2,newCalc.multiply(1,2));
    }
}
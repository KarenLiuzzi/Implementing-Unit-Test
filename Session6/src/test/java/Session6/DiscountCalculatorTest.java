package Session6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DiscountCalculatorTest {

    // Testing platinum case
    @Test
    public void testPlatinum(){
        DiscountCalculator calculator = new DiscountCalculator();
        double result =  calculator.calculateDiscount(100,DiscountCalculator.MembershipType.PLATINUM);
        assertEquals(result,80);
    }


    // Testing gold with discount
    @Test
    public void testGold(){
        DiscountCalculator calculator = new DiscountCalculator();
        double result =  calculator.calculateDiscount(80,DiscountCalculator.MembershipType.GOLD);
        assertEquals(result,72);
    }


    // testing gold no discount
    @Test
    public void testGoldNoDiscount(){
        DiscountCalculator calculator = new DiscountCalculator();
        double result =  calculator.calculateDiscount(40,DiscountCalculator.MembershipType.GOLD);
        assertEquals(result,40);
    }




    // testing silver with discount
    @Test
    public void testSilver(){
        DiscountCalculator calculator = new DiscountCalculator();
        double result =  calculator.calculateDiscount(150,DiscountCalculator.MembershipType.SILVER);
        assertEquals(result,142.5);
    }
    // testing silver no discount
    @Test
    public void testSilverNoDiscount(){
        DiscountCalculator calculator = new DiscountCalculator();
        double result =  calculator.calculateDiscount(99,DiscountCalculator.MembershipType.SILVER);
        assertEquals(result,99);
    }


    // test no membership
    @Test
    public void testNone(){
        DiscountCalculator calculator = new DiscountCalculator();
        double result =  calculator.calculateDiscount(100,DiscountCalculator.MembershipType.NONE);
        assertEquals(result, 100);
    }
}

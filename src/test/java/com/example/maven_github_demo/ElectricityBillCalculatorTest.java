
package com.example.maven_github_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectricityBillCalculatorTest {

    ElectricityBillCalculator obj =
            new ElectricityBillCalculator();

    @Test
    public void testFirstSlab() {
        assertEquals(125.0, obj.calculateBill(50), 0.01);
    }

    @Test
    public void testSecondSlab() {
        assertEquals(325.0, obj.calculateBill(150), 0.01);
    }

    @Test
    public void testThirdSlab() {
        assertEquals(850.0, obj.calculateBill(300), 0.01);
    }

    @Test
    public void testFourthSlab() {
        assertEquals(2250.0, obj.calculateBill(600), 0.01);
    }

    @Test
    public void testBoundary100() {
        assertEquals(200.0, obj.calculateBill(100), 0.01);
    }

    @Test
    public void testBoundary200() {
        assertEquals(450.0, obj.calculateBill(200), 0.01);
    }

    @Test
    public void testBoundary500() {
        assertEquals(1650.0, obj.calculateBill(500), 0.01);
    }

    @Test
    public void testMultipleSlabs() {
        assertEquals(650.0, obj.calculateBill(250), 0.01);
    }

    @Test
    public void testZeroUnits() {
        assertEquals(50.0, obj.calculateBill(0), 0.01);
    }

    @Test
    public void testNegativeUnits() {
        assertThrows(IllegalArgumentException.class,
                () -> obj.calculateBill(-10));
    }
}

package com.fordgraddlesample.springBoot.custom.annotation.fordtest;

import com.fordtest.Calculator;
import com.fordtest.Service.CalculatorService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    Calculator calculator;
    CalculatorService calculatorService = Mockito.mock(CalculatorService.class);

    @Before
    public void setUp(){
        calculator=new Calculator(calculatorService);
    }

    @Test
    public void testAdd(){
        when(calculatorService.add(2,3)).thenReturn(5);
                
        assertEquals(10, calculator.performSomeOperation(2,3));
        verify(calculatorService).add(2,3);
    }

}

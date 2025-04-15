package com.example.jenkins_pipeline_demo;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{   
    @Test
    public void testSuma() {
    	assertEquals(5, App.sumar(2, 3));
    }
}

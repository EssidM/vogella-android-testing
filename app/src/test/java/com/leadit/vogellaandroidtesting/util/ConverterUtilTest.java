package com.leadit.vogellaandroidtesting.util;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * ConverterUtil unit test class
 * tests conversion methods
 *
 * @author Mohamed Essid on 07/02/2017.
 */

public class ConverterUtilTest {

    /**
     * tests {@link ConverterUtil#convertFahrenheitToCelsius(float)} method*
     */
    @Test
    public void testConversionFahrenheitToCelsius() {

        float actual = ConverterUtil.convertFahrenheitToCelsius(212);
        float expected = 100;

        assertEquals("Conversion from celsius to fahrenheit failed", expected,
                actual, 0.001);
    }

    /**
     * tests {@link ConverterUtil#convertCelsiusToFahrenheit(float)} (float)} method
     **/
    @Test
    public void testConvertCelsiusToFahrenheit() {

        float actual = ConverterUtil.convertCelsiusToFahrenheit(100);
        float expected = 212;

        assertEquals("Conversion Celsius to Fahrenheit failed" , expected, actual, 0.001);
    }
}

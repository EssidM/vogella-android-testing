# Android Sample Application for Temperature Conversion

This a sample application from [Vogella](http://www.vogella.com/tutorials/Android/article.html#tutorialtemperature) used for Android <b>Unit and Instrumental Tests</b> following this <b>Android Testing </b> [tutorial](http://www.vogella.com/tutorials/AndroidTesting/article.html#androidtesting)

<ul>
<li><b>Base branch</b> is the basic application (without test).</li>
<li><b>Master branch</b> should contain full tested app (without test).</li>
</ul>
Note: for each section on this tutorial we will create a branch apart.

# Android Unit Test Exercise

Starting from base application , this tutorial is an exercise of android unit testing that will tests ConverterUtil class
by testing conversion method

We will create a class app/src/test/util/<b>convertFahrenheitToCelsius</b> that contains 2 methods:
<ul>
<li><b>testConvertFahrenheitToCelsius</b>: tests conversion from Fahrenheit to Celsuis</li>
<li><b>testConvertCelsiusToFahrenheit</b>: tests conversion from Celsuis to Fahrenheit</li>

</ul>

this is what the class should look like:
```java
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
```

Now just run this class. Done :)

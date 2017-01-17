/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        System.out.println("isChaineValide");
        String str = "test";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isChaineValide(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of isChaineValideOK method, of class StringUtils.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIsChaineValideKO() {
        System.out.println("isChaineValide");
        String str = "a";
        StringUtils instance = new StringUtils();
        /*try
        {
            instance.isChaineValide(str);
            fail("Excepted an illegal argument");
        }
        catch (IllegalArgumentException ex)
        {
            assertThat(ex.getMessage(), "Il faut au moins deux caractères");
        }*/
        
        instance.isChaineValide(str);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        String str = "inverse";
        StringUtils instance = new StringUtils();
        String expResult = "esrevni";
        String result = instance.inverse(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverseKO() {
        System.out.println("inverse");
        String str = "inverse";
        StringUtils instance = new StringUtils();
        String expResult = "pasinverse";
        String result = instance.inverse(str);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeKO() {
        System.out.println("isPalindrome");
        String str = "coucou";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        System.out.println("compterOccurences");
        String str = "test";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = new TreeMap<>();
        expResult.put("e",1);
        expResult.put("s",1);
        expResult.put("t",2);
        Map<String, Integer> result = instance.compterOccurences(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurencesKO() {
        System.out.println("compterOccurencesKO");
        String str = "test";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = new TreeMap<>();
        expResult.put("e",1);
        expResult.put("s",2);
        expResult.put("t",2);

        Map<String, Integer> result = instance.compterOccurences(str);
        assertNotSame(expResult, result);
    }
    
}

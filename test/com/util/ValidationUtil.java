/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.util;
import java.util.regex.Pattern;

/**
 *
 * @author santoshi paudel
 * LMU ID: 23048656
 */
public class ValidationUtil {
    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern SERIALNUMBER_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern MODELlNUMBER_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern BRAND_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern PRICE_PATTERN = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
    private static final Pattern WARRANTY_PATTERN = Pattern.compile("^\\d+\\s*(years?|months?)$");
    
    //Validates if a string is null or empty.
     public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
     }
     //Validates if a integer is null or empty.
     public static boolean isNullOrEmpty(Integer value) {
        return value == null;
     }
     //Validates if the name contains only alphabets and spaces.
     public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }
     
     // Validates if the serial number is exactly 4 digits
     
     

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.watchapp.util;
import java.util.regex.Pattern;

/**
 *
 * @author santoshi paudel
 * LMU ID: 23048656
 */
public class ValidationUtil {
    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern SERIALNUMBER_PATTERN = Pattern.compile("^\\d{1,2}$");
    private static final Pattern MODELNUMBER_PATTERN = Pattern.compile("^\\d{3,}$");
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
     public static boolean isValidName(String Name) {
        return !isNullOrEmpty(Name) && NAME_PATTERN.matcher(Name).matches();
    }
     
     // Validates if the serial number is exactly 1 or 2  digits
     public static boolean isValidSerialNumber(String SerialNumber) {
        String serialNumber= String.valueOf(SerialNumber);
        return !isNullOrEmpty(serialNumber) && SERIALNUMBER_PATTERN.matcher(serialNumber).matches();
    }

     // validates if the model number is 3 or more digits 
    public static boolean isValidModelNumber(String ModelNumber) {
        String modelNumber= String.valueOf(ModelNumber);
        return !isNullOrEmpty(modelNumber) && MODELNUMBER_PATTERN.matcher(modelNumber).matches();
    }
    
    //Validates if the brand contains only alphabets and spaces.
     public static boolean isValidBrand(String Brand) {
        return !isNullOrEmpty(Brand) && BRAND_PATTERN.matcher(Brand).matches();
    }
     // validates the price contains only the numbers
     public static boolean isValidPrice(String Price) {
        String price= String.valueOf(Price);
        return !isNullOrEmpty(price) && PRICE_PATTERN.matcher(price).matches();
    }

     
     // validates warranty cannot be empty
     public static boolean isValidWrranty(String Warranty) {
        return !isNullOrEmpty(Warranty);
    }
      public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
    
}

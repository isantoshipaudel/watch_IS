/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.watchapp.controller.algorithm;
import com.watchapp.model.WatchIS;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santoshi paudel
 * LMU ID: 23048656
 */
public class BinarySearch {
    /**
     * Validates the list to ensure it is not null or empty.
     *
     * @param watchIS the list to validate
     */
    private void validateList(List<WatchIS> watchIS) {
        if (watchIS == null || watchIS.isEmpty()) {
            throw new IllegalArgumentException("Watch list cannot be null or empty.");
        }
    }

     public WatchIS searchByName(List<WatchIS> watchIS, String name) {
        validateList(watchIS);
        int low = 0;
        int high = watchIS.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // Calculate the midpoint
            String midName = watchIS.get(mid).getName();

            int comparison = midName.compareToIgnoreCase(name); // Use name for comparison

            if (comparison == 0) {
                // Found the watch with the matching name
                return watchIS.get(mid);
            } else if (comparison < 0) {
                // Name is greater, search in the higher half
                low = mid + 1;
            } else {
                // Name is smaller, search in the lower half
                high = mid - 1;
            }
        }

        // Name not found in the list
        return null;
    }
}


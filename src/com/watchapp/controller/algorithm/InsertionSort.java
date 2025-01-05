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
 * @author santoshi paudel LMU ID: 23048656
 */
public class InsertionSort {

    /**
     * Sorts a list of WatchIS objects by ModelNumber using insertion sort.
     *
     * @param watchIS the list of WatchIS objects to sort
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list of WatchIS objects
     */
    public List<WatchIS> insertionsortByModelNumber(List<WatchIS> watchIS, boolean isDesc) {
        if (watchIS == null || watchIS.isEmpty()) {
            throw new IllegalArgumentException("Watch list cannot be null or empty.");
        }

        for (int i = 1; i < watchIS.size(); i++) {
            WatchIS Key = watchIS.get(i);
            int j = i - 1;

            // Compare the current ModelNumber with elements in the sorted portion
            while (j >= 0 && shouldInsert(Key.getModelNumber(), watchIS.get(j).getModelNumber(), isDesc)) {
                watchIS.set(j + 1, watchIS.get(j)); // Shift element to the right
                j--;
            }

            // Place the current WatchIS in the correct position
            watchIS.set(j + 1, Key);
        }

        return watchIS;
    }

    /**
     * Determines whether the current element should be inserted before the
     * compared element.
     *
     * @param currentValue the ModelNumber of the current element
     * @param comparedValue the ModelNumber of the compared element
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current element should be inserted before the
     * compared element
     */
    private boolean shouldInsert(int currentValue, int comparedValue, boolean isDesc) {
        return isDesc ? currentValue > comparedValue : currentValue < comparedValue;
    }

}

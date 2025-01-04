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
public class MergeSort {

    /**
     * Sorts a list of WatchIS objects by SerialNumber in ascending or
     * descending order.
     *
     * @param watchIS the list of WatchIS objects to sort
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list of WatchIS objects
     */
    public List<WatchIS> sortBySerialNumber(List<WatchIS> watchIS, boolean isDesc) {
        if (watchIS == null || watchIS.isEmpty()) {
            throw new IllegalArgumentException("Watch list cannot be null or empty.");
        }

        if (watchIS == null || watchIS.size() <= 1) {
            return watchIS; // Base case: already sorted or empty list
        }

        // Split the list into two halves
        int mid = watchIS.size() / 2;
        List<WatchIS> first = new ArrayList<>(watchIS.subList(0, mid));
        List<WatchIS> second = new ArrayList<>(watchIS.subList(mid, watchIS.size()));

        // Recursively sort both halves
        first = sortBySerialNumber(first, isDesc);
        second = sortBySerialNumber(second, isDesc);

        // Merge the sorted halves using counters
        return merge(first, second, isDesc);
    }

    /**
     * Merges two sorted lists into a single sorted list using fcounter,
     * scounter, and acounter.
     *
     * @param first the first sorted list
     * @param second the second sorted list
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the merged sorted list
     */
    private List<WatchIS> merge(List<WatchIS> first, List<WatchIS> second, boolean isDesc) {
        List<WatchIS> merged = new ArrayList<>();
        int fcounter = 0; // Counter for the first list
        int scounter = 0; // Counter for the second list
        int acounter = 0; // Array counter 

        // Compare elements and merge based on counters
        while (fcounter < first.size() && scounter < second.size()) {
            if (shouldMerge(first.get(fcounter).getSerialNumber(), second.get(scounter).getSerialNumber(), isDesc)) {
                merged.add(first.get(fcounter));
                fcounter++;
            } else {
                merged.add(second.get(scounter));
                scounter++;
            }
            acounter++; // Increment the aggregate counter
        }

        // Add remaining elements from the first list
        while (fcounter < first.size()) {
            merged.add(first.get(fcounter));
            fcounter++;
            acounter++;
        }

        // Add remaining elements from the second list
        while (scounter < second.size()) {
            merged.add(second.get(scounter));
            scounter++;
            acounter++;
        }

        System.out.println("Merged " + acounter + " elements.");
        return merged;
    }

    /**
     * Determines the merging order based on sort direction.
     */
    private boolean shouldMerge(int firstValue, int secondValue, boolean isDesc) {
        return isDesc ? firstValue > secondValue : firstValue < secondValue;
    }
}

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
public class SelectionSort {

    List<WatchIS> watchSortList;

    public SelectionSort() {
        watchSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of WatchIS objects by their name in descending or ascending
     * order.
     *
     * @param watchIS the list of WatchIS objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list of WatchIS objects
     */
    public List<WatchIS> sortByName(List<WatchIS> watchIS, boolean isDesc) {
        validateList(watchIS);

        this.watchSortList.clear();
        this.watchSortList.addAll(watchIS);

        for (int i = 0; i < watchSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByName(watchSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(watchSortList, i, extremumIndex);
            }
        }
        return watchSortList;
    }

    /**
     * Sorts a list of WatchIS objects by their SerialNumber in descending or
     * ascending order.
     *
     * @param watchIS the list of WatchIS objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list of WatchIS objects
     */
    public List<WatchIS> sortByPrice(List<WatchIS> watchIS, boolean isDesc) {
        validateList(watchIS);

        this.watchSortList.clear();
        this.watchSortList.addAll(watchIS);

        for (int i = 0; i < watchSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByPrice(watchSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(watchSortList, i, extremumIndex);
            }
        }
        return watchSortList;
    }

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

    /**
     * Finds the index of the extremum value (minimum or maximum) by name from
     * the start index.
     */
    private int findExtremumIndexByName(List<WatchIS> watchSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < watchSortList.size(); j++) {
            if (shouldSwap(watchSortList.get(j).getName(), watchSortList.get(extremumIndex).getName(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }
    // Method to find the index of the extremum value by price

    private int findExtremumIndexByPrice(List<WatchIS> watchSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < watchSortList.size(); j++) {
            // Use shouldSwap with numeric values instead of boolean
            if (shouldSwap(watchSortList.get(j).getPrice(), watchSortList.get(extremumIndex).getPrice(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

// Modified shouldSwap method to work with numeric values
    private boolean shouldSwap(double current, double extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     */
    private boolean shouldSwap(String current, String extremum, boolean isDesc) {
        return isDesc ? current.compareTo(extremum) > 0 : current.compareTo(extremum) < 0;
    }

    /**
     * Swaps two elements in the list.
     */
    private void swap(List<WatchIS> watchSortList, int i, int j) {
        WatchIS temp = watchSortList.get(i);
        watchSortList.set(i, watchSortList.get(j));
        watchSortList.set(j, temp);
    }
}

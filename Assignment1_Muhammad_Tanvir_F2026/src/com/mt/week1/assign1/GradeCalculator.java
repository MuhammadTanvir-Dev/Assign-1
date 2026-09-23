package com.mt.week1.assign1;

/**
 * Author: Muhammad Tanvir
 * Date: 09/23/2026
 * Description: Takes a numerical course score input and uses conditional flow statements to calculate and output a letter grade (A, B, C, D, or F).
 */

public class GradeCalculator {
    public char calculateGrade(double score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }
}

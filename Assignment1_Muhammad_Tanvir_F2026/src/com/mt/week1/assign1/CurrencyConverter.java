package com.mt.week1.assign1;

/**
 * Author: Muhammad Tanvir
 * Date: 09/23/2026
 * Description: Uses today's live Google Finance market exchange rate to convert a scanned Canadian Dollar (CAD) input amount into United States Dollars (USD).
 */

public class CurrencyConverter {
    private final double exchangeRate = 0.7385;

    public double convertCadToUsd(double cadAmount) {
        return cadAmount * exchangeRate;
    }
}

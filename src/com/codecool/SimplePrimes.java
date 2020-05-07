package com.codecool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimplePrimes {

    private List<Long> primesUpToNumber;

    public SimplePrimes() {
        this.primesUpToNumber = new ArrayList<>();
    }

    private boolean isPrime(long number) {
       if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void calculatePrimes(long n) {
        this.primesUpToNumber.clear();


        for (long i = 2; i <= n; i++) {
            if (this.isPrime(i)) {
                this.primesUpToNumber.add(i);
            }
        }
    }

    public List<Long> getPrimesUpToNumber(long n) throws IllegalArgumentException {
        if (n <= 1) {
            throw new IllegalArgumentException();
        }
        calculatePrimes(n);
        return this.primesUpToNumber;
    }


}

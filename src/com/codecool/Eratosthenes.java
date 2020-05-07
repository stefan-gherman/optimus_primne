package com.codecool;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Eratosthenes {

    private Map<Long, Boolean> primesUpToNumber;

    public Eratosthenes() {
        this.primesUpToNumber = new LinkedHashMap<>();
    }

    private void calculatePrimes(long n) {
        this.primesUpToNumber.clear();
        for (long i = 2; i < n; i++) {
            this.primesUpToNumber.put(i, true);
        }

        for (long i = 2; i < Math.sqrt(n); i++) {
            if (this.primesUpToNumber.get(i)) {
                for (long j = i * i; j < n; j += i) {
                    this.primesUpToNumber.put(j, false);
                }
            }
        }


    }

    public List<Long> getPrimesUpToNumber(long n) throws IllegalArgumentException {
        if (n <= 1) {
            throw new IllegalArgumentException();
        }

        this.calculatePrimes(n);
        List<Long> resultList = new ArrayList<>();

        this.primesUpToNumber.forEach((key, value) -> {
            if (value) {
                resultList.add(key);
            }
        });
        return resultList;
    }
}

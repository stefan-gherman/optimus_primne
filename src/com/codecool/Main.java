package com.codecool;

public class Main {

    public static void main(String[] args) {
        SimplePrimes simplePrimes = new SimplePrimes();
        Eratosthenes eratosthenes  = new Eratosthenes();
        //System.out.println(simplePrimes.getPrimesUpToNumber(300L));
        System.out.println(eratosthenes.getPrimesUpToNumber(21L));
    }
}

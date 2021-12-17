package com.example.quote;

public class Quote {
    private String quote;

    public Quote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quote='" + quote + '\'' +
                '}';
    }
}

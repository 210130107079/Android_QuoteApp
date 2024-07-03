package com.example.quoteapp;
public class QuotesList
{
    private final String quote;

    private final String writer;

    public QuotesList(String paramString1, String paramString2) {
        this.quote = paramString1;
        this.writer = paramString2;
    }

    public String getQuote() {
        return this.quote;
    }

    public String getWriter() {
        return this.writer;
    }
}


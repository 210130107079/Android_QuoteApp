package com.example.quoteapp.categories;

public class CategoriesList
{
    private final int categoryImg;
    private final String categoryName;
    public CategoriesList(String categoryName, int categoryImg)
    {
        this.categoryName = categoryName;
        this.categoryImg = categoryImg;
    }

    public int getCategoryImg()
    {
        return this.categoryImg;
    }

    public String getCategoryName()
    {
        return this.categoryName;
    }
}

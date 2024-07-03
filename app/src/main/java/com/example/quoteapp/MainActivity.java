package com.example.quoteapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quoteapp.categories.CategoriesAdapter;
import com.example.quoteapp.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private final List<CategoriesList> categoriesLists = new ArrayList<CategoriesList>();

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView  = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        CategoriesList loveCategory = new CategoriesList("Love", R.drawable.love_cat);
        this.categoriesLists.add(loveCategory);

        CategoriesList motivationcategory = new CategoriesList("Motivation", R.drawable.motivation_cat);
        this.categoriesLists.add(motivationcategory);

        CategoriesList englishcategory = new CategoriesList("English", R.drawable.english_cat);
        this.categoriesLists.add(englishcategory);

        CategoriesList successcategory = new CategoriesList("Success", R.drawable.success_cat);
        this.categoriesLists.add(successcategory);

        CategoriesList lifecategory = new CategoriesList("Life", R.drawable.life_cat);
        this.categoriesLists.add(lifecategory);

        CategoriesList brokencategory = new CategoriesList("Broken",R.drawable.broken_cat);
        this.categoriesLists.add(brokencategory);

        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists , MainActivity.this));
    }
}
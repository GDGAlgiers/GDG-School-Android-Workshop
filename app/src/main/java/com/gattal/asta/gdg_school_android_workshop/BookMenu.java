package com.gattal.asta.gdg_school_android_workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BookMenu extends AppCompatActivity {

    private RecyclerView mBookMenu;
    private BookMenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_menu);

        mBookMenu = findViewById(R.id.BookMenu);

    }

    @Override
    protected void onStart() {
        super.onStart();

        List<Ebook> eBooks = new ArrayList<>();
        eBooks.add(new Ebook(getString(R.string.ebook1Title),getString(R.string.ebook1Abstract),new Author(getString(R.string.ebook1AuthorName),getString(R.string.ebook1AuthorPic),getString(R.string.ebook1AuthorDescription)),getString(R.string.ebook1Cover),"an-occurrence-at-owl-creek-bridge.pdf"));
        eBooks.add(new Ebook(getString(R.string.ebook2Title),getString(R.string.ebook2Abstract),new Author(getString(R.string.ebook2AuthorName),getString(R.string.ebook2AuthorPic),getString(R.string.ebook2AuthorDescription)),getString(R.string.ebook2Cover),"james-locker-the-duality-of-fate.pdf"));
        eBooks.add(new Ebook(getString(R.string.ebook3Title),getString(R.string.ebook3Abstract),new Author(getString(R.string.ebook3AuthorName),getString(R.string.ebook3AuthorPic),getString(R.string.ebook3AuthorDescription)),getString(R.string.ebook3Cover),"the-dentist.pdf"));
        eBooks.add(new Ebook(getString(R.string.ebook4Title),getString(R.string.ebook4Abstract),new Author(getString(R.string.ebook4AuthorName),getString(R.string.ebook4AuthorPic),getString(R.string.ebook4AuthorDescription)),getString(R.string.ebook4Cover),"desperate-choices.pdf"));
        eBooks.add(new Ebook(getString(R.string.ebook5Title),getString(R.string.ebook5Abstract),new Author(getString(R.string.ebook5AuthorName),getString(R.string.ebook5AuthorPic),getString(R.string.ebook5AuthorDescription)),getString(R.string.ebook5Cover),"after-the-facts-an-after-coffman-mystery.pdf"));
        //EBooksManager.populateList(eBooks);

        MainActivity.ebooks=eBooks;

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mBookMenu.setLayoutManager(layoutManager);
        mBookMenu.setHasFixedSize(true);
        mAdapter = new BookMenuAdapter(eBooks);
        mBookMenu.setAdapter(mAdapter);



    }
}

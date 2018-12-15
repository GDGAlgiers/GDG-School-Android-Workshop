package com.gattal.asta.gdg_school_android_workshop;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ImageView mCover;
    private ImageView mAuthorPic;
    private TextView mTitle;
    private TextView mAbstract;
    private TextView mAuthorName;
    private TextView mAuthorDescription;

    // the attribute that we use to manipulate the button
    private Button mReadEBook;
    public static List<Ebook> ebooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCover = findViewById(R.id.cover);
        mAbstract = findViewById(R.id.abstrac);
        mTitle = findViewById(R.id.title);
        mAuthorName = findViewById(R.id.authorName);
        mAuthorDescription = findViewById(R.id.authorDescription);
        mAuthorPic = findViewById(R.id.authorPicture);

        //the link between the attribute and the button in xml
        mReadEBook = findViewById(R.id.button);


        // Adding the arrow of go back to the activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = getIntent();
        final int index = intent.getIntExtra("index",-1);

        mTitle.setText(ebooks.get(index).getmTitle());
        mAbstract.setText(ebooks.get(index).getmAbstract());
        mCover.setImageResource(getResources().getIdentifier(ebooks.get(index).getmCover(), "drawable", getPackageName()));
        mAuthorName.setText(ebooks.get(index).getmAuthor().getmName());
        mAuthorDescription.setText(ebooks.get(index).getmAuthor().getmDescription());
        mAuthorPic.setImageResource(getResources().getIdentifier(ebooks.get(index).getmAuthor().getmPicture(), "drawable", getPackageName()));


        // setting what should the button do when we click on it
        mReadEBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // the method is declared down there in the code
                readBook(ebooks.get(index).getmPdf());
            }
        });
    }


    private void readBook(String filename){
        //TODO allow the user to read the ebook


        //TODO the ebook should be in the Downloads file in Your phone
        //declare a file using the path of a pdf file that should exist in the Downloads file in your phone
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) +"/"+ filename);

        //setting the implicit intent with an action
        Intent target = new Intent(Intent.ACTION_VIEW);
        //setting the data type that we aim to open
        target.setDataAndType(Uri.fromFile(file),"application/pdf");
        //setting the flag that we should use
        target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

        // create a chooser and define what the intent should do (the nature of the signal)
        Intent intent = Intent.createChooser(target, "Open File");
        try {
            // sending the data and asking open the pdf in a pdf reader
            startActivity(intent);
        } catch (ActivityNotFoundException e) {

        }
    }


    // all this code is added to set the back arrow in the activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}

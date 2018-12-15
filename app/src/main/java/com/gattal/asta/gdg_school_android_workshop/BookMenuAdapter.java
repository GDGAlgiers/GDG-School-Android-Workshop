package com.gattal.asta.gdg_school_android_workshop;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class BookMenuAdapter extends RecyclerView.Adapter <BookMenuAdapter.BookMenuViewHolder> {

    private List<Ebook> mEbook;

    public void setmEbook(List<Ebook> mEbook) {
        this.mEbook = mEbook;
    }

    public List<Ebook> getmEbook() {
        return mEbook;
    }

    public BookMenuAdapter(List<Ebook> mEbook) {
        this.mEbook = mEbook;
    }

    public class BookMenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView mCover;
        private TextView mTitle;
        private TextView mAbstract;

        public BookMenuViewHolder(@NonNull View itemView) {
            super(itemView);

            mCover = itemView.findViewById(R.id.ebook_cover);
            mTitle = itemView.findViewById(R.id.ebook_title);
            mAbstract = itemView.findViewById(R.id.ebook_abstrac);

            itemView.setOnClickListener(this);
        }

        void bind (Ebook eBook){

            mTitle.setText(eBook.getmTitle());
            //mAbstract.setText(eBook.getmAbstract());

            mCover.setImageResource(this.itemView.getResources().getIdentifier(eBook.getmCover(), "drawable", this.itemView.getContext().getPackageName()));
        }

        @Override
        public void onClick(View view) {

            int index = getAdapterPosition();
            Intent mIntent = new Intent(view.getContext(),MainActivity.class);
            mIntent.putExtra("index",index);
            view.getContext().startActivity(mIntent);

        }
    }

    @NonNull
    @Override
    public BookMenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.recycler_view_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        View v = inflater.inflate(layoutIdForListItem,viewGroup,false);

        return new BookMenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookMenuViewHolder bookMenuViewHolder, int i) {

        bookMenuViewHolder.bind(mEbook.get(i));

    }

    @Override
    public int getItemCount() {
        return mEbook.size();
    }
}

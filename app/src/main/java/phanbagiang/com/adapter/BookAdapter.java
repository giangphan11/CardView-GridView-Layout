package phanbagiang.com.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import phanbagiang.com.cardviewgridlayout.R;
import phanbagiang.com.model.Book;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.myViewHolder> {
    Context context;
    ArrayList<Book>dsBook;

    public BookAdapter(Context context, ArrayList<Book> dsBook) {
        this.context = context;
        this.dsBook = dsBook;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(this.context);
        View view=inflater.inflate(R.layout.item2,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {
        Book book=dsBook.get(position);
        holder.imgBack.setImageResource(book.getImgae());
        holder.txtTitle.setText(book.getTitle());
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Bạn chọn sách: "+dsBook.get(position).getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dsBook.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBack;
        TextView txtTitle;
        CardView item;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBack=itemView.findViewById(R.id.imgBack);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            item=itemView.findViewById(R.id.item);

        }
    }
}

package phanbagiang.com.cardviewgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import phanbagiang.com.adapter.BookAdapter;
import phanbagiang.com.model.Book;

public class MainActivity extends AppCompatActivity {
    RecyclerView recBook;
    BookAdapter bookAdapter;
    ArrayList<Book>dsBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fakeData();
        addControls();
    }

    private void addControls() {
        recBook=findViewById(R.id.recAnime);
        bookAdapter=new BookAdapter(this,dsBook);
        recBook.setHasFixedSize(true);
        recBook.setAdapter(bookAdapter);
        //RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,3);

        recBook.setLayoutManager(new GridLayoutManager(this,3));
    }

    private void fakeData() {
        dsBook=new ArrayList<>();
        dsBook.add(new Book(R.drawable.hediedwith,"HediedWith","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.mariasemples,"Mariasemples","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.privacy,"Privacy","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.themartian,"Themartian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thevigitarian,"Thevigitarian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thewildrobot,"Thewildrobot","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.hediedwith,"HediedWith","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.mariasemples,"Mariasemples","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.privacy,"Privacy","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.themartian,"Themartian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thevigitarian,"Thevigitarian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thewildrobot,"Thewildrobot","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.hediedwith,"HediedWith","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.mariasemples,"Mariasemples","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.privacy,"Privacy","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.themartian,"Themartian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thevigitarian,"Thevigitarian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thewildrobot,"Thewildrobot","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.hediedwith,"HediedWith","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.mariasemples,"Mariasemples","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.privacy,"Privacy","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.themartian,"Themartian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thevigitarian,"Thevigitarian","Use it as a view group to contain other views."));
        dsBook.add(new Book(R.drawable.thewildrobot,"Thewildrobot","Use it as a view group to contain other views."));
    }
}

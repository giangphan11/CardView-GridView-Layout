package phanbagiang.com.cardviewgridlayout;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import phanbagiang.com.adapter.BookAdapter;
import phanbagiang.com.model.Book;

public class MainActivity extends AppCompatActivity {
    RecyclerView recBook;
    BookAdapter bookAdapter;
    ArrayList<Book>dsBook;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fakeData();
        addControls();
    }

    private void addControls() {
        drawerLayout=findViewById(R.id.drawer);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recBook=findViewById(R.id.recAnime);
        bookAdapter=new BookAdapter(this,dsBook);
        recBook.setHasFixedSize(true);
        recBook.setAdapter(bookAdapter);
        //RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,3);

        recBook.setLayoutManager(new GridLayoutManager(this,3));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
            return true;
        if(item.getItemId()==R.id.mnuAbout){
            Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
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

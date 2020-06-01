package phanbagiang.com.cardviewgridlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import phanbagiang.com.adapter.BookAdapter;
import phanbagiang.com.model.Book;

public class MainActivity extends AppCompatActivity {
    RecyclerView recBook;
    BookAdapter bookAdapter;
    ArrayList<Book>dsBook;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    FragmentManager fragmentManager=null;
    FragmentTransaction fragmentTransaction=null;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fakeData();
        addControls();
        addEvents();
    }

    private void addEvents() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                xuLyItem(menuItem);
                return true;
            }
        });
    }
    private void xuLyItem(MenuItem menuItem){
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        Fragment myFragment=null;
        Class fragmentClass=null;
        switch (menuItem.getItemId()){
            case R.id.mnuAbout:
                fragmentClass=FragmentAbout.class;
                break;
            case R.id.mnuHelp:
                fragmentClass=FragmentHelp.class;
                break;
            default:
                return;
        }
        try {
            myFragment = (Fragment) fragmentClass.newInstance();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        fragmentTransaction.replace(R.id.myFrameLayout,myFragment).commit();
        drawerLayout.closeDrawers();
    }

    private void addControls() {
        toolbar=findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
        drawerLayout=findViewById(R.id.drawer);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        navigationView=findViewById(R.id.myNavigationview);

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

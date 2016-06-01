package example.design.material.materialdesign;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import example.design.material.materialdesign.models.ModelItem;

public class ScrollingAppBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scolling_appbar);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setLogo(R.drawable.ic_menu_white_24dp);

        setSupportActionBar(toolbar);
        List<ModelItem> items = new ArrayList<>(10);
        for (int i = 0; i < 10; ++i) {
            ModelItem item = new ModelItem("http://images.all-free-download.com/images/graphicthumb/the_home_depot_0_142521.jpg", "Home Depot " + i);
            items.add(item);
        }
        recyclerView.setAdapter(new RecyclerViewAdaptor(items, this));
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}

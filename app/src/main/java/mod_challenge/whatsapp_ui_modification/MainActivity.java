package mod_challenge.whatsapp_ui_modification;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mod_challenge.whatsapp_ui_modification.R.layout.activity_main);

        toolbar =findViewById(mod_challenge.whatsapp_ui_modification.R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager =findViewById(mod_challenge.whatsapp_ui_modification.R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout =findViewById(mod_challenge.whatsapp_ui_modification.R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentChat(), "CHATS");
        adapter.addFragment(new FragmentChat(),"ONLINE");
        adapter.addFragment(new FragmentChat(), "STATUS");
        adapter.addFragment(new FragmentChat(), "CALLS");
        viewPager.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(mod_challenge.whatsapp_ui_modification.R.menu.menu, menu);
        return true;
    }

}

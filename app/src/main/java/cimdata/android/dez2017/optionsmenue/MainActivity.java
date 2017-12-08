package cimdata.android.dez2017.optionsmenue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(
                R.menu.main_menu,
                menu

        );



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // hier IDs überprüfen
        int id = item.getItemId();

        switch (id){
            case  R.id.main_menu_item_01:
                Toast.makeText(this, "Item 1 funktioniert",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.main_menu_item_02:
                Toast.makeText(this, "Item 2 funktioniert",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

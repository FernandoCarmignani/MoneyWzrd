package ISpyCorp.MZ.moneywzrd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Accounts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.AccBtn:
                        Toast.makeText(Accounts.this, "Clicked on the accounts button", Toast.LENGTH_SHORT).show();
                        break;
                        case R.id.Expbtn:
                        Toast.makeText(Accounts.this, "Clicked on the expenses button", Toast.LENGTH_SHORT).show();
                    case R.id.InvBtn:
                        Toast.makeText(Accounts.this, "Clicked on the investments button", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Homebtn:
                        Toast.makeText(Accounts.this, "Clicked on the home button", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.SetBtn:
                        Toast.makeText(Accounts.this, "Clicked on the settings button", Toast.LENGTH_SHORT).show();
                        break;
                }
            return true;
            }
        });
    }
}
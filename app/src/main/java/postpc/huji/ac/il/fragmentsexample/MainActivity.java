package postpc.huji.ac.il.fragmentsexample;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create fragments once, and reuse them on each button click
        final SizeToolbarFragment frgSize = new SizeToolbarFragment();
        final FontToolbarFragment frgFont = new FontToolbarFragment();
        final ColorToolbarFragment frgColor = new ColorToolbarFragment();


        // Get the TextView
        final TextView txtView = (TextView)findViewById(R.id.textView);

        // Set Size Toolbar
        ((Button)findViewById(R.id.buttonSize)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a transaction
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

                // Replace the current fragment with a new one
                fragmentTransaction.replace(R.id.toolbar_container, frgSize);

                // Add old fragment state to the stack
                fragmentTransaction.addToBackStack(null);

                // Commit and execute transaction
                fragmentTransaction.commit();
            }
        });

        // Set Font Toolbar
        ((Button)findViewById(R.id.buttonFont)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.toolbar_container, frgFont);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        // Set Volor Toolbar
        ((Button)findViewById(R.id.buttonColor)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.toolbar_container, frgColor);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    // To retrieve fragments from the back stack, we must override onBackPressed() in the main activity class
    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}

package sg.edu.rp.c346.id20025835.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Module2 extends AppCompatActivity {
    TextView c218TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        c218TV = findViewById(R.id.c218TV);

        Intent intentReceived = getIntent();
        String information2 = intentReceived.getStringExtra("c218");
        c218TV.setText("Module code: C218"  + "\nModule Name: " + information2 + "\nAcademic Year:2021" + "\nSemester:1" + "\nModule Credit:4" + "\nVenue:E62E");
    }
}
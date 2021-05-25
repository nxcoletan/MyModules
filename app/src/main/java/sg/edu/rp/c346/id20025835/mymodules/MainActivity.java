package sg.edu.rp.c346.id20025835.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMod1;
    Button btnMod2;
    Button btnMod3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMod1 = findViewById(R.id.c203);
        btnMod2 = findViewById(R.id.c218);
        btnMod3 = findViewById(R.id.c346);

        btnMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module1.class);
                intent.putExtra("c203", "1");
                startActivity(intent);
            }
        });
    }
}
package sg.edu.rp.c346.id20025835.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMod1;
    Button btnMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMod1 = findViewById(R.id.c203);
        btnMod2 = findViewById(R.id.c218);

        btnMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module1.class);
                intent.putExtra("c203", "Web Appln Development in php");
                startActivity(intent);
            }
        });

        btnMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Module2.class);
                intent2.putExtra("c218", "UI/UX Design for Apps");
                startActivity(intent2);
            }
        });
    }
}
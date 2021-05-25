package sg.edu.rp.c346.id20025835.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Module1 extends AppCompatActivity {
    TextView c203TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        c203TV = findViewById(R.id.c203TV);

        Intent intentReceived = getIntent();
        String information = intentReceived.getStringExtra("c203");
        c203TV.setText(
    }
}
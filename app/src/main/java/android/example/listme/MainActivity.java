package android.example.listme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker tp;
    TextView tv;
    TimePicker.OnTimeChangedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_picker);
        tp = (TimePicker) findViewById(R.id.timePicker1);
        tv = (TextView) findViewById(R.id.textView1);

        // listener jika terjadi perubahan isi TimePicker
        TimePicker.OnTimeChangedListener listener = new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, "Masukkan waktu: " + hourOfDay + ":" + minute,
                        Toast.LENGTH_SHORT).show();
            }
        };
        // Menerapkan listener pada TimePicker tp
        tp.setOnTimeChangedListener(listener);
    }
}

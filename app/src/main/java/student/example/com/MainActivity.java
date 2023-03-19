package student.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button); /* make sure the button ID matches */
        final TextView textView = findViewById(R.id.textView); /* make sure the textView ID matches */

        button.setOnClickListener(new View.OnClickListener() {
            int n = 1;

            @Override
            public void onClick(View v) {
                textView.setText("Hello again! " + Integer.toString(n++));
            }
        });
    }
}
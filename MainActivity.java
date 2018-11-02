package my.edu.um.fsktm.fragmentpractise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button penguin_btn;
    Button rabbit_btn;
    FrameLayout FragOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        penguin_btn = (Button)findViewById(R.id.penguin_btn);
        rabbit_btn = (Button)findViewById(R.id.rabbit_btn);
        FragOutput = (FrameLayout)findViewById(R.id.FragOutput);

        penguin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rabbit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        View.OnClickListener listner = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Fragment fragment = null;
            }
        }

    }
}

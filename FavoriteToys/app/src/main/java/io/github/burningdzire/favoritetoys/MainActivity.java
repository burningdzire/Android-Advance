package io.github.burningdzire.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mToysListTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToysListTextView = (TextView) findViewById(R.id.tv_toy_names);
        String [] toyNames = ToyBox.getToyNames();
        StringBuilder toyName = new StringBuilder();
        for (int i = 0; i < toyNames.length; i++)
        {
            toyName.append(toyNames[i] + "\n\n\n");
        }
        mToysListTextView.setText(toyName.toString());
    }
}

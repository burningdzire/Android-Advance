package io.github.burningdzire.explicit_intents;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private EditText mNameEntry;
    private Button mDoSomethingCoolButton;
    private TextView mDisplayMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDoSomethingCoolButton = (Button) findViewById(R.id.b_do_something_cool);
        mNameEntry = (EditText) findViewById(R.id.et_text_entry);
        mDisplayMessage = (TextView) findViewById(R.id.tv_display);

        /* Setting an OnClickListener allows us to do something when this button is clicked. */
        mDoSomethingCoolButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
                String message = "Button clicked!\nTODO: Start a new Activity and pass some data.";
                Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}


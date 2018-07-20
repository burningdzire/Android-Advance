package io.github.burningdzire.implicit_intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenWebpageButton(View view) {
        String urlAsString = "https://github.com/burningdzire";
        openWebPage(urlAsString);
    }

    public void onClickOpenAddressButton(View view) {
        Toast.makeText(this, "TODO: Open Location in Map", Toast.LENGTH_SHORT).show();
    }

    public void onClickShareTextButton(View view) {
        Toast.makeText(this, "TODO: Share Text Content", Toast.LENGTH_SHORT).show();
    }

    public void createYourOwn(View view) {
        Toast.makeText(this, "TODO: Create Your Own ", Toast.LENGTH_SHORT).show();
    }

    public void openWebPage(String requestUrlString)
    {
        Uri webpage = Uri.parse(requestUrlString);
        Intent intentOpenWebPage = new Intent(Intent.ACTION_VIEW, webpage);

        if (intentOpenWebPage.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intentOpenWebPage);
        }
    }
}

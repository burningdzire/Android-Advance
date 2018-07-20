package io.github.burningdzire.implicit_intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
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
        String addressString = "1600 Amphitheatre Parkway, CA";
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("geo")
                .path("0,0")
                .query(addressString);

        Uri geoLocation = builder.build();
        showMap(geoLocation);
    }

    public void onClickShareTextButton(View view) {
        String textToShare = "Hello there";
        shareText(textToShare);
    }

    public void createYourOwn(View view) {
        Toast.makeText(this, "TODO: Create Your Own ", Toast.LENGTH_SHORT).show();
    }

    private void openWebPage(String requestUrlString)
    {
        Uri webpage = Uri.parse(requestUrlString);
        Intent intentOpenWebPage = new Intent(Intent.ACTION_VIEW, webpage);

        if (intentOpenWebPage.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intentOpenWebPage);
        }
    }

    private void showMap(Uri geoLocation)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, geoLocation);

        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }

    private void shareText(String textToShare)
    {
        String mimeType = "text/plain";
        String title = "Share Text";

        ShareCompat.IntentBuilder
                .from(this)
                .setChooserTitle(title)
                .setType(mimeType)
                .setText(textToShare)
                .startChooser();
    }

}

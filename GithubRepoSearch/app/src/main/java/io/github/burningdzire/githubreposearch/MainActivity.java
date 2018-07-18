package io.github.burningdzire.githubreposearch;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.URL;

import io.github.burningdzire.githubreposearch.utilities.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    private String LOG_TAG = "MainActivity";
    private EditText mSearchBoxEditText;
    private TextView mUrlDisplayTextView;
    private TextView mSearchResultsTextView;
    private TextView mErrorMessageDisplayTextView;
    private ProgressBar mLoadingIndicatorProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);
        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_result_json);
        mErrorMessageDisplayTextView = (TextView) findViewById(R.id.tv_error_message_display);
        mLoadingIndicatorProgressBar = (ProgressBar) findViewById(R.id.pb_loading_indicator);
    }

    private void makeGithubSearchQuery() {
        String githubSearchQuery = mSearchBoxEditText.getText().toString();
        URL githubSearchUrl = NetworkUtils.buildUrl(githubSearchQuery);
        mUrlDisplayTextView.setText(githubSearchUrl.toString());

        GithubQueryTask githubQueryTask = new GithubQueryTask();
        githubQueryTask.execute(githubSearchUrl);
    }

    private void showJsonDataView() {
        mSearchResultsTextView.setVisibility(View.VISIBLE);
        mErrorMessageDisplayTextView.setVisibility(View.INVISIBLE);
    }

    private void showErrorMessage() {
        mSearchResultsTextView.setVisibility(View.INVISIBLE);
        mErrorMessageDisplayTextView.setVisibility(View.VISIBLE);
    }

    public class GithubQueryTask extends AsyncTask<URL, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mLoadingIndicatorProgressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(URL... urls) {
            URL githubSearchUrl = urls[0];
            String githubSearchResults = null;
            try {
                githubSearchResults = NetworkUtils.getResponseFromHttpUrl(githubSearchUrl);
            } catch (IOException e) {
                Log.d(LOG_TAG, "Could not get response", e);
            }
            return githubSearchResults;
        }

        @Override
        protected void onPostExecute(String githubSearchResults) {
            mLoadingIndicatorProgressBar.setVisibility(View.INVISIBLE);
            if (githubSearchResults == null || githubSearchResults == "") {
                showErrorMessage();
                return;
            }
            mSearchResultsTextView.setText(githubSearchResults);
            showJsonDataView();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.action_search) {
            makeGithubSearchQuery();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

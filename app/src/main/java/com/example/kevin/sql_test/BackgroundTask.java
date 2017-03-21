package com.example.kevin.sql_test;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by kevin on 21.03.17.
 */

public class BackgroundTask extends AsyncTask<Void ,Void, Void> {

    Context context;

    @Override
    protected Void doInBackground(Void... params) {
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}

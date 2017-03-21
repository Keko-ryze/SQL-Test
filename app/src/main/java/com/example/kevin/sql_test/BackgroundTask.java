package com.example.kevin.sql_test;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by kevin on 21.03.17.
 */

public class BackgroundTask extends AsyncTask< String ,Void, Void> {

    Context context;

    BackgroundTask(Context ctx) {
        context = ctx;
    }

    @Override
    protected Void doInBackground(String... params) {
        String type = params[0];
        if (type.equals("login")){

        }

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

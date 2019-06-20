package com.example.earthquake;

import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Event>> {

    private String url;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Event> loadInBackground() {
        if(url == null)
            return null;
        List<Event> earthquake = QuakeUtils.fetchEarthquakeData(url);
        return earthquake;
    }
}

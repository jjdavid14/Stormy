package com.jamiejdavid.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.jamiejdavid.stormy.R;
import com.jamiejdavid.stormy.adapters.DayAdapter;
import com.jamiejdavid.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}

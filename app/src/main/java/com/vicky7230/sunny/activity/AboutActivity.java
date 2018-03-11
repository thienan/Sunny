package com.vicky7230.sunny.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.vicky7230.sunny.R;
import com.vicky7230.sunny.utils.Util;

import org.sufficientlysecure.htmltextview.HtmlTextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Util.night())
            setTheme(R.style.AppThemeNight);
        setContentView(R.layout.activity_about);

        init();
    }

    private void init() {

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        HtmlTextView iconAttribution = findViewById(R.id.icon_attribution);
        iconAttribution.setHtml("<div>App Icon made by <a href=\"https://www.flaticon.com/authors/kiranshastry\" title=\"Kiranshastry\">Kiranshastry</a> from <a href=\"https://www.flaticon.com/\" title=\"Flaticon\">www.flaticon.com</a> is licensed by <a href=\"http://creativecommons.org/licenses/by/3.0/\" title=\"Creative Commons BY 3.0\" target=\"_blank\">CC 3.0 BY</a></div>");

        HtmlTextView apiAttribution = findViewById(R.id.api_attribution);
        apiAttribution.setHtml("Powered By <a href=\"https://openweathermap.org\" title=\"openWeatherMap\">OpenWeatherMap</a>");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

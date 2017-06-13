package com.example.dd;

import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
	Button bn,en;
	String languageToLoad;
	Context context = this;
	TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        en = (Button) findViewById(R.id.english);
        textView = (TextView) findViewById(R.id.textView1);

       
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	
         
         en.setOnClickListener(new OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				
 				
 			}
 		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("deprecation")
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_english) {
        	languageToLoad = "en"; // your language
	            Locale locale = new Locale(languageToLoad);
	            Locale.setDefault(locale);
	            Configuration config = new Configuration();
	            config.locale = locale;
	            getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
	            this.setContentView(R.layout.activity_main);
        }
        if (id == R.id.action_bangla) {
        		languageToLoad = "bn"; // your language
	            Locale locale = new Locale(languageToLoad);
	            Locale.setDefault(locale);
	            Configuration config = new Configuration();
	            config.locale = locale;
	            getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
	            this.setContentView(R.layout.activity_main);
		}
        
        if (id == R.id.action_hindi) {
    		languageToLoad = "hi"; // your language
            Locale locale = new Locale(languageToLoad);
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
            this.setContentView(R.layout.activity_main);
	}
        return super.onOptionsItemSelected(item);
    }
}

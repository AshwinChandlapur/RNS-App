package com.example.avinashk.rns.MainComponents;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;

import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.avinashk.rns.R;
import com.example.avinashk.rns.TrackBus.MapsActivity;
import com.example.avinashk.rns.attendanceSection.handle_nav_attendance;
import com.example.avinashk.rns.calenderOfEvents.handle_nav_calender;
import com.example.avinashk.rns.newsFeedSection.handle_nav_newsfeed;
import com.example.avinashk.rns.notesSection.handle_nav_notes;
import com.example.avinashk.rns.settingsControl.SettingsActivity;
import com.example.avinashk.rns.settingsControl.about_dev;
import com.example.avinashk.rns.settingsControl.admin_password;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView mainPageImage;
    CircularProgressBar circularProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mainPageImage = (ImageView) findViewById(R.id.mainPageImage);
        circularProgressBar = (CircularProgressBar)findViewById(R.id.progressBar);
        //Image ImageProcessing from Internet
        File file = new File("/data/data/com.example.avinashk.rns/app_imageDir/rns.jpg");
        if(!file.exists()){
            if(isNetworkAvailable()){
                new imageTask().execute("http://s11.postimg.org/jgzmmq0ir/image.jpg");
                //  /data/data/com.example.avinashk.rns/app_imageDir/rns.jpg is the location of the downloaded file
                Snackbar.make(findViewById(android.R.id.content),"Downloading Image!",Snackbar.LENGTH_SHORT).setAction("Action", null).show();

            }else {
                Snackbar.make(findViewById(android.R.id.content),"No Internet Connection",Snackbar.LENGTH_SHORT).setAction("Action",null).show();
            }
        }else {
            Bitmap myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            mainPageImage.setImageBitmap(myBitmap);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TextView snrit = (TextView)findViewById(R.id.snrit);
        Typeface cf = Typeface.createFromAsset(getAssets(), "fonts/MyriadPro-Regular.otf");
        snrit.setTypeface(cf);

    }


    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();

    }

    private String saveToInternalSorage(Bitmap bitmapImage){

        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        // path to /data/data/yourapp/app_data/imageDir
        File directory = cw.getDir("imageDir", Context.MODE_PRIVATE);
        // Create imageDir
        File mypath = new File(directory,"rns.jpg");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(mypath);
            // Use the compress method on the BitMap object to write image to the OutputStream
            bitmapImage.compress(Bitmap.CompressFormat.PNG, 100, fos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return directory.getAbsolutePath();
    }

    public class imageTask extends AsyncTask<String, String, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... params) {
            HttpURLConnection connection = null;
            try{
                URL url  = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                int fileLength = connection.getContentLength();
                InputStream stream = connection.getInputStream();
                byte data[] = new byte[4096];
                long total = 0;
                int count;
                while ((count = stream.read(data)) != -1) {
                    total += count;
                    if (fileLength > 0)
                        publishProgress(String.valueOf((int) (total * 100 / fileLength)));
                }
                Bitmap bitmap = BitmapFactory.decodeStream(stream);
                android.provider.MediaStore.Images.Media.insertImage(getContentResolver(),bitmap,"rns.ipg",null);
                return bitmap;
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if (connection != null)
                    connection.disconnect();
            }
            return null;
        }
        @Override
        protected void onPostExecute(Bitmap bitmap) {
            saveToInternalSorage(bitmap);
            mainPageImage.setImageBitmap(bitmap);
            super.onPostExecute(bitmap);
            circularProgressBar.setVisibility(View.GONE);
        }

        @Override
        protected void onPreExecute() {
            circularProgressBar.setVisibility(View.VISIBLE);
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(String... values) {
            circularProgressBar.setProgress(Integer.parseInt(values[0]));
            super.onProgressUpdate(values);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }else if( id == R.id.action_update){
           fragment = new admin_password();
           ft.replace(R.id.content_main,fragment);
           ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
           ft.addToBackStack(null);
           ft.commit();
        }else if( id == R.id.action_about){
            fragment = new about_dev();
            ft.replace(R.id.content_main,fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        Fragment fragment;
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        int id = item.getItemId();

        if (id == R.id.nav_attendance) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Fragment fragment;
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    fragment = new handle_nav_attendance();
                    ft.replace(R.id.content_main,fragment);
                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.addToBackStack(null);
                    ft.commit();
                }
            }).start();

        } else if (id == R.id.nav_newsFeed) {

            fragment = new handle_nav_newsfeed();
            ft.replace(R.id.content_main,fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();

        } else if (id == R.id.nav_Calender) {

            fragment = new handle_nav_calender();
            ft.replace(R.id.content_main,fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();

        } else if (id == R.id.nav_notes) {

            fragment = new handle_nav_notes();
            ft.replace(R.id.content_main,fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();

        } else if (id == R.id.nav_trackbus) {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(intent);
                }
            }, 275);

        } else if (id == R.id.nav_logout) {
            Intent intent = new Intent(this,hostelFirst.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}

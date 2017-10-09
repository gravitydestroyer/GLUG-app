package com.gnulinuxusersgroup.nitdgp.glug;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("GNU/LINUX USERS'S GROUP");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent text=new Intent(Intent.ACTION_SEND);
                text.setType("message/rfc822");
                text.putExtra(Intent.EXTRA_EMAIL  , new String[]{"contact@nitdgplug.org"});
                text.putExtra(Intent.EXTRA_SUBJECT, "Queries");
                try {
                    startActivity(Intent.createChooser(text, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent sett=new Intent(MainActivity.this,faqs.class);
        //noinspection SimplifiableIfStatement
        if (id == R.id.faq) {
            startActivity(sett);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Intent glgw=new Intent(MainActivity.this,glugweb.class);
        Intent glgm=new Intent(MainActivity.this,muktiweb.class);
        Intent shareintent=new Intent(Intent.ACTION_SEND);
        shareintent.setType("application/vnd.android.package-archive");
        Intent play = new Intent(android.content.Intent.ACTION_VIEW);
        play.setData(Uri.parse("https://play.google.com/store/apps/details?id=nitdgp.glug.somesh1995.mukti2017_2&hl=en"));


        int id = item.getItemId();

        if (id == R.id.workshop) {
            Intent worksh=new Intent(this,workshops.class);
            startActivity(worksh);


        } else if (id == R.id.webg) {

            startActivity(glgw);
            Toast.makeText(this,"GNU/LINUX USERS'S GROUP",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.webm) {
            startActivity(glgm);
            Toast.makeText(this,"MUKTI",Toast.LENGTH_SHORT).show();


        } else if (id == R.id.aboutus) {
            Intent con=new Intent(this,Contacts.class);
            startActivity(con);

        } else if (id == R.id.share) {

            startActivity(Intent.createChooser(shareintent,"share via"));

        } else if (id == R.id.muktiapp) {
            startActivity(play);

        } else if (id == R.id.feed)
        {
            Intent feedintent=new Intent(this,feedback.class);
            startActivity(feedintent);
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

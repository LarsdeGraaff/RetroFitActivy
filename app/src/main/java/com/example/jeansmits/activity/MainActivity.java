package com.example.jeansmits.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import model.LZVLeuven;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://172.30.68.17:3000";
    LZVLeuven lzvLeuven=new LZVLeuven();

    public void allTeams(View view){
        Intent intent=new Intent(this, TeamLijstActivity.class);
        startActivity(intent);
        finish();
    }

    public void sharedPref(View view){
        Intent intent=new Intent(this, PrefActivity.class );
        startActivity(intent);
        finish();
    }

    public void goToFragment(View view){

        Intent intent=new Intent(this, FragmentActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .build();

        MyApiEndpointInterface myApiEndpointInterface = restAdapter.create(MyApiEndpointInterface.class);
//
//        myApiEndpointInterface.getTeamId("1", new Callback<LZVLeuven>() {
//            @Override
//            public void success(LZVLeuven lzvLeuven, Response response) {
//                System.out.println("<-----GELUKT----->");
//                //teamfoto
//                ImageView imageView = (ImageView) findViewById(R.id.imageView);
//                Picasso.with(MainActivity.this).load(lzvLeuven.getImageURL()).into(imageView);
//                //teamnaam
//                TextView textViewTeamnaam= (TextView) findViewById(R.id.textView);
//                textViewTeamnaam.setText(lzvLeuven.getTeamName());
//                //sportzaal
//                TextView textViewSportzaal= (TextView) findViewById(R.id.textView2);
//                textViewSportzaal.setText(lzvLeuven.getSportzaal());
//                //teamkleuren
//                TextView textViewKleuren= (TextView) findViewById(R.id.textView3);
//                textViewKleuren.setText(lzvLeuven.getTeamColors());
//
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                System.out.println("<-----MISLUKT------>" + error.getMessage());
//
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public interface MyApiEndpointInterface {

        @GET("/LZVLeuven/{teamName}")
        void getTeamName(@Path("teamName") String teamName, Callback<LZVLeuven> cb);

        @GET("/LZVLeuven/{teamId}")
        void getTeamId(@Path("teamId") String teamName, Callback<LZVLeuven> cb);

        @POST("/LZVLeuven/new")
        void createTeam(@Body LZVLeuven lzvLeuven, Callback<LZVLeuven> cb);


    }

}


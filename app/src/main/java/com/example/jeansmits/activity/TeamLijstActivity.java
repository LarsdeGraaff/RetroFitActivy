package com.example.jeansmits.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import model.LZVLeuven;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by jeansmits on 7/09/15.
 */
public class TeamLijstActivity extends MainActivity {

    public static final String BASE_URL = "http://172.30.68.17:3000";
    private List<LZVLeuven> listAllTeams;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        final RecyclerView recyclerView= (RecyclerView) findViewById(R.id.r_view_teams);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .build();

        TeamLijstInterface teamLijstInterface=restAdapter.create(TeamLijstInterface.class);
        teamLijstInterface.getAllTeams(new Callback<List<LZVLeuven>>() {
            @Override
            public void success(List<LZVLeuven> lzvLeuvens, Response response) {
                System.out.println("<-----GELUKT----->");
                MyAdapter myAdapter=new MyAdapter(lzvLeuvens, TeamLijstActivity.this);
                recyclerView.setAdapter(myAdapter);

            }

            @Override
            public void failure(RetrofitError error) {
                System.out.println("<-----MISLUKT----->");
            }
        });
    }
        public interface TeamLijstInterface{
        @GET("/LZVLeuven/")
        void getAllTeams(Callback <List<LZVLeuven>> cb);

    }
}

package in.ac.iiitd.prankul.testhimmt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class StudentQueryActivity extends AppCompatActivity {

    Context mContext;
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_query);

        mContext = getApplicationContext();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, StartNewStudentQueryActivity.class);
                startActivity(i);
            }
        });


        //get all the queries
        list = (RecyclerView) findViewById(R.id.list);

        ArrayList<Query> myQueries = new ArrayList<>();
        myQueries.add(new Query("Ttile1","cse101",new ArrayList<Messege>()));
        myQueries.add(new Query("MAD","cse201",new ArrayList<Messege>()));
        myQueries.add(new Query("MC","cse301",new ArrayList<Messege>()));

        QueryAdapter adapter = new QueryAdapter(myQueries);

        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager( mContext ));
    }

}

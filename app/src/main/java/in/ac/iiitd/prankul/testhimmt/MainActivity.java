package in.ac.iiitd.prankul.testhimmt;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Context mContext;
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();

        //get all the courses
        list = (RecyclerView) findViewById(R.id.list);

        ArrayList<Course> myCourses = new ArrayList<>();
        myCourses.add(new Course("ADA","cse101",new ArrayList<String>()));
        myCourses.add(new Course("MAD","cse201",new ArrayList<String>()));
        myCourses.add(new Course("MC","cse301",new ArrayList<String>()));

        AllCourseAdapter adapter = new AllCourseAdapter(myCourses);

        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager( mContext ));
    }
}

package in.ac.iiitd.prankul.testhimmt;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.TimePicker;

//import com.example.kushagra.meetupapp.db.objects.Course;
//import com.example.kushagra.meetupapp.network.api.ServerApi;
//import com.example.kushagra.meetupapp.network.model.StudentQueryClass;

import java.util.Calendar;

//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;

public class StartNewStudentQueryActivity extends AppCompatActivity
{

    MultiAutoCompleteTextView tags,ta;
    public String[] tas;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArray("tas",tas);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
        tas=savedInstanceState.getStringArray("tas");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_new_query);

        tags = (MultiAutoCompleteTextView) this.findViewById(R.id.tags);
        ta = (MultiAutoCompleteTextView) this.findViewById(R.id.ta);


        String course = "cn";
        String[] suggestion=new String[0] ;

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(AllCoursesActivity.IP_ADD)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        ServerApi service = retrofit.create(ServerApi.class);
//        String courseId=getIntent().getStringExtra("course");
//
//        Course selectedCourse = new Course(courseId);
//
//        Call< Course > call = service.getSpecificCourseData(selectedCourse);
//        call.enqueue(new Callback<Course>() {
//            String[] suggestTA;
//
//            @Override
//            public void onResponse(Call<Course> call, Response<Course> response) {
//                if(response.body()!=null)
//                {
//
//              /*    suggestion is array list for suggestions, populate ot accordingly
//                    tas &suggestTA is for TA suggestions
//                    Course temp = response.body();
//                    ArrayList<String> TAarray = temp.getTaArray();
//                    suggestTA = (String[]) TAarray.toArray();
//                    tas=suggestTA;
//
//
//                    ArrayAdapter<String> course_adapter = new ArrayAdapter<String>(this,
//                    android.R.layout.simple_dropdown_item_1line,suggestion);
//                    tags.setAdapter(course_adapter);
//                    tags.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer() );
//
//                    ArrayAdapter<String> ta_adapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,tas);
//                    ta.setAdapter(ta_adapter);
//*/
//                }
//                else{
//
//                }
//
//
//            }
//
//            @Override
//            public void onFailure(Call<Course> call, Throwable t) {
//
//            }
//        });




    }

//    public void clickSendQuery(View v)
//    {
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(AllCoursesActivity.IP_ADD)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        ServerApi service = retrofit.create(ServerApi.class);
//
//
//        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(AllCoursesActivity.SHARED_PREF_FILE_NAME,
//                AllCoursesActivity.MODE_PRIVATE);
//        String studentId = sharedPreferences.getString(AllCoursesActivity.EMAIL_ID_EXTRA, "");
//
//        String courseId = getIntent().getStringExtra( AllCoursesActivity.COURSE_ID_EXTRA );
//        EditText editText = (EditText)findViewById(R.id.title);
//        EditText editTextDesp = (EditText)findViewById(R.id.description);
//        EditText editTextTA = (EditText)findViewById(R.id.ta);
//
//
//        Log.d(MainActivity.TAG , "editext" + "ccc" );
//
//
//        StudentQueryClass studentQueryClass = new StudentQueryClass(
//                editText.getText().toString(),
//                editTextDesp.getText().toString(),
//                studentId,
//                courseId,
//                true,
//                editTextTA.getText().toString()
//        );
//
//
//        Call<StudentQueryClass> call = service.sendQuery(studentQueryClass);
//        call.enqueue(new Callback<StudentQueryClass>() {
//            @Override
//            public void onResponse(Call<StudentQueryClass> call, Response<StudentQueryClass> response)
//            {
//                Log.d(MainActivity.TAG ," Query done");
//
//            }
//
//            @Override
//            public void onFailure(Call<StudentQueryClass> call, Throwable t) {
//
//                Log.d(MainActivity.TAG , "failed query");
//            }
//        });
//        finish();
//    }


}

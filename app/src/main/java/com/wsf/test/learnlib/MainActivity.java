package com.wsf.test.learnlib;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wsf.test.learnlib.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    Button button;
    MainActivity mainActivity;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = this;
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final User user = new User("test","user");
        activityMainBinding.setUser(user);
        activityMainBinding.setMainActivity(mainActivity);
        String content = "toastContent";
        String longClickContent = "toastLongClickContent";
        activityMainBinding.setContent(content);
        activityMainBinding.setLongClickContent(longClickContent);
        button = findViewById(R.id.test);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setFirstName("w");
                user.setLastName("sf");
            }
        });
    }

    public void onClick(View view){
        Log.i(TAG, "onClick: ");
    }

    public void showToast(String content){
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show();
    }

    public boolean showLongClickToast(String content){
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show();
        return true;
    }
}

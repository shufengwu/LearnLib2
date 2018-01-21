package com.wsf.test.learnlib;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ContactItem;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    Button button;
    MainActivity mainActivity;
    ContactItem activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = this;
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        /*final User user = new User("test","user");
        user.setVisibile(true);
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
        });*/

        /*final User user = new User();
        user.firstName.set("test");
        user.lastName.set("user");
        user.visible.set(true);
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
                user.firstName.set("w");
                user.lastName.set("sf");
            }
        });*/

        final ObservableMap<String, Object> user = new ObservableArrayMap<>();
        user.put("firstName", "test");
        user.put("lastName", "user");
        user.put("visible", true);
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
                user.put("firstName", "w");
                user.put("lastName", "sf");
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

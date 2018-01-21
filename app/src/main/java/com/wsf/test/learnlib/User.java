package com.wsf.test.learnlib;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wsf.test.learnlib.databinding.ActivityMainBinding;

/**
 * Created by Shufeng.Wu on 2018/1/19.
 */

public class User extends BaseObservable{

    private  String firstName;

    private  String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}

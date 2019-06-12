package com.sourcey.materiallogindemo;


import androidx.test.rule.ActivityTestRule;
//import android.support.test.runner.AndroidJUnit4;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)

public class LoginTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);


        //@Before

    @Test

    public <rule> void LoginSuccess(){
        //signup
        onView(withId(R.id.link_signup)).perform(click());
        onView(withId(R.id.input_name)).perform(typeText("Sunantha Poongat"), closeSoftKeyboard());
        onView(withId(R.id.input_address)).perform(typeText("95 ABBcondo,Bangkapi,Bangkok 10240"), closeSoftKeyboard());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_mobile)).perform(typeText("0954529555"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.input_reEnterPassword)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.btn_signup)).perform(click());

        onView(withId(R.id.btn_logout)).perform(click());

        //login
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_user1(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_user2(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_user3(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_user4(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_user5(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("sabcd"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_password1(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("abc"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_password2(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("aabbccddeef"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_password3(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("ABC"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_password4(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("AABBCCDDEEF"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_password5(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("Abc"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_password6(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("Aabbccddeef"), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

    @Test
    public <rule> void Loginfail_password7(){
        onView(withId(R.id.input_email)).perform(clearText());
        onView(withId(R.id.input_email)).perform(typeText("yingsilk@hotmail.com"), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());

    }

}





package com.example.anthonygrisaffi.roomez;

import android.app.Application;


import com.layer.sdk.LayerClient;
import com.layer.sdk.messaging.Conversation;
import com.layer.sdk.messaging.MessagePart;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.util.Arrays;
import java.util.UUID;


/**
 * Created by KD on 1/24/15.
 */
public class RoomEZapp extends Application {


    public void onCreate() {
        super.onCreate();
       ///parse.enableLocalDatastore(this);
        //ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, "XjzvazOhCMhhadj1JLb08mCHhiQkOrUy6mqp8U1G", "0BdOq5xBngNt2FImY6k3WMXamQkyfFOlMI6QnpzE");

    }





        //ParseUser user = new ParseUser();


// other fields can be set just like with ParseObject
        //user.put("phone", "650-555-0000");

        /*user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {
                    // Hooray! Let them use the app now.
                } else {
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                }
            }
        });*/


    }

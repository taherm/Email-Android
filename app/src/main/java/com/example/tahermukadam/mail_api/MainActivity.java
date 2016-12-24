package com.example.tahermukadam.mail_api;
import java.util.function.*;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        //StrictMode.setThreadPolicy(policy);

    }

    public void s(View v) {


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Mail m = new Mail("courtside.blr@gmail.com", "vickytheboss");

        String[] toArr = {"zkdaya@gmail.com"};
        m.setTo(toArr);
        // m.setFrom("wooo@wooo.com");
        //m.setSubject("This is an email sent using my Mail JavaMail wrapper from an Android device.");
        // m.setBody("Email body.");

        try {
            // m.addAttachment("/sdcard/filelocation");

            if (m.send()) {
                Toast.makeText(this, "Email was sent successfully.", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Email was not sent.", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            //Toast.makeText(MailApp.this, "There was a problem sending the email.", Toast.LENGTH_LONG).show();
            Log.e("MailApp", "Could not send email", e);
        }
    }


    }












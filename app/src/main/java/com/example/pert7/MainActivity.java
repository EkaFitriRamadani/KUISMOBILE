package com.example.pert7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickBiodata(View view) {
        Intent intent = new Intent (MainActivity.this, Biodata.class);
        startActivity(intent);
    }

    public void ClickLogout(View view) {
        logout(this);
    }

    public static void logout(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Keluar");
        builder.setMessage("Seriously:?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                activity.finishAffinity();
                System.exit(0);
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    public void Message(View view) {
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("sms:" + "085242910658")).putExtra("sms_body", "Hai, Nama saya Eka");
        startActivity(intent);
    }

    public void Maps(View view) {
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:-5.202241,119.458722")).setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
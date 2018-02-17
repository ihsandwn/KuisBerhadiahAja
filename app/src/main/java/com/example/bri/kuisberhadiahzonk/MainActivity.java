package com.example.bri.kuisberhadiahzonk;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mlineLearn, mlineQuiz, mlineAbout, mlineEmail; //MEMBUAT VARIABLE BERTIPE LINESAR LAYOUT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // MENYAMBUNGKAN MAINACTIVITY.JAVA DENGAN LAYOUT ACTIIVITY_MAIN

        mlineLearn = (LinearLayout) findViewById(R.id.lineBelajar);
        mlineQuiz = (LinearLayout) findViewById(R.id.lineLatihan);
        mlineAbout = (LinearLayout) findViewById(R.id.lineTentang);
        mlineEmail = (LinearLayout) findViewById(R.id.linekontak);
        //MENYAMBUNGKAN MAINACTIVITY.JAVA DENGAN ID PADA LAYOUT

        mlineLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BelajarActivity.class);
                startActivity(i);
            }
        });
        //MEMINDAHKAN CLASS MAINACTIVITY KE LEARNACTIVITY

        mlineQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KuisActivity.class);
                startActivity(i);
            }
        });

        mlineAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TentangKitaActivity.class);
                startActivity(i);
            }
        });

        mlineEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = "silalahi@gmail.com";
                String subject = "Nanya dong";
                String message = "Gua mau nanya";

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Kirim email dengan"));
            }
        }); // MEMBUAT PESAN EMAIL
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Anda yakin ingin keluar ?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog quit = builder.create();
        quit.show();
    }

}

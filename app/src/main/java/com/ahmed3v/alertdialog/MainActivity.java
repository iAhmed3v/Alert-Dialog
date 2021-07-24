package com.ahmed3v.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle(R.string.alert_title_text);
            alert.setMessage(R.string.alert_message_title);

            alert.setPositiveButton("OK" , (dialog , which) -> {

                Toast.makeText(getApplicationContext(), R.string.ok_toast,Toast.LENGTH_SHORT).show();
            });

            alert.setNegativeButton("Cancel" , (dialog , which) -> {

                Toast.makeText(getApplicationContext(), R.string.cancel_toast,Toast.LENGTH_SHORT).show();
            });

            alert.show();
        });
    }
}
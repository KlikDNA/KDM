package com.example.dna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import in.aabhasjindal.otptextview.OTPListener;
import in.aabhasjindal.otptextview.OtpTextView;

public class CodeVerivikasi extends AppCompatActivity {

    private OtpTextView mOtpTextView;

    Button btn_lantukan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verivikasi);

        TextView mDescriptionTextView = findViewById(R.id.description_code);
        mDescriptionTextView.setText(String.format(getString(R.string.text_input_kode_verifikasi), "85200001111"));

        mOtpTextView = findViewById(R.id.otp_view);
        mOtpTextView.setOtpListener(new OTPListener() {
            @Override
            public void onInteractionListener() {

            }

            @Override
            public void onOTPComplete(String otp) {
                Toast.makeText(CodeVerivikasi.this, "OTP : " + otp, Toast.LENGTH_SHORT).show();
            }
        });

        btn_lantukan = findViewById(R.id.btn_lantukan);

        btn_lantukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toprofile = new Intent(CodeVerivikasi.this,Edit_Profile.class);
                startActivity(toprofile);
            }
        });
    }
}

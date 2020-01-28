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

public class CodeVerivikasi extends AppCompatActivity {

    private EditText mNumber1EditText;
    private EditText mNumber2EditText;
    private EditText mNumber3EditText;
    private EditText mNumber4EditText;

    Button btn_lantukan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verivikasi);

        TextView mDescriptionTextView = findViewById(R.id.description_code);
        mDescriptionTextView.setText(String.format(getString(R.string.text_input_kode_verifikasi), "85200001111"));

        mNumber1EditText = findViewById(R.id.number1);
        mNumber2EditText = findViewById(R.id.number2);
        mNumber3EditText = findViewById(R.id.number3);
        mNumber4EditText = findViewById(R.id.number4);

        mNumber1EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    mNumber2EditText.requestFocus();
                } else if (s.length() == 0) {
//                    mNumber1EditText.clearFocus();
                }
            }
        });

        mNumber2EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    mNumber3EditText.requestFocus();
                } else if (s.length() == 0) {
                    mNumber1EditText.requestFocus();
                }
            }
        });

        mNumber3EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
                    mNumber4EditText.requestFocus();
                } else if (s.length() == 0) {
                    mNumber2EditText.requestFocus();
                }
            }
        });

        mNumber4EditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 1) {
//                    mNumber4EditText.clearFocus();
                } else if (s.length() == 0) {
                    mNumber3EditText.requestFocus();
                }
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

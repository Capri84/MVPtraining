package com.example.android.mvptraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private Contract.Presenter presenter;
    String input;
    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        presenter = new Presenter(this);
    }

    @Override
    public String readUserInput() {
        input = editText.getText().toString().trim();
        return input;
    }

    @Override
    public void clearField() {
        editText.setText("");
    }

    @Override
    public void displayText(String input) {
        textView.setText(input);
    }

    public void init() {
        editText = findViewById(R.id.edit_text_field);
        textView = findViewById(R.id.text_view_field);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onButtonClicked();
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}

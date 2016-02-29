package com.nigelcardozo.mathapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//THIS GITHUB CODE RELATES TO THE FOLLOWING BLOG POSTS AT:
//https://cakuma.wordpress.com/2016/02/29/android-studio-creating-a-library-project/
//https://cakuma.wordpress.com/2016/02/29/android-studio-using-a-library-project/
//Please visit cakuma for further details.

//There is an accompanying project at:
//https://github.com/nigelcardozo/UseLibrary_MathLibrary

//If you find this helpful, please take a look at my apps :
//https://play.google.com/store/apps/developer?id=elnimijo+games&hl=en_GB


//Import the MathX library that we created
import com.nigelcardozo.mathlibrary.MathX;

public class MainActivity extends AppCompatActivity {

    MathX mathX;

    EditText editTextInputOne;
    EditText editTextInputTwo;
    TextView textResult;

    Button buttonAdd;
    Button buttonSubtract;
    Button buttonMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an instance of MathX
        mathX = new MathX();

        setupViews();
    }

    private void setupViews()
    {
        editTextInputOne = (EditText) findViewById(R.id.editTextInputOne);
        editTextInputTwo = (EditText) findViewById(R.id.editTextInputTwo);
        textResult = (TextView) findViewById(R.id.textViewResult);

        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(editTextInputOne.getText().toString());
                int y = Integer.parseInt(editTextInputTwo.getText().toString());

                //This is where we use a function from our MathX library
                int result = mathX.addX(x, y);

                textResult.setText(String.valueOf(result));
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(editTextInputOne.getText().toString());
                int y = Integer.parseInt(editTextInputTwo.getText().toString());

                //This is where we use a function from our MathX library
                int result = mathX.subtractX(x, y);

                textResult.setText(String.valueOf(result));
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(editTextInputOne.getText().toString());
                int y = Integer.parseInt(editTextInputTwo.getText().toString());

                //This is where we use a function from our MathX library
                int result = mathX.multiplyX(x, y);

                textResult.setText(String.valueOf(result));
            }
        });
    }

}

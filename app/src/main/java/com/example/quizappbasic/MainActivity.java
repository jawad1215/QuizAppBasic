package com.example.quizappbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public int onRadioButtonClicked(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.ans1:
                if (checked)
                    Toast.makeText(this," True Great!",Toast.LENGTH_SHORT).show();
                    count++;

                    break;
            case R.id.ans2:
                if (checked)
                    Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.ans3:
                if (checked)
                    Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.ans4:
                if (checked)
                    Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                    break;
        }
        return count;
    }
    public int onRadioButtonClicked2(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.ans21:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans22:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans23:
                if (checked)
                Toast.makeText(this,"True Great!",Toast.LENGTH_SHORT).show();
                count++;
                break;
            case R.id.ans24:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
        }
        return count;
    }
    public int onRadioButtonClicked3(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.ans31:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans32:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans33:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans34:
                if (checked)
                Toast.makeText(this,"True Great! ",Toast.LENGTH_SHORT).show();
                count++;
                break;
        }
        return count;
    }
    public int onRadioButtonClicked4(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.ans41:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans42:
                if (checked)
                Toast.makeText(this,"True Great!",Toast.LENGTH_SHORT).show();
                count++;
                break;
            case R.id.ans43:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans44:
                if (checked)
                Toast.makeText(this,"Wrong ",Toast.LENGTH_SHORT).show();
                break;
        }
        return count;
    }
    public int onRadioButtonClicked5(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId())
        {
            case R.id.ans51:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans52:
                if (checked)
                Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ans53:
                if (checked)
                Toast.makeText(this," True Great!",Toast.LENGTH_SHORT).show();
                count++;
                break;
            case R.id.ans54:
                if (checked)
                Toast.makeText(this," Wrong",Toast.LENGTH_SHORT).show();
                break;
        }
        return count;
    }


    public void onButtonClicked(View view)
    {
       Toast.makeText(this,"Congratulations you completed the Quiz and your Score is:  " + " "+ count +" Points ",Toast.LENGTH_SHORT).show();

    }




}

package in.codingninjas.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View view){

        TextView textView =  (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());

        textView.setText((n1 + n2) + "");


//
//        ImageView picture = (ImageView) findViewById(R.id.imageView);
//        picture.setImageResource(R.mipmap.ic_launcher);



    }
}

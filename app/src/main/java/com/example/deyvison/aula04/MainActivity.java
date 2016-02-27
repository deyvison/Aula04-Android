package com.example.deyvison.aula04;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  TextView textView = new TextView(this);
       // textView.setText("loooool");
       // setContentView(textView);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Fala boy");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        TextView textView1 = (TextView) findViewById(R.id.textView2);
        final TextView textView2 = (TextView) findViewById(R.id.textView3);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);

      //  LayoutInflater inflater = LayoutInflater.from(this);
    //    inflater.inflate(R.layout.edit,linearLayout,false);

        View view = View.inflate(this,R.layout.edit,linearLayout);
        final EditText editText = (EditText) view.findViewById(R.id.editText);
        textView2.setText(editText.getText().toString());

        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(editText.getText().toString());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            Toast.makeText(MainActivity.this,"Voltei",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

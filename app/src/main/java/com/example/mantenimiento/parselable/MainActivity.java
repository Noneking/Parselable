package com.example.mantenimiento.parselable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private final String EXTRA_LOGIN = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Ejecutar(View v)
    {
        EditText user= (EditText) findViewById(R.id.userEditText);
        EditText password= (EditText) findViewById(R.id.passwordEditText);

        //Intent i=new Intent(this, SecondActivity.class);
        //i.putExtra(EXTRA_LOGIN, user.getText().toString());
        //i.putExtra(EXTRA_PASSWORD, password.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        User u = new User(user.getText().toString(),password.getText().toString());
        intent.putExtra(EXTRA_LOGIN, u);
        startActivity(intent);



    }

}

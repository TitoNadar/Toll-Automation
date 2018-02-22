package tito.example.com.toll_naka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bd = getIntent().getExtras();


        String a = bd.getString("name");
        String b = bd.getString("add");

        TextView tollname=(TextView)findViewById(R.id.tollname);
        TextView add =(TextView)findViewById(R.id.tolladd);
        tollname.setText(a);
        add.setText(b);

    }

    public void pay(View view)
    {
        Intent i = new Intent(this, PayActivity.class);
        startActivity(i);
    }
    }


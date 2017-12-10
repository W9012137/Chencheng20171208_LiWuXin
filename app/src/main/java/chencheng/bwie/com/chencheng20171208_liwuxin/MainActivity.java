package chencheng.bwie.com.chencheng20171208_liwuxin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FavorLayout fl = (FavorLayout) findViewById(R.id.fl);
        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fl.addHeart();
            }
        });


    }







}

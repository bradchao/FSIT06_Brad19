package tw.org.iii.appps.brad19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private F1 f1;
    private F2 f2;
    private F3 f3;
    private F4 f4;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.main_title);

        fmgr = getSupportFragmentManager();
        f1 = new F1();
        f2 = new F2();
        f3 = new F3();
        f4 = new F4();

        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
    }

    public void setMainTitle(String titleString){
        title.setText(titleString);
    }
    public F2 getF2(){
        return f2;
    }

    public void test1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit();
    }

    public void test2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit();
    }

    public void test3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f3);
        transaction.commit();
    }

    public void test4(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f4);
        transaction.commit();
    }

}

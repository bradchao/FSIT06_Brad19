package tw.org.iii.appps.brad19;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class F1 extends Fragment {
    private MainActivity mainActivity;
    private View mainView;
    private TextView tv;
    private Button btn, btn2, btn3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);

            tv = mainView.findViewById(R.id.f1_tv);

            btn = mainView.findViewById(R.id.f1_btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1BtnClick();
                }
            });
            btn2 = mainView.findViewById(R.id.f1_btn2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1Btn2Click();
                }
            });
            btn3 = mainView.findViewById(R.id.f1_btn3);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1Btn3Click();
                }
            });
        }

        return mainView;
    }

    private void f1BtnClick(){
        tv.setText("Lottery:" + (int)(Math.random()*38+1));
    }
    private void f1Btn2Click(){
        mainActivity.setMainTitle("Hello, Brad");
    }
    private void f1Btn3Click(){
        mainActivity.getF2().setF2Title("Hello, World");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity){
            Log.v("brad", "OK");
        }

        mainActivity = (MainActivity)context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("brad", "onDetach");
    }

}

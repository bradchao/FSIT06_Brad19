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
    private View mainView;
    private TextView tv;
    private Button btn;

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
        }

        return mainView;
    }

    private void f1BtnClick(){
        tv.setText("Lottery:" + (int)(Math.random()*38+1));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("brad", "onAttach");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("brad", "onDetach");
    }

}

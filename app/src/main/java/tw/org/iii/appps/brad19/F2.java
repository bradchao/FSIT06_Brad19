package tw.org.iii.appps.brad19;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {
    private View mainView;
    private TextView tv;
    private Timer timer;
    private int iCounter;

    public F2(){
        timer = new Timer();
        timer.schedule(new MyTask(), 0, 1000);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mainView = inflater.inflate(R.layout.fragment_f2, container, false);
        tv = mainView.findViewById(R.id.f2_tv);

        return mainView;
    }

    private class MyTask extends TimerTask {
        @Override
        public void run() {
            if (tv !=null){
                iCounter++;
            }
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

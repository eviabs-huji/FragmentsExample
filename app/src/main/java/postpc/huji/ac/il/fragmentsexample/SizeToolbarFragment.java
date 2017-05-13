package postpc.huji.ac.il.fragmentsexample;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SizeToolbarFragment extends Fragment implements OnSeekBarChangeListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_size_toolbar, container, false);

        // Get seek bar
        final SeekBar seekbar = (SeekBar) view.findViewById(R.id.seekBar1);

        // Set this class as listener
        seekbar.setOnSeekBarChangeListener(this);

        return view;
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        ((TextView)getActivity().findViewById(R.id.textView)).setTextSize(progress*50/100 + 10);
    }

    @Override
    public void onStartTrackingTouch(SeekBar arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStopTrackingTouch(SeekBar arg0) {
        // TODO Auto-generated method stub
    }
}


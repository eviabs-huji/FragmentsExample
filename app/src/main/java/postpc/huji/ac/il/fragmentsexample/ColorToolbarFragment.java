package postpc.huji.ac.il.fragmentsexample;

import android.app.FragmentTransaction;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ColorToolbarFragment extends android.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color_toolbar, container, false);

        // Change fonts
        ((Button) view.findViewById(R.id.buttonRed)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) getActivity().findViewById(R.id.textView)).setTextColor(Color.RED);
            }
        });

        ((Button) view.findViewById(R.id.buttonBlue)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) getActivity().findViewById(R.id.textView)).setTextColor(Color.BLUE);
            }
        });

        ((Button) view.findViewById(R.id.buttonGreen)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) getActivity().findViewById(R.id.textView)).setTextColor(Color.GREEN);
            }
        });
        return view;
    }
}

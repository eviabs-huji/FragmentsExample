package postpc.huji.ac.il.fragmentsexample;

import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FontToolbarFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_font_toolbar, container, false);

        // Change fonts
        ((Button) view.findViewById(R.id.buttonMonospace)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)getActivity().findViewById(R.id.textView)).setTypeface(Typeface.MONOSPACE);
            }
        });

        ((Button) view.findViewById(R.id.buttonSansSerif)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)getActivity().findViewById(R.id.textView)).setTypeface(Typeface.SANS_SERIF);
            }
        });

        ((Button) view.findViewById(R.id.buttonSerif)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)getActivity().findViewById(R.id.textView)).setTypeface(Typeface.SERIF);
            }
        });
        return view;
    }
}

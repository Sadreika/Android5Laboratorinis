package com.example.a5laboratorinis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class WithA extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup contrainer, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_with_a, contrainer, false);
        Bundle bundle = this.getArguments();
        String text = bundle.getString("text");
        textView = view.findViewById(R.id.textView);

        int count = 0;
        String[] textChars = text.split("");
        for(String oneChar : textChars)
        {
            if(oneChar.toLowerCase().equals("a"))
            {
                count += 1;
            }
        }
        textView.setText(text + " turi " + count + "a");
        return view;
    }
}

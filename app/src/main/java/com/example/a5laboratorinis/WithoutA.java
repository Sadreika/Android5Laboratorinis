package com.example.a5laboratorinis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class WithoutA extends Fragment {

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_without_a, container, false);
        Bundle bundle = this.getArguments();
        String text = bundle.getString("text");
        textView = view.findViewById(R.id.textView);

        int basles = 0;
        int uppercase = 0;

        String[] textChars = text.split("");
        for(String oneletter : textChars)
        {
            if(oneletter.toLowerCase().equals("a") ||
                    oneletter.toLowerCase().equals("u") ||
                    oneletter.toLowerCase().equals("i") ||
                    oneletter.toLowerCase().equals("o") ||
                    oneletter.toLowerCase().equals("e")
            )
            {
                basles += 1;
            }

            if(!oneletter.equals(" "))
            {
                if(oneletter.equals(oneletter.toUpperCase()))
                {
                    uppercase += 1;
                }
            }
        }
        textView.setText("zodis " + text + " turi " + text.length() + " raides\n"

                + basles + " balses \n"
                + uppercase + " didziosios \n"
                + (text.length() - uppercase) + "mazosios");

        return view;
    }
}
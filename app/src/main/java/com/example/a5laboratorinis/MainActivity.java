package com.example.a5laboratorinis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
    }

    public static void WithA(String text)
    {
        Bundle bundle = new Bundle();
        bundle.putString("text", text);
        WithA fragment = new WithA();
        fragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame, fragment);
        fragmentTransaction.addToBackStack("backStack");
        fragmentTransaction.commit();
    }

    public static void WithoutA (String text)
    {
        Bundle bundle = new Bundle();
        bundle.putString("text", text);
        WithoutA fragment = new WithoutA();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame, fragment);
        fragmentTransaction.addToBackStack("backStack");
        fragmentTransaction.commit();
    }

}
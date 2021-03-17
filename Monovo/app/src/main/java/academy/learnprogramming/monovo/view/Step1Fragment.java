package academy.learnprogramming.monovo.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import academy.learnprogramming.monovo.R;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;


public class Step1Fragment extends Fragment {
    private SectionsPagerAdapter sectionsPagerAdapter;
    View view;

    public static Step1Fragment newInstance() {
        Step1Fragment fragment = new Step1Fragment();

        Bundle args = new Bundle(1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_step1, container, false);

        Button button = (Button) view.findViewById(R.id.step1Btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToStep2();
            }
        });

        return view;
    }

    public void moveToStep2() {
        Step2Fragment step2Fragment = new Step2Fragment();
        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.view_pager, step2Fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sectionsPagerAdapter = new SectionsPagerAdapter(getContext(), this.getFragmentManager(), SectionsPagerAdapter.DEFAULT_TAB_TITLES);
        ViewPager viewPager = getView().findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

    }
}
package academy.learnprogramming.monovo.view;

import android.os.Bundle;

import academy.learnprogramming.monovo.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Step3Fragment extends Fragment {
    private SectionsPagerAdapter sectionsPagerAdapter;

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
        return inflater.inflate(R.layout.fragment_step3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sectionsPagerAdapter = new SectionsPagerAdapter(getContext(), this.getFragmentManager(), SectionsPagerAdapter.DEFAULT_TAB_TITLES);
        ViewPager viewPager = getView().findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

    }
}
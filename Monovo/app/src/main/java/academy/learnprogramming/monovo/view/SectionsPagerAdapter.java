package academy.learnprogramming.monovo.view;

import android.content.Context;

import academy.learnprogramming.monovo.R;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SectionsPagerAdapter extends FragmentPagerAdapter {

    protected static int STEP_1_FRAGMENT_POSITION = 0;
    protected static int STEP_2__FRAGMENT_POSITION = 1;
    protected static int STEP_3__FRAGMENT_POSITION = 2;

    public static int[] DEFAULT_TAB_TITLES = new int[]{R.string.step1, R.string.step2, R.string.step3};


    @StringRes
    public int[] TAB_TITLES;
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm, int[] tab_titles) {
        super(fm);
        mContext = context;
        this.TAB_TITLES = tab_titles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == STEP_1_FRAGMENT_POSITION) {
            return Step1Fragment.newInstance();
        } else if (position == STEP_2__FRAGMENT_POSITION) {
            return Step2Fragment.newInstance();
        } else if (position == STEP_3__FRAGMENT_POSITION) {
            return Step3Fragment.newInstance();
        }
        else {
            return PlaceholderFragment.newInstance(position + 1);
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return TAB_TITLES.length;
    }
}
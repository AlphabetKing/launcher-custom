package ai.elimu.launcher_custom;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.andraskindler.parallaxviewpager.ParallaxViewPager;
import com.matthewtamlin.sliding_intro_screen_library.indicators.Dot;
import com.matthewtamlin.sliding_intro_screen_library.indicators.DotIndicator;

import java.util.List;

//import ai.elimu.analytics.eventtracker.EventTracker;
import ai.elimu.launcher_custom.model.AppCategory;
import ai.elimu.launcher_custom.model.AppCollection;
import ai.elimu.launcher_custom.model.AppGroup;
import ai.elimu.model.gson.admin.ApplicationGson;

public class HomeScreensActivity extends AppCompatActivity {

    private static AppCollection appCollection;

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ParallaxViewPager viewPager;

    private DotIndicator dotIndicator;

    private static int currentPosition = 1;

    private int countOffset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(getClass().getName(), "onCreate");
        super.onCreate(savedInstanceState);

        if ("en".equals(BuildConfig.FLAVOR)) {
            appCollection = AppCollectionGenerator.loadAppCollectionEnglish();
        } else if ("enNum".equals(BuildConfig.FLAVOR)) {
            appCollection = AppCollectionGenerator.loadAppCollectionEnglishAndNumeracy();
        } else if ("fr".equals(BuildConfig.FLAVOR)) {
            appCollection = AppCollectionGenerator.loadAppCollectionFrench();
        } else if ("no".equals(BuildConfig.FLAVOR)) {
            appCollection = AppCollectionGenerator.loadAppCollectionNorwegian();
        } else if ("so".equals(BuildConfig.FLAVOR)) {
            appCollection = AppCollectionGenerator.loadAppCollectionSomali();
        } else if ("num".equals(BuildConfig.FLAVOR)) {
            appCollection = AppCollectionGenerator.loadAppCollectionNumeracy();
        }
        Log.i(getClass().getName(), "appCollection.getAppCategories().size(): " + appCollection.getAppCategories().size());

        setContentView(ai.elimu.launcher_custom.R.layout.activity_home_screens);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        Resources res = getResources();
        boolean withVideoPage = res.getBoolean(R.bool.video_page);
        if(withVideoPage)
            countOffset = 1;

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        dotIndicator = (DotIndicator) findViewById(ai.elimu.launcher_custom.R.id.dotIndicator);
        dotIndicator.setNumberOfItems(appCollection.getAppCategories().size()+countOffset);
        dotIndicator.setDotsClickCallback(new Dot.DotCallback() {
            @Override
            public void call(int ID) {
                int currentPageID = dotIndicator.getSelectedItemIndex();
                if(currentPageID!=ID) {
                    viewPager.setCurrentItem(ID,true);
                }
            }
        });

        Log.i(getClass().getName(), "onCreate currentPosition: " + currentPosition);


        // Set up the ViewPager with the sections adapter.
        viewPager = (ParallaxViewPager) findViewById(ai.elimu.launcher_custom.R.id.container);
        //viewPager.setBackgroundResource(R.drawable.background_indigo);
        viewPager.setBackgroundResource(R.drawable.roto2b5);
        viewPager.setAdapter(mSectionsPagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                Log.i(getClass().getName(), "onPageSelected");
                Log.i(getClass().getName(), "position: " + position);

                dotIndicator.setSelectedItem(position, true);
                currentPosition = position;
                if(countOffset==1 && position == appCollection.getAppCategories().size()+countOffset) {
                    LastPageFragment lastPage = (LastPageFragment)mSectionsPagerAdapter.getItem(mSectionsPagerAdapter.getCount());
                    lastPage.stopVideo();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.i(getClass().getName(), "onPageScrollStateChanged");

            }
        });
    }

    @Override
    protected void onStart() {
        Log.i(getClass().getName(), "onStart");
        super.onStart();

        Log.i(getClass().getName(), "onStart currentPosition: " + currentPosition);
    }

    @Override
    protected void onResume() {
        Log.i(getClass().getName(), "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(getClass().getName(), "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(getClass().getName(), "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(getClass().getName(), "onDestroy");
        super.onDestroy();
    }

    public static class LastPageFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";
        private int stopPosition = 1;
        private boolean started = false;
        private VideoView videoView = null;
        private MediaPlayer mediaPlayer = null;

        public LastPageFragment() {
        }

        public static LastPageFragment newInstance(int sectionNumber) {
//            Log.i(PlaceholderFragment.class.getName(), "newInstance");
//            Log.i(PlaceholderFragment.class.getName(), "newInstance sectionNumber: " + sectionNumber);
//            Log.i(PlaceholderFragment.class.getName(), "newInstance currentPosition: " + currentPosition);

            LastPageFragment fragment = new LastPageFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public void stopVideo() {
            if(started) {
                videoView.stopPlayback();
                started = false;
                stopPosition = 1;
                videoView.seekTo(1);
            }
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_last_page, container, false);

            // Set category name
            TextView textViewCategoryName = (TextView) rootView.findViewById(R.id.textViewCategoryName);
            android.graphics.Typeface font = android.graphics.Typeface.createFromAsset(getActivity().getAssets(), "fonts/luckiestguy.ttf");
            textViewCategoryName.setTypeface(font);

            Resources res = getResources();
            String pageCaption = res.getString(R.string.video_page_name);

            textViewCategoryName.setText(pageCaption);
            videoView = (VideoView) rootView.findViewById(R.id.videoView);
            String path = "android.resource://" + getActivity().getPackageName() + "/raw/" + res.getString(R.string.video_name);
            videoView.setVideoURI(Uri.parse(path));

            final MediaController mediaController = new MediaController(getActivity());
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    started = false;
                    mediaPlayer.seekTo(0);
                }
            });

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mediaPlayer = mp;
                }
            });

            videoView.setOnTouchListener (new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent event) {

                    if(!started) {
                        mediaPlayer.start();
                        started = true;
                    } else {
                        mediaPlayer.pause();
                        started = false;
                    }

                    return false;
                }
            });

            return rootView;
        }
    }

    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            Log.i(PlaceholderFragment.class.getName(), "newInstance");
            Log.i(PlaceholderFragment.class.getName(), "newInstance sectionNumber: " + sectionNumber);
            Log.i(PlaceholderFragment.class.getName(), "newInstance currentPosition: " + currentPosition);

            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            Log.i(getClass().getName(), "onCreateView");

            Log.i(getClass().getName(), "onCreateView currentPosition: " + currentPosition);
            int sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
            Log.i(getClass().getName(), "onCreateView sectionNumber: " + sectionNumber);
//            if ((sectionNumber == 0) && (currentPosition > 0)) {
//                sectionNumber = currentPosition;
//            }
//            Log.i(getClass().getName(), "onCreateView sectionNumber: " + sectionNumber);

            View rootView = inflater.inflate(R.layout.fragment_home_screen, container, false);

            // Set category name
            TextView textViewCategoryName = (TextView) rootView.findViewById(R.id.textViewCategoryName);
            AppCategory appCategory = appCollection.getAppCategories().get(sectionNumber);
            android.graphics.Typeface font = android.graphics.Typeface.createFromAsset(getActivity().getAssets(), "fonts/luckiestguy.ttf");
            textViewCategoryName.setTypeface(font);
            textViewCategoryName.setText(appCategory.getName().toUpperCase());

            LinearLayout linearLayoutAppGroupsContainer = (LinearLayout) rootView.findViewById(R.id.linearLayoutAppGroupsContainer);
            initializeAppCategory(linearLayoutAppGroupsContainer, sectionNumber);

            return rootView;
        }

        private void initializeAppCategory(LinearLayout linearLayoutAppGroupsContainer, int sectionNumber) {
            Log.i(getClass().getName(), "initializeAppCategory");

            Log.i(getClass().getName(), "initializeAppCategory sectionNumber: " + sectionNumber);

            final AppCategory appCategory = appCollection.getAppCategories().get(sectionNumber);
            Log.i(getClass().getName(), "initializeAppCategory appCategory.getName(): " + appCategory.getName());

            List<AppGroup> appGroups = appCategory.getAppGroups();
//            Log.i(getClass().getName(), "appGroups.size(): " + appGroups.size());

            for (AppGroup appGroup : appGroups) {
//                Log.i(getClass().getName(), "appGroup.getApplications().size(): " + appGroup.getApplications().size());

                FlowLayout flowLayoutAppGroup = (FlowLayout) LayoutInflater.from(getActivity())
                        .inflate(R.layout.fragment_home_screen_app_group, linearLayoutAppGroupsContainer, false);

                for (final ApplicationGson application : appGroup.getApplications()) {
//                    Log.i(getClass().getName(), "application.getPackageName(): " + application.getPackageName());

                    final PackageManager packageManager = getActivity().getPackageManager();

                    try {
                        // Set app icon
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), PackageManager.GET_META_DATA);
                        Resources resources = packageManager.getResourcesForApplication(application.getPackageName());
                        Drawable icon;
                        if (Build.VERSION.SDK_INT > 21) {
                            icon = resources.getDrawableForDensity(applicationInfo.icon, DisplayMetrics.DENSITY_XXHIGH, null);
                        } else {
                            //This method was deprecated in API level 22
                            icon = resources.getDrawableForDensity(applicationInfo.icon, DisplayMetrics.DENSITY_XXHIGH);
                        }
//                        Log.i(getClass().getName(), "icon: " + icon);
                        LinearLayout linearLayoutAppView = (LinearLayout) LayoutInflater.from(getActivity())
                                .inflate(R.layout.fragment_home_screen_app_group_app_view, flowLayoutAppGroup, false);
                        ImageView appIconImageView = (ImageView) linearLayoutAppView.findViewById(ai.elimu.launcher_custom.R.id.appIconImageView);
                        appIconImageView.setImageDrawable(icon);
                        appIconImageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i(getClass().getName(), "appIconImageView onClick");

                                Intent intent = packageManager.getLaunchIntentForPackage(application.getPackageName());
                                intent.addCategory(Intent.CATEGORY_LAUNCHER);
//                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                                startActivity(intent);

                                //EventTracker.reportApplicationOpenedEvent(getContext(), application.getPackageName());
                            }
                        });

                        // Set app title
                        String applicationLabel = packageManager.getApplicationLabel(applicationInfo).toString();
//                        Log.i(getClass().getName(), "applicationLabel: " + applicationLabel);
                        TextView appLabelTextView = (TextView) linearLayoutAppView.findViewById(R.id.textViewAppLabel);
                        appLabelTextView.setText(applicationLabel);

                        flowLayoutAppGroup.addView(linearLayoutAppView);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e(getClass().getName(), "Application not installed: " + application.getPackageName());
                    }
                }

                if (flowLayoutAppGroup.getChildCount() > 0) {
                    linearLayoutAppGroupsContainer.addView(flowLayoutAppGroup);
                }
            }
        }

        @Override
        public void onStart() {
            Log.i(getClass().getName(), "onStart");
            super.onStart();
        }

        @Override
        public void onResume() {
            Log.i(getClass().getName(), "onResume");
            super.onResume();
        }
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Log.i(getClass().getName(), "getItem");
            Log.i(getClass().getName(), "getItem position: " + position);
            if(position>=appCollection.getAppCategories().size()) {
                return LastPageFragment.newInstance(position);
            }
            return PlaceholderFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            Log.i(getClass().getName(), "getCount: " + appCollection.getAppCategories().size());
            return appCollection.getAppCategories().size()+countOffset;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Log.i(getClass().getName(), "getPageTitle: " + appCollection.getAppCategories().get(position).getName());
            return appCollection.getAppCategories().get(position).getName();
        }
    }


    @Override
    public void onBackPressed() {
        Log.i(getClass().getName(), "onBackPressed");

        // Do nothing
    }
}

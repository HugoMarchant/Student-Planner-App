package com.development.hugomarchant.drawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static android.R.attr.tag;
import static android.R.id.message;
import static com.development.hugomarchant.drawer.R.id.checkedTextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimetableCreatorFragment2 extends Fragment {

    DataStore user1 = new DataStore();

    public TimetableCreatorFragment2() {
        // Required empty public constructor

    }

    private static final String tag = "TimetableCreator2";

    public List<String> Subjects = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_timetable_creator_fragment2, container, false);

        final CheckedTextView mCheckedTextView = (CheckedTextView)v.findViewById(R.id.checkedTextView);
        mCheckedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView.isChecked()) {
                    mCheckedTextView.setChecked(false);
                    mCheckedTextView.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Art");
                    user1.setSubjectsArt(false);


                } else

                {
                    mCheckedTextView.setChecked(true);
                    mCheckedTextView.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Art");
                    user1.setSubjectsArt(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView1 = (CheckedTextView)v.findViewById(R.id.checkedTextView1);
        mCheckedTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView1.isChecked()) {
                    mCheckedTextView1.setChecked(false);
                    mCheckedTextView1.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Biology");
                    user1.setSubjectsBiology(false);
                } else

                {
                    mCheckedTextView1.setChecked(true);
                    mCheckedTextView1.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Biology");
                    user1.setSubjectsBiology(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView2 = (CheckedTextView)v.findViewById(R.id.checkedTextView2);
        mCheckedTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView2.isChecked()) {
                    mCheckedTextView2.setChecked(false);
                    mCheckedTextView2.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Chemistry");
                    user1.setSubjectsBiology(false);
                } else

                {
                    mCheckedTextView2.setChecked(true);
                    mCheckedTextView2.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Chemistry");
                    user1.setSubjectsChemistry(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView3 = (CheckedTextView)v.findViewById(R.id.checkedTextView3);
        mCheckedTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView3.isChecked()) {
                    mCheckedTextView3.setChecked(false);
                    mCheckedTextView3.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Classics");
                    user1.setSubjectsClassics(false);
                } else

                {
                    mCheckedTextView3.setChecked(true);
                    mCheckedTextView3.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Classics");
                    user1.setSubjectsClassics(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView4 = (CheckedTextView)v.findViewById(R.id.checkedTextView4);
        mCheckedTextView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView4.isChecked()) {
                    mCheckedTextView4.setChecked(false);
                    mCheckedTextView4.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("D.T.");
                    user1.setSubjectsDT(false);
                } else

                {
                    mCheckedTextView4.setChecked(true);
                    mCheckedTextView4.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("D.T.");
                    user1.setSubjectsDT(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView5 = (CheckedTextView)v.findViewById(R.id.checkedTextView5);
        mCheckedTextView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView5.isChecked()) {
                    mCheckedTextView5.setChecked(false);
                    mCheckedTextView5.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Drama");
                    user1.setSubjectsDrama(false);
                } else

                {
                    mCheckedTextView5.setChecked(true);
                    mCheckedTextView5.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Drama");
                    user1.setSubjectsDrama(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView6 = (CheckedTextView)v.findViewById(R.id.checkedTextView6);
        mCheckedTextView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView6.isChecked()) {
                    mCheckedTextView6.setChecked(false);
                    mCheckedTextView6.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Economics");
                    user1.setSubjectsEconomics(false);
                } else

                {
                    mCheckedTextView6.setChecked(true);
                    mCheckedTextView6.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Economics");
                    user1.setSubjectsEconomics(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView7 = (CheckedTextView)v.findViewById(R.id.checkedTextView7);
        mCheckedTextView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView7.isChecked()) {
                    mCheckedTextView7.setChecked(false);
                    mCheckedTextView7.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("English");
                    user1.setSubjectsEnglish(false);
                } else

                {
                    mCheckedTextView7.setChecked(true);
                    mCheckedTextView7.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("English");
                    user1.setSubjectsEnglish(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView8 = (CheckedTextView)v.findViewById(R.id.checkedTextView8);
        mCheckedTextView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView8.isChecked()) {
                    mCheckedTextView8.setChecked(false);
                    mCheckedTextView8.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Food Tech");
                    user1.setSubjectsFoodTech(false);
                } else

                {
                    mCheckedTextView8.setChecked(true);
                    mCheckedTextView8.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Food Tech");
                    user1.setSubjectsFoodTech(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView9 = (CheckedTextView)v.findViewById(R.id.checkedTextView9);
        mCheckedTextView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView9.isChecked()) {
                    mCheckedTextView9.setChecked(false);
                    mCheckedTextView9.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("French");
                    user1.setSubjectsFrench(false);
                } else

                {
                    mCheckedTextView9.setChecked(true);
                    mCheckedTextView9.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("French");
                    user1.setSubjectsFrench(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView10 = (CheckedTextView)v.findViewById(R.id.checkedTextView10);
        mCheckedTextView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView10.isChecked()) {
                    mCheckedTextView10.setChecked(false);
                    mCheckedTextView10.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Geography");
                    user1.setSubjectsGeography(false);
                } else

                {
                    mCheckedTextView10.setChecked(true);
                    mCheckedTextView10.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Geography");
                    user1.setSubjectsGeography(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView11 = (CheckedTextView)v.findViewById(R.id.checkedTextView11);
        mCheckedTextView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView11.isChecked()) {
                    mCheckedTextView11.setChecked(false);
                    mCheckedTextView11.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("German");
                    user1.setSubjectsGerman(false);
                } else

                {
                    mCheckedTextView11.setChecked(true);
                    mCheckedTextView11.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("German");
                    user1.setSubjectsGerman(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView12 = (CheckedTextView)v.findViewById(R.id.checkedTextView12);
        mCheckedTextView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView12.isChecked()) {
                    mCheckedTextView12.setChecked(false);
                    mCheckedTextView12.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("History");
                    user1.setSubjectsHistory(false);
                } else

                {
                    mCheckedTextView12.setChecked(true);
                    mCheckedTextView12.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("History");
                    user1.setSubjectsHistory(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView13 = (CheckedTextView)v.findViewById(R.id.checkedTextView13);
        mCheckedTextView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView13.isChecked()) {
                    mCheckedTextView13.setChecked(false);
                    mCheckedTextView13.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("I.T.");
                    user1.setSubjectsIT(false);
                } else

                {
                    mCheckedTextView13.setChecked(true);
                    mCheckedTextView13.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("I.T.");
                    user1.setSubjectsIT(true);

                }

            }
        });

        final CheckedTextView mCheckedTextView14 = (CheckedTextView)v.findViewById(R.id.checkedTextView14);
        mCheckedTextView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView14.isChecked()) {
                    mCheckedTextView14.setChecked(false);
                    mCheckedTextView14.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Latin");
                    user1.setSubjectsLatin(false);
                } else

                {
                    mCheckedTextView14.setChecked(true);
                    mCheckedTextView14.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Latin");
                    user1.setSubjectsLatin(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView15 = (CheckedTextView)v.findViewById(R.id.checkedTextView15);
        mCheckedTextView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView15.isChecked()) {
                    mCheckedTextView15.setChecked(false);
                    mCheckedTextView15.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Maths");
                    user1.setSubjectsMaths(false);
                } else

                {
                    mCheckedTextView15.setChecked(true);
                    mCheckedTextView15.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Maths");
                    user1.setSubjectsMaths(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView16 = (CheckedTextView)v.findViewById(R.id.checkedTextView16);
        mCheckedTextView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView16.isChecked()) {
                    mCheckedTextView16.setChecked(false);
                    mCheckedTextView16.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Music");
                    user1.setSubjectsMusic(false);
                } else

                {
                    mCheckedTextView16.setChecked(true);
                    mCheckedTextView16.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Music");
                    user1.setSubjectsMusic(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView17 = (CheckedTextView)v.findViewById(R.id.checkedTextView17);
        mCheckedTextView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView17.isChecked()) {
                    mCheckedTextView17.setChecked(false);
                    mCheckedTextView17.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Music Tech");
                    user1.setSubjectsMusicTech(false);
                } else

                {
                    mCheckedTextView17.setChecked(true);
                    mCheckedTextView17.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Music Tech");
                    user1.setSubjectsMusicTech(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView18 = (CheckedTextView)v.findViewById(R.id.checkedTextView18);
        mCheckedTextView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView18.isChecked()) {
                    mCheckedTextView18.setChecked(false);
                    mCheckedTextView18.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("P.E.");
                    user1.setSubjectsPE(false);
                } else

                {
                    mCheckedTextView18.setChecked(true);
                    mCheckedTextView18.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("P.E.");
                    user1.setSubjectsPE(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView19 = (CheckedTextView)v.findViewById(R.id.checkedTextView19);
        mCheckedTextView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView19.isChecked()) {
                    mCheckedTextView19.setChecked(false);
                    mCheckedTextView19.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Physics");
                    user1.setSubjectsPhysics(false);
                } else

                {
                    mCheckedTextView19.setChecked(true);
                    mCheckedTextView19.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Physics");
                    user1.setSubjectsPhysics(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView20 = (CheckedTextView)v.findViewById(R.id.checkedTextView20);
        mCheckedTextView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView20.isChecked()) {
                    mCheckedTextView20.setChecked(false);
                    mCheckedTextView20.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Politics");
                    user1.setSubjectsPolitics(false);
                } else

                {
                    mCheckedTextView20.setChecked(true);
                    mCheckedTextView20.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Politics");
                    user1.setSubjectsPolitics(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView21 = (CheckedTextView)v.findViewById(R.id.checkedTextView21);
        mCheckedTextView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView21.isChecked()) {
                    mCheckedTextView21.setChecked(false);
                    mCheckedTextView21.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Psychology");
                    user1.setSubjectsPsychology(false);
                } else

                {
                    mCheckedTextView21.setChecked(true);
                    mCheckedTextView21.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Psychology");
                    user1.setSubjectsPsychology(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView22 = (CheckedTextView)v.findViewById(R.id.checkedTextView22);
        mCheckedTextView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView22.isChecked()) {
                    mCheckedTextView22.setChecked(false);
                    mCheckedTextView22.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("R.S.");
                    user1.setSubjectsRS(false);
                } else

                {
                    mCheckedTextView22.setChecked(true);
                    mCheckedTextView22.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("R.S.");
                    user1.setSubjectsRS(true);
                }

            }
        });

        final CheckedTextView mCheckedTextView23 = (CheckedTextView)v.findViewById(R.id.checkedTextView23);
        mCheckedTextView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckedTextView23.isChecked()) {
                    mCheckedTextView23.setChecked(false);
                    mCheckedTextView23.setCheckMarkDrawable(R.drawable.uncheckedbox);
                    Subjects.remove("Spanish");
                    user1.setSubjectsSpanish(false);
                } else

                {
                    mCheckedTextView23.setChecked(true);
                    mCheckedTextView23.setCheckMarkDrawable(R.drawable.checkedbox);
                    Subjects.add("Spanish");
                    user1.setSubjectsSpanish(true);
                }

            }
        });


        return v;
    }

}

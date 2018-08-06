package io.github.burningdzire.dynamicfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SimpleFragment extends Fragment {

    public SimpleFragment() {
        // Required empty public constructor
    }

    public static SimpleFragment newInstance() {
        SimpleFragment fragment = new SimpleFragment();
        return fragment;
    }

    private static final int YES = 1;
    private static final int NO = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_simple, container, false);
        final RadioGroup radioGroup = (RadioGroup) rootView.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                View radioButton = radioGroup.findViewById(checkId);
                int index = radioGroup.indexOfChild(radioButton);

                TextView fragmentHeader = (TextView) rootView.findViewById(R.id.tv_fragment_header);

                switch (index)
                {
                    case YES:
                        fragmentHeader.setText(R.string.yes_message);
                        break;
                    case NO:
                        fragmentHeader.setText(R.string.no_message);
                        break;
                    default:
                        break;
                }
            }
        });

        return rootView;
    }

}

package za.co.ridewith.ridewith;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

/**
 * Created by erra_ on 10/17/2016.
 */

public class FindRideFragment extends Fragment {

    View findRideView;
    Button findRideBtn;
    EditText destinationTxtEdit;
    FrameLayout frame_1;
    FrameLayout frame_2;
    FragmentManager fragmentManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        findRideView = inflater.inflate(R.layout.findride_layout, container, false);
        InitUI();
        return findRideView;
    }

    public void InitUI()
    {
        // Get References to UI Elements
        frame_1 = (FrameLayout) findRideView.findViewById(R.id.frame_1);
        frame_2 = (FrameLayout) findRideView.findViewById(R.id.frame_2);
        findRideBtn = (Button) findRideView.findViewById(R.id.button2);
        destinationTxtEdit = (EditText) findRideView.findViewById(R.id.editText);

        // Assign OnClick Actions
        findRideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFindRideButtonClicked();
                findRideView.clearFocus();
            }
        });

        destinationTxtEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFindRideButtonClicked();
                findRideView.clearFocus();
            }
        });
    }

    public void onFindRideButtonClicked()
    {
    }
}

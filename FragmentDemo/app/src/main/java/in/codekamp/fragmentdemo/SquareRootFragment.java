package in.codekamp.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by cerebro on 23/06/16.
 */
public class SquareRootFragment extends Fragment implements View.OnClickListener {

    private TextView mResultTextView;
    private EditText mNumberEditText;
    private Button mCalculateButton;

    public SquareRootFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_squre_root, container, false);

        mResultTextView = (TextView) view.findViewById(R.id.square_root_result);
        mNumberEditText = (EditText) view.findViewById(R.id.value_edit_text);
        mCalculateButton = (Button)view.findViewById(R.id.calculate_button);

        mCalculateButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(mNumberEditText.getText().toString());

        double result = Math.sqrt(number);

        mResultTextView.setText(Double.toString(result));
    }
}

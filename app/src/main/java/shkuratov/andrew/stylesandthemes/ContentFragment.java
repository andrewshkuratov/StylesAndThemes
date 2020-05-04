package shkuratov.andrew.stylesandthemes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Date;

public class ContentFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmeny_content, container, false);
        Button updateButton = (Button) view.findViewById(R.id.updateButton);
        final TextView updateBox = (TextView) view.findViewById(R.id.textBox);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curDate = new Date().toString();
                updateBox.setText(curDate);

            }
        });
        return view;
    }
}

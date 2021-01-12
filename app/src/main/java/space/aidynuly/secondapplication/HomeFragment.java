package space.aidynuly.secondapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home,container,false);
        int[] btns={R.id.btnToyota,R.id.btnLada,R.id.btnMercedes};
        Button[] buttons=new Button[btns.length];
        for(int i =0;i<btns.length;i++){
            buttons[i]=v.findViewById(btns[i]);
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Marks.class);
                    startActivity(intent);
                }
            });
        }
        return v;
    }

}

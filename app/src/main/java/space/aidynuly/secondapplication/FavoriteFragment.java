package space.aidynuly.secondapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FavoriteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorites,container,false);
        ArrayList<String> data=new ArrayList<String>();
        data.add("Corolla");
        data.add("Camry");
        data.add("Rio");
        data.add("Cerato");
        data.add("Outlander");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,data);
        ListView listView = view.findViewById(R.id.favorite_listview);
        listView.setAdapter(arrayAdapter);
        return view;
    }
}

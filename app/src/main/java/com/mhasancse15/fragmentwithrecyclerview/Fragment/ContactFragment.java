package com.mhasancse15.fragmentwithrecyclerview.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mhasancse15.fragmentwithrecyclerview.Adapter.RecycleViewAdapter;
import com.mhasancse15.fragmentwithrecyclerview.Model.Contact;
import com.mhasancse15.fragmentwithrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private List<Contact> contactList;


    public ContactFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.contact_fragment, container, false);
        recyclerView = view.findViewById(R.id.call_recycleView);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(getContext(), contactList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recycleViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        contactList = new ArrayList<>();
        contactList.add(new Contact("Mahmudul", "017470387258", R.drawable.man));
        contactList.add(new Contact("Mahmudul", "017470387258", R.drawable.man));
        contactList.add(new Contact("Mahmudul", "017470387258", R.drawable.man));
        contactList.add(new Contact("Mahmudul", "017470387258", R.drawable.man));


    }
}

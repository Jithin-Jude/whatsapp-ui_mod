package mod_challenge.whatsapp_ui_modification;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentChat extends Fragment {
    private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ChatListAdapter mAdapter;

    public FragmentChat(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(mod_challenge.whatsapp_ui_modification.R.layout.fragment_chat, container, false);;
        recyclerView =view.findViewById(mod_challenge.whatsapp_ui_modification.R.id.recyclerView);

        mAdapter = new ChatListAdapter(contactList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        dummyData();
        return view;
    }

    private void dummyData() {
        Contact contact = new Contact("Thor");
        contactList.add(contact);
        contact = new Contact("Iron Man");
        contactList.add(contact);
        contact = new Contact("Doctor Strange");
        contactList.add(contact);
        contact = new Contact("Captain America");
        contactList.add(contact);
        contact = new Contact("Hulk");
        contactList.add(contact);
        contact = new Contact("Black Widow");
        contactList.add(contact);
        contact = new Contact("Scarlet Witch");
        contactList.add(contact);
        for(int i=0;i<20;i++) {
            contact = new Contact("Avengers");
            contactList.add(contact);
        }
        mAdapter.notifyDataSetChanged();
    }

}

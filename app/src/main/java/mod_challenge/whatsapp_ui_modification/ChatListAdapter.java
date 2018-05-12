package mod_challenge.whatsapp_ui_modification;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.MyViewHolder> {

    private List<Contact> contactList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView contactTv;
        public MyViewHolder(View itemView) {
            super(itemView);
            contactTv = itemView.findViewById(mod_challenge.whatsapp_ui_modification.R.id.tv_contact);
        }
    }

    public ChatListAdapter(List<Contact> contactList){
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(mod_challenge.whatsapp_ui_modification.R.layout.contact_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.contactTv.setText(contact.getPerson());

    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }
}

package setiaendra18.gmail.com.akakommobile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by putri on 18/12/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactVh> {


    private List<Contact> contacts = new ArrayList<>();

    private Context context;

    public ContactAdapter(Context context) {
        this.context = context;

        contacts = Contact.prepareContacts(
                context.getResources().getStringArray(R.array.contact_names),
                context.getResources().getStringArray(R.array.contact_email));
    }

    @Override
    public ContactVh onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_contact, parent, false);
        return new ContactAdapter.ContactVh(view);
    }

    @Override
    public void onBindViewHolder(ContactVh holder, int position) {
        Contact contact = contacts.get(position);

        holder.mName.setText(contact.getName());
        holder.mEmail.setText(contact.getEmail());
        holder.mFirstLetter.setText(String.valueOf(contact.getFirstLetter()));

    }

    @Override
    public int getItemCount() {
        return contacts == null ? 0 : contacts.size();
    }

    public static class ContactVh extends RecyclerView.ViewHolder {

        private TextView mName;
        private TextView mEmail;
        private TextView mFirstLetter;

        public ContactVh(View itemView) {
            super(itemView);

            mName = (TextView) itemView.findViewById(R.id.txt_name);
            mEmail = (TextView) itemView.findViewById(R.id.txt_email);
            mFirstLetter = (TextView) itemView.findViewById(R.id.txt_firstletter);
        }
    }
}

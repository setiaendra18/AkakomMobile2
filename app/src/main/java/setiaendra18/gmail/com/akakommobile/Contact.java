package setiaendra18.gmail.com.akakommobile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by putri on 18/12/2017.
 */

public class Contact {
    private String name;
    private String email;
    private String firstLetter;

    public Contact(String name, String email) {
        this.name = name;
        this.firstLetter = String.valueOf(name.charAt(0));
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email= email;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public static List<Contact> prepareContacts(String[] names, String[] email) {
        List<Contact> contacts = new ArrayList<>(names.length);

        for (int i = 0; i < names.length; i++) {
            Contact contact = new Contact(names[i], email[i]);
            contacts.add(contact);
        }

        return contacts;
    }


}

import java.util.ArrayList;

public class ABook {
    private ArrayList<String> contacts = new ArrayList<String>();

    public ABook() {
        this.contacts = contacts;
    }

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "ABook{" +
                "contacts=" + contacts +
                '}';
    }

    public void addContact(Contact a){
        this.contacts.add(a.getName() + " at " + a.getEmail());
    }

}

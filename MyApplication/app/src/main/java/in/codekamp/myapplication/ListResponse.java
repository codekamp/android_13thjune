
package in.codekamp.myapplication;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListResponse {

    @SerializedName("data")
    @Expose
    private List<ContactList> contactLists = new ArrayList<ContactList>();

    public List<ContactList> getContactLists() {
        return contactLists;
    }

    public void setContactLists(List<ContactList> contactLists) {
        this.contactLists = contactLists;
    }
}

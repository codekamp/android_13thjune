package in.codekamp.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by cerebro on 05/07/16.
 */
public class Profile {
    @SerializedName("EMAIL")
    @Expose
    private String email;
    @SerializedName("FNAME")
    @Expose
    private String firstName;

    @SerializedName("LNAME")
    @Expose
    private String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

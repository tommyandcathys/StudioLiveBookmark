package smithware.com.studiolivebookmark;

/**
 * Created by Tommy on 2/18/2015.
 * verse code used for arrayadapter
 */
public class verse {
    public verse(String text,String address, String description){
        this.setText(text);
        this.setAddress(address);
        this.setDescription(description);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String text;
    public String address;
    public String description;
}

package mod_challenge.whatsapp_ui_modification;

public class Contact {
    private String person,lastMsg,time;
    private int displayPicture;

    public Contact(String person){
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDisplayPicture() {
        return displayPicture;
    }

    public void setDisplayPicture(int displayPicture) {
        this.displayPicture = displayPicture;
    }
}

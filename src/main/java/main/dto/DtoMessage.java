package main.dto;

public class DtoMessage {

    private String text;

    private String datetime;

    private String username;

    public DtoMessage(){

    }

    public DtoMessage(String text, String datetime, String username) {
        this.text = text;
        this.datetime = datetime;
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
